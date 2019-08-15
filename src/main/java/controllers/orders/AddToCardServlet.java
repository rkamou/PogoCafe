package controllers.orders;

import classes.PogoServlet;
import models.menu.ItemModel;
import services.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddToCardServlet")

public class AddToCardServlet extends PogoServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = getParamInt("id", request);

        MenuService service = new MenuService();
        ItemModel result = service.getItem(id);

        writeJson(result, response);
    }

}
