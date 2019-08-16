package services;

import classes.Result;
import models.cart.ShoppingCartModel;
import models.menu.ItemModel;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartService extends BaseService {

    public static List<ShoppingCartModel> shoppingCartList = new ArrayList<ShoppingCartModel>();

    public ShoppingCartModel addToShoppingCart(int id, ItemModel item){
        ShoppingCartModel shoppingCartModel = null;

        if (id > 0) {
            for (int i = 0; i < shoppingCartList.size(); i++) {
                if (shoppingCartList.get(i).getId() == id)
                    shoppingCartModel = shoppingCartList.get(i);
            }
        }

        if (shoppingCartModel == null) {
            shoppingCartModel = new ShoppingCartModel();
            shoppingCartModel.setId(shoppingCartList.size() + 1);
            shoppingCartList.add(shoppingCartModel);
        }

        shoppingCartModel.getItems().add(item);

        return shoppingCartModel;
    }

    public ShoppingCartModel getShoppingCart(int id){
        ShoppingCartModel shoppingCartModel = null;
        if (id > 0) {
            for (int i = 0; i < shoppingCartList.size(); i++) {
                if (shoppingCartList.get(i).getId() == id)
                    shoppingCartModel = shoppingCartList.get(i);
            }
        }

        if (shoppingCartModel == null) {
            shoppingCartModel = new ShoppingCartModel();
        }
        return shoppingCartModel;
    }

    public Result deleteFromShoppingCart(int id, int itemId) {
        ShoppingCartModel shoppingCartModel = null;

        if (id > 0) {
            for (int i = 0; i < shoppingCartList.size(); i++) {
                if (shoppingCartList.get(i).getId() == id)
                    shoppingCartModel = shoppingCartList.get(i);
            }
        }

        if (shoppingCartModel != null) {
            for (int i = 0; i < shoppingCartModel.getItems().size(); i++) {
                if (shoppingCartModel.getItems().get(i).getId() == itemId) {
                    shoppingCartModel.getItems().remove(i);
                    return new Result();
                }
            }
        }
        return new Result("Shopping cart is empty");

    }

}
