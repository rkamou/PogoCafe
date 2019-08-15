package controllers.home;

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

@WebServlet("/adduser")
public class AddUserServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        UserService service = new UserService();
        String id = getParamString("id", request);
        String firstname = getParamString("firstName", request);
        String lastname = getParamString("lastName", request);
        String loginname = getParamString("loginName", request);
        String password = getParamString("password", request);
        String role = getParamString("role", request);
        System.out.println(UserType.valueOf(role));

        UserModel newUser = new UserModel(id, firstname, lastname, loginname, password, UserType.valueOf(role));

        System.out.println(newUser.toString());

        String resultMessage;
        if (service.addUser(newUser)) {
            resultMessage = "User added";
        } else {
            resultMessage = "User not added!";
        }

        writeJson(resultMessage, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        forward("/pages/home/adduser.jsp", request, response);
    }
}
