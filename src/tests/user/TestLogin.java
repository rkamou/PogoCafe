package user;


import classes.Result;
import models.users.UserModel;
import models.users.UserType;
import org.junit.Test;
import services.UserService;
import static org.junit.Assert.assertTrue;


public class TestLogin {
    @Test
    public void loginTest(){
        UserService service = new UserService();
        Result result = service.login("a", "a");
        assertTrue(result.isSuccess());
    }

    @Test
    public void testAddUser(){
       UserService service = new UserService();
       UserModel model = service.getUser(1);

        System.out.println(model.toString());
    }
}
