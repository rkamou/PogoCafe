package controllers.orders;

import classes.PogoServlet;
import models.cart.ShoppingCartModel;
import models.dao.DataAccess;
import models.model.CheckoutModel;
import services.BaseService;
import services.CheckOutService;
import services.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/checkout")
public class CheckoutServlet extends PogoServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int shoppingCartId = 0;
        if (request.getSession().getAttribute("shoppingCartId") != null) {
            shoppingCartId = Integer.parseInt(request.getSession().getAttribute("shoppingCartId").toString());
        }
        ShoppingCartService service = new ShoppingCartService();
        ShoppingCartModel model = service.getShoppingCart(shoppingCartId);
        request.setAttribute("model_data", model.getItems());


        forward("/pages/checkout/checkout.jsp", request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int postshoppingCartId = 0;
        if (request.getSession().getAttribute("shoppingCartId") != null) {
            postshoppingCartId = Integer.parseInt(request.getSession().getAttribute("shoppingCartId").toString());
        }

        ShoppingCartService servicepost = new ShoppingCartService();
        ShoppingCartModel model = servicepost.getShoppingCart(postshoppingCartId);

        CheckoutModel chkmodel = new CheckoutModel();
        chkmodel.setFirstName(request.getParameter("firstName"));
        chkmodel.setZip(request.getParameter("zip"));
        chkmodel.setLastName(request.getParameter("lastName"));
        chkmodel.setUsername(request.getParameter("username"));
        chkmodel.setEmail(request.getParameter("email"));
        chkmodel.setAdresse1(request.getParameter("address"));
        chkmodel.setAdresse2(request.getParameter("address2"));

        chkmodel.setListItem(model.getItems());

        BaseService bao = new BaseService();
        chkmodel.setId(bao.getNextCheckOutId());
        List<CheckoutModel> checkoutModelList = bao.getCheckoutList();
        if (checkoutModelList != null) checkoutModelList = new ArrayList<CheckoutModel>();
        checkoutModelList.add(chkmodel);
        bao.saveCheckoutChanges();

        writeJson(chkmodel, response);


    }
}
