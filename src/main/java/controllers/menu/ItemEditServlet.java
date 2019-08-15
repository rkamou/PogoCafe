package controllers.menu;

import classes.PogoServlet;
import classes.Result;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import services.MenuService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/item-edit")
public class ItemEditServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ItemModel model = new ItemModel();
        model.setId(getParamInt("id", request));
        model.setName(getParamString("name", request));
        model.setIngredients(getParamString("ingredients", request));
        model.setPrice(getParamDouble("price", request));
        model.setPicture(getParamString("picture", request));
        model.setIdCategory(getParamInt("idCategory", request));

        MenuService service = new MenuService();
        Result result = service.itemEdit(model);

        writeJson(result, response);
    }
}
