package controllers.adminTasks;

import classes.PogoServlet;
import models.users.UserType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MenuControllerServlet", urlPatterns = "/admin_menu")
public class MenuControllerServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String menuNam = request.getParameter("menuName");
        String menuDescription = request.getParameter("menuDescription");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("containt",);
        forward("/pages/adminTaskPages/menu.jsp", request, response);
    }
}
