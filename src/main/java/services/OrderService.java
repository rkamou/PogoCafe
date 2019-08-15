package services;

import classes.Result;
import models.orders.OrderModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderService extends BaseService {

    public static List<OrderModel> orderModelList = new ArrayList<OrderModel>();



    public Result  orderCreateorEdit( OrderModel model){
        Result result = new Result();
        if (model == null) return  new Result("Model is null");
        try {
            if (model.getId() == 0) {
                // creating
                // dbOrders().create(model);
                result.setId(model.getId());
            } else {
                // editing
                // if (!dbOrders().idExists(model.getId())) return new Result("Cannot find order with id: " + model.getId());
                //  dbOrders().update(model);

            }
        } catch (Exception ex){
            result.addError(ex);
        }

        return  result;
    }


    // Delete Order by Id
    public Result orderDelete(int id){
        Result result = new Result();
        // deleting
        try {
            // if (!dbOrders().idExists(id)) return new Result("Cannot find order with id: " + id);
            // dbOrders().deleteById(id);
        }
        catch (Exception ex){
            result.addError(ex);
        }
        return result;
    }

    //Get Order
    public   List<OrderModel> getOrderList(){
        List<OrderModel> list = null;

        // try {
        //     // list =  dbOrders().queryForAll();
        // } catch (SQLException e) {
        //     e.printStackTrace();
        // }
        return list;
    }

}