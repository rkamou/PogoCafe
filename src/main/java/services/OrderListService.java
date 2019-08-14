package services;

import models.orders.OrderModel;
import java.util.ArrayList;
import java.util.List;

public class OrderListService {
    private List<OrderModel> orderModelList = new ArrayList<OrderModel>();


    //Create order list
    public  void createOrderlist(){
        orderModelList.add(new OrderModel());
    }

    //Get Order
    private  List<OrderModel> getOrderList(){
        return  orderModelList;
    }

}