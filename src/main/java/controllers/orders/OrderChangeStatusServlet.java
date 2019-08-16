package controllers.orders;

import classes.OrderStatus;
import classes.PogoServlet;
import classes.Result;
import services.OrderService;
import services.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/order-change-status")

public class OrderChangeStatusServlet extends PogoServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = getParamInt("id", request);
        String status = getParamString("status", request);

        OrderService service = new OrderService();
        Result result = service.changeOrderStatus(id, OrderStatus.valueOf(status));

        writeJson(result, response);
    }
}
