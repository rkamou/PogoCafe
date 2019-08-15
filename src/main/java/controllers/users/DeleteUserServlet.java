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
import java.io.IOException;

@WebServlet("/delete-user")
public class DeleteUserServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        UserService service = new UserService();
        int id = getParamInt("id", request);
        Result result = service.deleteUser(id);

        writeJson(result, response);
    }
}
