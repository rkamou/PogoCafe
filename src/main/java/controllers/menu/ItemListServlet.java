package controllers.menu;

import classes.PogoServlet;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import services.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/item-list")
public class ItemListServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MenuService service = new MenuService();
        List<ItemModel> result = service.getItemList();

        writeJson(result, response);
    }
}
