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

@WebServlet("/menu-delete")
public class MenuDeleteServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = 0;
        if (request.getParameter("id") != null) id = Integer.parseInt(request.getParameter("id"));

        MenuService service = new MenuService();
        Result result = service.menuDelete(id);

        writeJson(result, response);

        // response.setContentType("application/json");
        // response.setCharacterEncoding("UTF-8");
        // PrintWriter out = response.getWriter();
        // out.write(new Gson().toJson(result));


    }
}
