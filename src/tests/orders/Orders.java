package orders;

import models.menu.ItemModel;
import models.orders.OrderModel;
import org.junit.Test;
import services.MenuService;
import services.OrderService;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Orders {
    @Test
    public void addOrder(){
        MenuService menuService = new MenuService();
        List<ItemModel> items = menuService.getItemList("breakfast");

        OrderModel orderModel = new OrderModel();
        orderModel.setId(0);
        orderModel.setFirstName("Rustem");
        orderModel.setLastName("Bayetov");

        List<ItemModel> newItems = new ArrayList<ItemModel>();
        for(ItemModel i : items.stream().limit(3).collect(Collectors.toList())) {
            newItems.add(i);
        }
        orderModel.setListItem(newItems);

        OrderService orderService = new OrderService();
        orderService.addOrder(orderModel);
    }

    @Test
    public void getOrdersList(){
        OrderService orderService = new OrderService();
        List<OrderModel> orders = orderService.getOrderList();

        if (orders.size() == 0) System.out.println("Nothing");

        for(OrderModel model: orders){
            System.out.println(model.getId() + " " + model.getFirstName() + " " + model.getListItem().size());
        }
    }
}
