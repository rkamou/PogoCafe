package controllers.home;

import classes.PogoServlet;
import classes.Result;
import com.google.gson.Gson;
import services.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = getParamString("userName", request);
        String password = getParamString("password", request);

        UserService service = new UserService();
        Result result = service.login(userName, password);

        writeJson(result, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        forward("/pages/home/login.jsp", request, response);
    }
}
