package controllers.menu;

import classes.PogoServlet;
import classes.Result;
import services.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menu-delete")
public class MenuDeleteServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = getParamInt("id", request);

        MenuService service = new MenuService();
        Result result = service.menuDelete(id);

        writeJson(result, response);
    }
}
