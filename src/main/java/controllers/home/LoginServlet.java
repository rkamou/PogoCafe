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
//        String userName = request.getParameter("userName");
//        String password = request.getParameter("password");
//
//        UserService service = new UserService();
//        Result result = service.login(userName, password);

        Result result = new Result();
        result.addError("This error");

        writeJson(result, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("/pages/home/login.jsp");
        view.forward(request, response);
    }
}
