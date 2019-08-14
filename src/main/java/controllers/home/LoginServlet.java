package controllers.home;

import classes.PogoServlet;
import classes.Result;
import services.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends PogoServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = getParamString("userName", request);
        String password = getParamString("password", request);
        HttpSession session = request.getSession();
//        System.out.println(userName + " " + password);
        UserService service = new UserService();
        Result result = service.login(userName, password);
        if (result.isSuccess()) {
            session.setAttribute("userType", result.getValue().getClass().getSimpleName());
            session.setAttribute("loginStatus", "loggedin");
//            System.out.println(result.isSuccess());
//            ServletContext servletContext = getServletContext();
//            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/index.html");
//            requestDispatcher.forward(request,response);
//            forward("index.html", request, response);
//            response.sendRedirect("/");
        }
//        } else {
//            request.setAttribute("loginMessage", "Username or password not correct!");
//            doGet(request, response);
//        }
        writeJson(result, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        forward("/pages/home/login.jsp", request, response);
    }
}
