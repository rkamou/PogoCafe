package services;

import classes.Result;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import models.menu.MenuModel;
import java.util.List;

public class MenuService extends BaseService {


    //region Menu

    // get menuModel by id
    public MenuModel getMenu(int id){
        try {
            MenuModel model = dbMenu().queryForId(id);
            return model;
        } catch (Exception ex){
            System.out.println("Error: MenuService.getMenu() " + ex);
            return null;
        }
    }

    // get menu list
    public List<MenuModel> getMenuList(){
        try {
            List<MenuModel> models = dbMenu().queryForAll();
            return models;
        } catch (Exception ex) {
            System.out.println("Error: MenuService.getMenuList() " + ex);
            return null;
        }
    }

    // Adding or editing menu
    public Result menuEdit(MenuModel model) {
        if (model == null) return new Result("Model is null");

        Result result = new Result();
        try {
            if (model.getId() == 0) {
                // creating
                dbMenu().create(model);
                result.setId(model.getId());
            } else {
                // editing
                if (!dbMenu().idExists(model.getId())) return new Result("Cannot find menu with id: " + model.getId());
                dbMenu().update(model);
            }
        } catch (Exception ex) {
            result.addError(ex);
        }

        return result;
    }

    // Delete menu by Id
    public Result menuDelete(int id) {
        Result result = new Result();

        // deleting
        try {
            if (!dbMenu().idExists(id)) return new Result("Cannot find menu with id: " + id);
            dbMenu().deleteById(id);
        } catch (Exception ex) {
            result.addError(ex);
        }

        return result;
    }

    //endregion

    //region Menu Category

    // get CategoryModel by id
    public CategoryModel getCategory(int id) {
        try {
            CategoryModel model = dbCategory().queryForId(id);
            return model;
        } catch (Exception ex) {
            System.out.println("Error: MenuService.getCategory() " + ex);
            return null;
        }
    }

    // get Category list
    public List<CategoryModel> getCategoryList(int menuId) {
        try {
            List<CategoryModel> models = dbCategory().queryBuilder()
                    .where()
                    .eq("idMenu", menuId)
                    .query();

            return models;
        } catch (Exception ex) {
            System.out.println("Error: MenuService.getCategoryList() " + ex);
            return null;
        }
    }

    // Adding or editing category
    public Result categoryEdit(CategoryModel model){
        if (model == null) return new Result("Model is null");

        Result result = new Result();
        try {
            if (model.getId() == 0) {
                // creating
                dbCategory().create(model);
                result.setId(model.getId());
            } else {
                // editing
                if (!dbCategory().idExists(model.getId())) return new Result("Cannot find category with id: " + model.getId());
                dbCategory().update(model);
            }
        } catch (Exception ex){
            result.addError(ex);
        }

        return result;
    }

    // Delete category by Id
    public Result categoryDelete(int id){
        Result result = new Result();

        // deleting
        try {
            if (!dbCategory().idExists(id)) return new Result("Cannot find category with id: " + id);
            dbCategory().deleteById(id);
        }
        catch (Exception ex){
            result.addError(ex);
        }
        return result;
    }

    //endregion

    //region Menu Item

    // get ItemModel by id
    public ItemModel getItem(int id) {
        try {
            ItemModel model = dbItem().queryForId(id);
            return model;
        } catch (Exception ex) {
            System.out.println("Error: MenuService.getItem() " + ex);
            return null;
        }
    }

    // get ItemModel list
    public List<ItemModel> getItemList(int categoryId) {
        try {
            List<ItemModel> models = dbItem().queryBuilder()
                    .where()
                    .eq("idCategory", categoryId)
                    .query();

            return models;
        } catch (Exception ex) {
            System.out.println("Error: MenuService.getItemList() " + ex);
            return null;
        }
    }

    // Adding or editing item
    public Result itemEdit(ItemModel model) {
        if (model == null) return new Result("Model is null");

        Result result = new Result();
        try {
            if (model.getId() == 0) {
                // creating
                dbItem().create(model);
                result.setId(model.getId());
            } else {
                // editing
                if (!dbItem().idExists(model.getId())) return new Result("Cannot find item with id: " + model.getId());
                dbItem().update(model);
            }
        } catch (Exception ex) {
            result.addError(ex);
        }

        return result;
    }

    // Delete item by Id
    public Result itemDelete(int id) {
        Result result = new Result();

        // deleting
        try {
            if (!dbItem().idExists(id)) return new Result("Cannot find item with id: " + id);
            dbItem().deleteById(id);
        } catch (Exception ex) {
            result.addError(ex);
        }

        return result;
    }

    //endregion
}
