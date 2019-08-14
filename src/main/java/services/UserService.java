package services;

import classes.Result;
import models.users.UserModel;

import java.sql.SQLException;
import java.util.List;


public class UserService extends BaseService {

//    private ManagerModel testManager = new ManagerModel(1, "Saju", "Ahmad", "saju", "123456");
//    private DeliveryModel testOwner = new DeliveryModel(2, "Saju", "Ahmad", "saju1", "123456");

    public Result login(String userName, String password) {
        Result result = new Result();
        System.out.println("result: " + result);
        try {
            List<UserModel> users = dbUsers().queryBuilder().where().eq("login", userName).query();
            System.out.println("list: " + users);
            if (users != null) {
                for (UserModel user : users) {
                    System.out.println("=======User ======= = "+user);
                    if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                        result.setValue(user);
                        return result;
                    }
                }
            } else {
                return new Result("User not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Result("User name or password is incorrect");

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
