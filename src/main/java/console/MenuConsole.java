package console;

import classes.Result;
import models.dao.DAO;
import models.menu.CategoryModel;
import models.menu.MenuModel;
import services.MenuService;

public class MenuConsole {
    public static void main(String[] args) {
        CategoryModel category = new CategoryModel();
        category.setId(0);
        category.setName("Number8880000");
        category.setDescription("dwfdsfsdfc");
        category.setIdMenu(1);

        MenuService service = new MenuService();
        Result result = service.categoryEdit(category);

        System.out.println(result.isSuccess());
        System.out.println(result.getId());
        if (!result.isSuccess()){
            for (String error : result.getErrors()) {
                System.out.println(error);
            }
        }
    }
}
