package services;

import classes.Result;
import models.users.UserModel;

import java.sql.SQLException;
import java.util.List;


public class UserService extends BaseService {
    // CategoryEntity categoryEntity = new CategoryEntity();
    //
    // HDAO hDaod = new HDAO();
    // Session session = hDaod.getHDao();


//    private ManagerModel testManager = new ManagerModel(1, "Saju", "Ahmad", "saju", "123456");
//    private DeliveryModel testOwner = new DeliveryModel(2, "Saju", "Ahmad", "saju1", "123456");

    public Result login(String userName, String password) {
        return null;
        // if (session == null) System.out.println("Session is null");
        // Result result = new Result();
        // System.out.println("result: " + result);
        // try {
        //
        //     String hql = "FROM UserEntity E WHERE E.login = :user_login AND E.password= :user_pass";
        //     List<UserEntity> users = session.createQuery(hql).setParameter("user_login",userName).
        //             setParameter("user_pass",password).list();
        //
        //     System.out.println("list: " + users);
        //     if (users != null) {
        //         return new Result();
        //     } else {
        //         return new Result("User not found!");
        //     }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // return new Result("User name or password is incorrect");

//        Result result = new Result();
//        if (testManager.getUserName().equals(userName) && testManager.getPassword().equals(password)) {
//            result.setValue(testManager);
//            return result;
//        } else if (testOwner.getUserName().equals(userName) && testOwner.getPassword().equals(password)) {
//            result.setValue(testOwner);
//            return result;
//        }
//        return new Result("User name or password is incorrect");
    }
}
