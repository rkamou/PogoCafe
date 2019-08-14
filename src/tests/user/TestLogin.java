package user;


import classes.Result;
import org.junit.Test;
import services.UserService;
import static org.junit.Assert.assertTrue;


public class TestLogin {
    @Test
    public void loginTest(){
        UserService service = new UserService();
        Result result = service.login("a", "123");
        assertTrue(result.isSuccess());
    }
}
