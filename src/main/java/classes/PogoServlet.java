package classes;

import com.google.gson.Gson;
import models.users.UserModel;
import models.users.UserType;
import services.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class PogoServlet extends HttpServlet {
    public int getParamInt(String paramName, HttpServletRequest request) {
        return getParamInt(paramName, request, 0);
    }

    public int getParamInt(String paramName, HttpServletRequest request, int defaultValue) {
        if (request.getParameter(paramName) != null) {
            try {
                return Integer.parseInt(request.getParameter(paramName));
            } catch (Exception ex) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    public String getParamString(String paramName, HttpServletRequest request) {
        return getParamString(paramName, request, "");
    }

    public String getParamString(String paramName, HttpServletRequest request, String defaultValue) {
        if (request.getParameter(paramName) != null) {
            return request.getParameter(paramName);
        }
        return defaultValue;
    }

    public boolean getParamBool(String paramName, HttpServletRequest request) {
        return getParamBool(paramName, request);
    }

    public boolean getParamBool(String paramName, HttpServletRequest request, boolean defaultValue) {
        if (request.getParameter(paramName) != null) {
            try {
                return Boolean.parseBoolean(request.getParameter(paramName));
            } catch (Exception ex) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    public double getParamDouble(String paramName, HttpServletRequest request) {
        return getParamDouble(paramName, request, 0.0);
    }

    public double getParamDouble(String paramName, HttpServletRequest request, double defaultValue) {
        if (request.getParameter(paramName) != null) {
            try {
                return Double.parseDouble(request.getParameter(paramName));
            } catch (Exception ex) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    public void writeJson(Object object, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.write(new Gson().toJson(object));
    }

    public void forward(String page, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher(page);
        view.forward(request, response);
    }

    public boolean haveIAccess(UserType userType, HttpServletRequest request){
        boolean loggedIn = false;
        HttpSession session = request.getSession();
        if (session.getAttribute("loginStatus") != null)
            loggedIn = session.getAttribute("loginStatus").equals("loggedin");

        if (loggedIn){
            if (session.getAttribute("userType") != null){
                return userType.toString() == session.getAttribute("userType").toString();
            }
        }

        return false;
    }
}
