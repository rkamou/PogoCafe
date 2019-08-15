package services;

import classes.Result;
import models.users.UserModel;
import models.users.UserType;
import java.util.ArrayList;
import java.util.List;


public class UserService extends BaseService {
    public static List<UserModel> usersList = new ArrayList<UserModel>();

    static {
        usersList.add(new UserModel(1, "Saju", "Ahmad", "a", "123", UserType.ADMIN));
    }

    public Result editUser(UserModel model) {
        Result result = new Result();
        // some check here

        if (!result.isSuccess()) return result;

        if (model.getId() == 0) {
            model.setId(usersList.size() + 1);
            usersList.add(model);
            result.setId(model.getId());
        } else {
            for(int i=0; i < usersList.size(); i++){
                if (usersList.get(i).getId() == model.getId()){
                    usersList.get(i).setFirstName(model.getFirstName());
                    usersList.get(i).setLastName(model.getLastName());
                    usersList.get(i).setRole(model.getRole());
                }
            }
        }

        return result;
    }

    public Result deleteUser(int id){
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getId() ==  id) {
                usersList.remove(i);
                return new Result();
            }
        }
        return new Result("User not found");
    }

    public UserModel getUser(int id) {
        return usersList.stream().filter(x -> x.getId() == id).findFirst().orElse(new UserModel());
    }

    public List<UserModel> getUsersList() {
        return usersList;
    }

//    DataAccess dao = new DataAccess();
//    List<UserModel> users = (List<UserModel>)dao.readFromStorage(DataAccess.StorageType.USERS);


    public Result login(String userName, String password) {
        Result result = new Result();
        for (UserModel user : usersList) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                result.setValue(user);
                return result;
            }
        }
        return new Result("User name or password is incorrect");
    }
}
