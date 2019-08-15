package controllers.menu;

import classes.PogoServlet;
import models.menu.CategoryModel;
import services.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/category-get")
public class CategoryGetServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = getParamInt("id", request);

        MenuService service = new MenuService();
        CategoryModel result = service.getCategory(id);

        writeJson(result, response);
    }
}
