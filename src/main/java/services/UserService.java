package services;

import classes.Result;
import models.menu.DeliveryModel;
import models.menu.ManagerModel;
import models.menu.UserModel;

import javax.swing.*;

public class UserService extends BaseService {

    ManagerModel testManager = new ManagerModel(1, "Saju", "Ahmad", "saju", "123456");
    DeliveryModel testOwner = new DeliveryModel(2, "Saju", "Ahmad", "saju1", "123456");

//    public Result login(String userName, String password) {
//        if (testManager.getUserName().equals(userName) && testManager.getPassword().equals(password)) {
//            return new Result();
//        } else if (testOwner.getUserName().equals(userName) && testOwner.getPassword().equals(password)) {
//            return new Result();
//        } else {
//            return new Result("User name or password is incorrect");
//        }
//    }

    public Result login(String userName, String password) {
        Result result = new Result();
        if (testManager.getUserName().equals(userName) && testManager.getPassword().equals(password)) {
            result.setValue(testManager);
            return result;
        } else if (testOwner.getUserName().equals(userName) && testOwner.getPassword().equals(password)) {
            result.setValue(testOwner);
            return result;
        }

        return new Result("User name or password is incorrect");
    }
}
