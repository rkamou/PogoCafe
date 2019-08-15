package menu;

import classes.Result;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import org.junit.Test;
import services.MenuService;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMenu {

    @Test
    public void TestCategory(){
        CategoryModel category = new CategoryModel();
        category.setId(0);
        category.setName("Test category");
        category.setDescription("description");
        category.setMenuName("kids");

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
        item.setId(0);
        item.setName("Eggs2 boiled");
        item.setIngredients("Many2 ingredients");
        item.setPicture("eggs2.jpg");
        item.setPrice(20.5);
        item.setIdCategory(1);

        MenuService service = new MenuService();
        Result result = service.itemEdit(item);

        System.out.println(result.isSuccess());
        System.out.println(result.getId());
        if (!result.isSuccess()) {
            for (String error : result.getErrors()) {
                System.out.println(error);
            }
        }
    }


    @Test
    public void TestSelectCategory () {
        MenuService service = new MenuService();
        CategoryModel model = service.getCategory(1);

        assertNotEquals(model, null);
        if (model != null) {
            System.out.println(model.getId() + " " + model.getName());
        }

        List<CategoryModel> models = service.getCategoryList("kids");
        if (models != null) {
            for (CategoryModel m : models) {
                System.out.println(m.getId() + " " + m.getName());
            }
        }
    }

    @Test
    public void TestSelectItem() {
        MenuService service = new MenuService();
        ItemModel model = service.getItem(2);

        assertNotEquals(model, null);
        if (model != null) {
            System.out.println(model.getId() + " " + model.getName());
        }

        List<ItemModel> models = service.getItemList();
        if (models != null) {
            for (ItemModel m : models) {
                System.out.println(m.getId() + " " + m.getName());
            }
        }
    }
}
