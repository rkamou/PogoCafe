package controllers.orders;

import classes.PogoServlet;
import classes.Result;
import models.cart.ShoppingCartModel;
import models.menu.ItemModel;
import services.MenuService;
import services.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-from-cart")

public class DeleteFromShoppingCartServlet extends PogoServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int shoppingCartId = 0;
        if (request.getSession().getAttribute("shoppingCartId") != null) {
            shoppingCartId = Integer.parseInt(request.getSession().getAttribute("shoppingCartId").toString());
        }

        int itemId = getParamInt("itemId", request);

        ShoppingCartService service = new ShoppingCartService();
        Result result = service.deleteFromShoppingCart(shoppingCartId, itemId);

        writeJson(result, response);
    }
}
