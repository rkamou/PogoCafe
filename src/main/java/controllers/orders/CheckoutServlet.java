package controllers.orders;

import classes.OrderStatus;
import classes.PogoServlet;
import classes.Result;
import models.cart.ShoppingCartModel;
import models.orders.OrderModel;
import services.BaseService;
import services.OrderService;
import services.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/checkout")
public class CheckoutServlet extends PogoServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int shoppingCartId = 0;
        if (request.getSession().getAttribute("shoppingCartId") != null) {
            shoppingCartId = Integer.parseInt(request.getSession().getAttribute("shoppingCartId").toString());
        }

        ShoppingCartService service = new ShoppingCartService();
        ShoppingCartModel model = service.getShoppingCart(shoppingCartId);
        request.setAttribute("model_data", model.getItems());


        forward("/pages/checkout/checkout.jsp", request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int postshoppingCartId = 0;
        if (request.getSession().getAttribute("shoppingCartId") != null) {
            postshoppingCartId = Integer.parseInt(request.getSession().getAttribute("shoppingCartId").toString());
        }

        ShoppingCartService servicepost = new ShoppingCartService();
        ShoppingCartModel model = servicepost.getShoppingCart(postshoppingCartId);

        OrderModel chkmodel = new OrderModel();
        chkmodel.setFirstName(request.getParameter("firstName"));
        chkmodel.setZip(request.getParameter("zip"));
        chkmodel.setLastName(request.getParameter("lastName"));
        chkmodel.setUsername(request.getParameter("username"));
        chkmodel.setEmail(request.getParameter("email"));
        chkmodel.setAdresse1(request.getParameter("address"));
        chkmodel.setAdresse2(request.getParameter("address2"));
        chkmodel.setStatus(OrderStatus.ORDERED);

        chkmodel.setListItem(model.getItems());

        OrderService so = new OrderService();
        Result result = so.addOrder(chkmodel);
        if (result.isSuccess()) {
            request.getSession().setAttribute("shoppingCartId", null);
        }
        writeJson(result, response);
    }
}
