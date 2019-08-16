package user;


import classes.Result;
import models.users.UserModel;
import models.users.UserType;
import org.junit.Test;
import services.UserService;

import static org.junit.Assert.assertTrue;


public class TestLogin {
    @Test
    public void loginTest() {
        UserService service = new UserService();
        Result result = service.login("a", "a");
        assertTrue(result.isSuccess());
    }

    @Test
    public void testAddUser() {
        UserService service = new UserService();
        service.editUser(new UserModel(0, "Saju", "Ahmad", "a", "123", UserType.ADMIN));
    }

    @Test
    public void testGetUserList() {
        UserService service = new UserService();
        for (UserModel user : service.getUsersList() ) {
            System.out.println(user.toString());
        }
    }
}
