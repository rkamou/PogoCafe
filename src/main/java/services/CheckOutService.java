package services;

import classes.Result;
import models.cart.ShoppingCartModel;
import models.menu.ItemModel;
import models.model.CheckoutModel;

import java.util.ArrayList;
import java.util.List;

public class CheckOutService extends  BaseService{

    public static List<CheckoutModel> checkoutlist = new ArrayList<CheckoutModel>();

    public CheckoutModel addToCheckout(CheckoutModel chmodl, ShoppingCartModel cards){

        CheckoutModel checkoutModel = null;

//        if (id > 0) {
//            for (int i = 0; i < shoppingCartList.size(); i++) {
//                if (shoppingCartList.get(i).getId() == id)
//                    shoppingCartModel = shoppingCartList.get(i);
//            }
//        }

        if (checkoutModel == null) {
            checkoutModel = new CheckoutModel();
            checkoutModel.setId(checkoutlist.size() + 1);
            checkoutlist.add( checkoutModel);
        }

        checkoutModel.getCartItem().add(cards);

        return checkoutModel;
    }






    public boolean checkOut(){
//        int orderId = getId();
//        if(orderId == 0)
//            return true;
//
        return false;
    }

}
