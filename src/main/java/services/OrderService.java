package services;

import classes.Np;
import classes.OrderStatus;
import classes.Result;
import models.menu.CategoryModel;
import models.orders.OrderModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService extends BaseService {
    public OrderModel getOrder(int id) {
        try {
            return getOrderList().stream().filter(x -> x.getId() == id).findFirst().get();
        } catch (Exception ex) {
            System.out.println("Error: OrderService.getOrder() " + ex);
            return null;
        }
    }

    public Result addOrder(OrderModel model) {
        if (model == null) return new Result("Model is null");

        Result result = new Result();
        if (model.getFirstName().isEmpty()) result.addError("Please fill first name");
        if (model.getLastName().isEmpty()) result.addError("Please fill last name");
        if (model.getAdresse1().isEmpty()) result.addError("Please fill Address 1");
        if (!result.isSuccess()) return result;

        try {
            model.setId(getNextOrderId());
            model.setStatus(OrderStatus.ORDERED);
            model.setTotalAmount(model.getListItem().stream().map(x->x.getPrice()).reduce((aDouble, aDouble2) -> aDouble+aDouble2).orElse(0.0));
            getOrderList().add(model);
            result.setId(model.getId());
            saveOrdersChanges();
        } catch (Exception ex) {
            result.addError(ex);
        }

        return result;
    }

    public Result changeOrderStatus(int id, OrderStatus status) {
        Result result = new Result();

        try {
            if (!getOrderList().stream().anyMatch(x -> x.getId() == id)) return new Result("Cannot find order with id: " + id);
            OrderModel entity = getOrderList().stream().filter(x -> x.getId() == id).findFirst().get();
            entity.setStatus(status);
            saveOrdersChanges();
        } catch (Exception ex) {
            result.addError(ex);
        }
        return result;
    }
}