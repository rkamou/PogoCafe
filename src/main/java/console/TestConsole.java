package console;

import classes.Result;
import classes.Status;
import models.dao.DAO;
import models.menu.CategoryModel;
import models.orders.OrderModel;
import services.MenuService;
import services.OrderService;

import java.awt.geom.RectangularShape;
import java.util.Calendar;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


public class TestConsole {


    private static  String TAG_NAME = "TestConsole";

    public static void main(String[] args){
        Date current = getCurrentDate();
        Date shpd    = getShopDate();

        OrderModel orderm1 = new
                OrderModel(65289,"NEW YORK",Status.NEW, orderPackage(),current, shpd);

           //List Order
        OrderService service  = new OrderService();
        List<OrderModel> list = service.getOrderList();
        OrderModel mld        = new OrderModel();


        System.out.println(TAG_NAME+" Size "+list.size());
        for (int i =0; i<list.size();i++){
            //System.out.println(TAG_NAME+" Package Name "+service.getOrderList().get(i).getOrder_package());

            System.out.println(TAG_NAME+" User Id "+service.getOrderList().get(i).getId());
            if(service.getOrderList().get(i).getId() == 1){

                mld.setId(mld.getId());
                mld.setOrder_package(mld.getOrder_package());
                mld.setUser_order_id(mld.getUser_order_id());
                mld.setStatus(Status.FINISH);
                mld.setOrdered(mld.getOrdered());
                mld.setShipTo(mld.getShipTo());
                mld.setShippped_date(mld.getShippped_date());
                OrderService upadteservice  = new OrderService();
                Result update = upadteservice.orderCreateorEdit(mld);
                if (!update.isSuccess()){
                    for (String error : update.getErrors()) {
                        System.out.println(error);
                    }
                }

            }

        }

            //Update Order


          //Insert New Order
        /*Result result = service.orderCreateorEdit(orderm1);
        System.out.println(TAG_NAME+"  "+result.isSuccess());
        System.out.println(TAG_NAME+"  "+result.getId());
        if (!result.isSuccess()){
            for (String error : result.getErrors()) {
                System.out.println(error);
            }
        }*/



    }

    public static  Date getCurrentDate(){
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 1);
        dt = c.getTime();

        return dt;
    }


    public static Date getShopDate(){
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 10);
        dt = c.getTime();

        return dt;
    }


    public static String orderPackage(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return  timestamp.getTime()+"";
    }

}
