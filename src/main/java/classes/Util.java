package classes;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class Util {

    public static String orderPackage(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return  timestamp.getTime()+"";
    }

    public static Date getCurrentDate() {
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(5, 1);
        dt = c.getTime();
        return dt;
    }

    public static Date getShopDate() {
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(5, 10);
        dt = c.getTime();
        return dt;
    }
}
