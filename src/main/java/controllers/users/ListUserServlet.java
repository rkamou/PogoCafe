package controllers.users;

import classes.PogoServlet;
import classes.Result;
import models.dao.TestData;
import models.users.UserModel;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list-user")
public class ListUserServlet extends PogoServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService service = new UserService();
        List<UserModel> users = service.getUsersList();
        request.setAttribute("users", users);

        forward("/pages/users/listUsers.jsp", request, response);
    }
}
