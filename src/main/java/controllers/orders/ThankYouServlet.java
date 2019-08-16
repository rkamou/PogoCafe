package controllers.orders;

import classes.OrderStatus;
import classes.PogoServlet;
import classes.Result;
import models.cart.ShoppingCartModel;
import models.orders.OrderModel;
import services.OrderService;
import services.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/thank-you")
public class ThankYouServlet extends PogoServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        forward("/pages/checkout/thankYou.jsp", request, response);
    }
}
