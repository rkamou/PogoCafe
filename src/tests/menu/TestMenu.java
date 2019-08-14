package menu;

import classes.Result;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import models.menu.MenuModel;
import org.junit.Test;
import services.MenuService;

public class TestMenu {

    @Test
    public void TestMenu(){
        MenuModel menu = new MenuModel();
        menu.setId(5);
        menu.setName("test menu 1");

        MenuService service = new MenuService();
        Result result = service.menuDelete(5);

        System.out.println(result.isSuccess());
        System.out.println(result.getId());
        if (!result.isSuccess()) {
            for (String error : result.getErrors()) {
                System.out.println(error);
            }
        }
    }

    @Test
    public void TestCategory(){
        CategoryModel category = new CategoryModel();
        category.setId(0);
        category.setName("Test category");
        category.setDescription("description");
        category.setIdMenu(1);

        MenuService service = new MenuService();
        Result result = service.categoryEdit(category);

        System.out.println(result.isSuccess());
        System.out.println(result.getId());
        if (!result.isSuccess()) {
            for (String error : result.getErrors()) {
                System.out.println(error);
            }
        }
    }

    @Test
    public void TestItem(){
        ItemModel item = new ItemModel();
        item.setId(1);
        item.setName("Eggs2 boiled");
        item.setIngredients("Many2 ingredients");
        item.setPicture("eggs2.jpg");
        item.setPrice(20.5);
        item.setIdCategory(1);

        MenuService service = new MenuService();
        Result result = service.itemDelete(1);

        System.out.println(result.isSuccess());
        System.out.println(result.getId());
        if (!result.isSuccess()) {
            for (String error : result.getErrors()) {
                System.out.println(error);
            }
        }
    }
}
