package controllers.users;

import classes.PogoServlet;
import classes.Result;
import models.users.UserModel;
import models.users.UserType;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/edit-user")
public class EditUserServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        UserService service = new UserService();
        int id = getParamInt("id", request);
        String firstName = getParamString("firstName", request);
        String lastName = getParamString("lastName", request);
        String userName = getParamString("userName", request);
        String password = getParamString("password", request);
        String userRole = getParamString("role", request);

        UserModel model = new UserModel(id, firstName, lastName, userName, password, UserType.valueOf(userRole));

        Result result = service.editUser(model);

        writeJson(result, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (!haveIAccess(UserType.ADMIN, request)) forward("/pages/home/noAccess.jsp", request, response);

        int id = getParamInt("id", request);

        UserService service = new UserService();
        UserModel userModel = service.getUser(id);

        request.setAttribute("model", userModel);

        forward("/pages/users/editUser.jsp", request, response);
    }
}
