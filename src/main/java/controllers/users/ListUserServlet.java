package controllers.users;

import classes.PogoServlet;
import classes.Result;
import models.dao.TestData;
import models.users.UserModel;
import models.users.UserType;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/list-user")
public class ListUserServlet extends PogoServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (!isLoggedin(request)) forward("/pages/home/noAccess.jsp", request, response);
        UserService service = new UserService();
        List<UserModel> users = service.getUsersList();
        request.setAttribute("users", users);

        forward("/pages/users/listUsers.jsp", request, response);
    }
}
