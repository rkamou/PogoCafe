package orders;

import models.cart.ShoppingCartModel;
import models.menu.ItemModel;
import org.junit.Test;
import services.MenuService;
import services.ShoppingCartService;

public class ShopppingCart {

    @Test
    public void ShoppingCartTest(){


        ShoppingCartService service = new ShoppingCartService();
        service.addToShoppingCart(0, MenuService.itemModelList.get(0));
        service.addToShoppingCart(1, MenuService.itemModelList.get(1));

        service.addToShoppingCart(0, MenuService.itemModelList.get(0));


        for (ShoppingCartModel s: service.shoppingCartList) {
            System.out.println("Cart id: " + s.getId());
            for(ItemModel i: s.getItems()) {
                System.out.println(i.getName());
            }
        }
    }
}
