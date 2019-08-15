package controllers.menu;

import classes.PogoServlet;
import classes.Result;
import services.MenuService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/item-delete")
public class ItemDeleteServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = getParamInt("id", request);

        MenuService service = new MenuService();
        Result result = service.itemDelete(id);

        writeJson(result, response);
    }
}
