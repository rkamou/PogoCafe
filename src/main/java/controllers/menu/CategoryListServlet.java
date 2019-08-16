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

@WebServlet("/category-list")
public class CategoryListServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String menuName = getParamString("menuName", request);

        MenuService service = new MenuService();
        List<CategoryModel> result = service.getCategoryList(menuName);

        writeJson(result, response);
    }
}
