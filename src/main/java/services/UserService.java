package services;

import classes.Result;
import models.menu.ManagerModel;
import models.menu.UserModel;

public class UserService {

    ManagerModel testManager = new ManagerModel(1, "Saju", "Ahmad", "saju", "123456");

    public Result login(String login, String password){
        if (testManager.getUserName().equals(login) && testManager.getPassword().equals(password)){
            return new Result();
        } else{
            return new Result("User name or password is incorrect");
        }
    }


}
