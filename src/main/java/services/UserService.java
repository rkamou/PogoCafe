package services;

import classes.Result;
import models.users.UserModel;
import java.util.List;


public class UserService extends BaseService {

    public Result editUser(UserModel model) {
        Result result = new Result();
        // some check here

        if (!result.isSuccess()) return result;

        if (model.getId() == 0) {
            model.setId(getNextUserId());
            getUsersModelList().add(model);
            result.setId(model.getId());
        } else {
            for (int i = 0; i < getUsersModelList().size(); i++) {
                if (getUsersModelList().get(i).getId() == model.getId()) {
                    getUsersModelList().get(i).setFirstName(model.getFirstName());
                    getUsersModelList().get(i).setLastName(model.getLastName());
                    getUsersModelList().get(i).setRole(model.getRole());
                }
            }
        }
        saveUsersChanges();

        return result;
    }

    public Result deleteUser(int id) {
        for (int i = 0; i < getUsersModelList().size(); i++) {
            if (getUsersModelList().get(i).getId() == id) {
                getUsersModelList().remove(i);
                return new Result();
            }
        }
        saveUsersChanges();

        return new Result("User not found");
    }

    public UserModel getUser(int id) {
        return getUsersModelList().stream().filter(x -> x.getId() == id).findFirst().orElse(new UserModel());
    }

    public List<UserModel> getUsersList() {
        return getUsersModelList();
    }

    public Result login(String userName, String password) {
        Result result = new Result();
        for (UserModel user : getUsersModelList()) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                result.setValue(user);
                return result;
            }
        }
        return new Result("User name or password is incorrect");
    }
}
