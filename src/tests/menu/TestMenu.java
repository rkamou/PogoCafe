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
        item.setName("Eggs24444 boiled");
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
        int id = 1;

        MenuService service = new MenuService();
        CategoryModel model = service.getCategory(id);

        assertNotEquals(model, null);
        if (model != null) {
            System.out.println(model.getId() + " " + model.getName() + " " + model.getMenuName());
        } else {
            System.out.println("No category with id " + id);
        }
    }

    @Test
    public void TestSelectCategoryList () {
        MenuService service = new MenuService();
        // List<CategoryModel> models = service.getCategoryList("breakfast");
        // List<CategoryModel> models = service.getCategoryList("lunch");
        // List<CategoryModel> models = service.getCategoryList("dinner");
        List<CategoryModel> models = service.getCategoryList("kids");
        if (models != null) {
            for (CategoryModel m : models) {
                System.out.println(m.getId() + " " + m.getName() + " " + m.getMenuName());
            }
        }
    }

    @Test
    public void TestSelectItem() {
        int id = 2;

        MenuService service = new MenuService();
        ItemModel model = service.getItem(id);

        if (model != null) {
            System.out.println(model.getId() + " " + model.getName());
        } else {
            System.out.println("No data with id" + id);
        }
    }

    @Test
    public void TestSelectItemList() {
        MenuService service = new MenuService();
        List<ItemModel> models = service.getItemList("breakfast");
        // List<ItemModel> models = service.getItemList("lunch");
        if (models != null) {
            for (ItemModel m : models) {
                CategoryModel cm = service.getCategory(m.getIdCategory());
                System.out.println(m.getId() + " (" + cm.getMenuName() + ") " + m.getIdCategory() + "-" + cm.getName() + " - " + m.getName());
            }
        }
    }

    @Test
    public void CopyMenuItem() {
        int[] itemIds = new int[] {15,16,17,18,19};
        int toCategoryId = 9;

        MenuService service = new MenuService();

        for (int i : itemIds) {
            ItemModel model = service.getItem(i);

            if (model != null) {
                System.out.println(model.getId() + " " + model.getName() + " " + model.getIdCategory());

                ItemModel newModel = new ItemModel();
                newModel.setName(model.getName());
                newModel.setPicture(model.getPicture());
                newModel.setPrice(model.getPrice());
                newModel.setIngredients(model.getIngredients());
                newModel.setIdCategory(toCategoryId);

                service.itemEdit(newModel);
                System.out.println("Copied to category " + toCategoryId);
            } else {
                System.out.println("No data with id" + i);
            }
        }
    }
}
