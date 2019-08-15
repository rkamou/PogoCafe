package controllers.orders;

import classes.PogoServlet;
import classes.Result;
import models.cart.ShoppingCartModel;
import models.menu.ItemModel;
import services.MenuService;
import services.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.geom.RectangularShape;
import java.io.IOException;

@WebServlet("/add-to-cart")

public class AddToShoppingCartServlet extends PogoServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int shoppingCartId = 0;
        if (request.getSession().getAttribute("shoppingCartId") != null) {
            shoppingCartId = Integer.parseInt(request.getSession().getAttribute("shoppingCartId").toString());
        }

        int itemId = getParamInt("itemId", request);
        MenuService menuService = new MenuService();
        ItemModel itemModel = menuService.getItem(itemId);

        ShoppingCartService service = new ShoppingCartService();
        ShoppingCartModel model = service.addToShoppingCart(shoppingCartId, itemModel);

        if (shoppingCartId == 0) {
            request.getSession().setAttribute("shoppingCartId", model.getId());
        }
        writeJson(new Result(), response);
    }
}
