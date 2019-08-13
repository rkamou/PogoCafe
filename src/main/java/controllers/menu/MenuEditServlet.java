package controllers.menu;

import classes.PogoServlet;
import classes.Result;
import com.google.gson.Gson;
import models.menu.MenuModel;
import services.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/menu-edit")
public class MenuEditServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MenuModel model = new MenuModel();
        if (request.getParameter("id") != null) model.setId(Integer.parseInt(request.getParameter("id")));
        if (request.getParameter("name") != null) model.setName(request.getParameter("name"));

        MenuService service = new MenuService();
        Result result = service.menuEdit(model);

        writeJson(result, response);
    }
}
