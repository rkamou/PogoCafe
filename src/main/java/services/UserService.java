package services;

import classes.Result;
import models.dao.DataAccess;
import models.users.UserModel;
import models.users.UserType;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserService extends BaseService {

    private UserModel admin = new UserModel("1", "Saju", "Ahmad", "a", "123", UserType.ADMIN);
    List<UserModel> users;

    public void userList(UserModel user) {
        users = new ArrayList<>();
        users.add(user);
    }

    public boolean addUser(UserModel user) {
        userList(user);
        for (UserModel u : users) {
            System.out.println(u.toString());
        }
        return true;
    }

//    DataAccess dao = new DataAccess();
//    List<UserModel> users = (List<UserModel>)dao.readFromStorage(DataAccess.StorageType.USERS);


    public Result login(String userName, String password) {
        Result result = new Result();
        userList(admin);
        for (UserModel user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                result.setValue(user);
                return result;
            }
        }
        return new Result("User name or password is incorrect");
    }
}
