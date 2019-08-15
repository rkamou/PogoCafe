package services;

import classes.Result;
import models.cart.ShoppingCartModel;
import models.menu.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartService extends BaseService {

    private static List<ShoppingCartModel> shoppingCartList = new ArrayList<ShoppingCartModel>();


    public Result shoppingCreateorEdit(){
        Result result = new Result();
//        //ShoppingCartServlet
//        if (model == null) return  new Result("Model is null");
//
//
//        try {
//            if (model.getId() == 0) {
//                // creating
//                sesion.setAttribute("datacart",model);
//
//                result.setId(model.getId());
//            } else {
//                // editing
//
//                // if (!dbOrders().idExists(model.getId())) return new Result("Cannot find order with id: " + model.getId());
//                // dbOrders().update(model);
//
//            }
//        } catch (Exception ex){
//            result.addError(ex);
//        }

        return  result;
    }


    public boolean checkOut(){
//        int orderId = getId();
//        if(orderId == 0)
//            return true;
//
        return false;
    }

}
