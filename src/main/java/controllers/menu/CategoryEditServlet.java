package controllers.menu;

import classes.PogoServlet;
import classes.Result;
import models.menu.CategoryModel;
import services.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/category-edit")
public class CategoryEditServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        CategoryModel model = new CategoryModel();
        model.setId(getParamInt("id", request));
        model.setName(getParamString("name", request));

        MenuService service = new MenuService();
        // Result result = service.menuEdit(model);

        // writeJson(result, response);
    }
}