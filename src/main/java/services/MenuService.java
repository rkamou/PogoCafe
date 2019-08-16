package services;

import classes.Np;
import classes.Result;
import models.menu.CategoryModel;
import models.menu.ItemModel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MenuService extends BaseService {
    //region Menu Category

    // get CategoryModel by id
    public CategoryModel getCategory(int id) {
        try {
            return getCategoryModelList().stream().filter(x -> x.getId() == id).findFirst().get();
        } catch (Exception ex) {
            System.out.println("Error: MenuService.getCategory() " + ex);
            return null;
        }
    }

    // get Category list
    public List<CategoryModel> getCategoryList(String menuName) {
        if (!menuName.equals(Np.Menu.breakfast) && !menuName.equals(Np.Menu.dinner) && !menuName.equals(Np.Menu.lunch) && !menuName.equals(Np.Menu.kids))
            menuName = Np.Menu.breakfast;

        try {
            String menuNameVar = menuName;
            return getCategoryModelList().stream().filter(x -> x.getMenuName().equals(menuNameVar)).collect(Collectors.toList());
        } catch (Exception ex) {
            System.out.println("Error: MenuService.getCategoryList() " + ex);
            return null;
        }
    }

    // Adding or editing category
    public Result categoryEdit(CategoryModel model) {
        if (model == null) return new Result("Model is null");

        Result result = new Result();
        try {
            if (model.getId() == 0) {
                // creating
                model.setId(getNextCategoryId());
                getCategoryModelList().add(model);

                result.setId(model.getId());
            } else {
                // editing
                if (!getCategoryModelList().stream().anyMatch(x -> x.getId() == model.getId())) return new Result("Cannot find category with id: " + model.getId());
                CategoryModel entity = getCategoryModelList().stream().filter(x -> x.getId() == model.getId()).findFirst().get();
                entity.setName(model.getName());
                entity.setDescription(model.getDescription());
                entity.setMenuName(model.getMenuName());
            }
            saveCategoryChanges();
        } catch (Exception ex) {
            result.addError(ex);
        }

        return result;
    }

    // Delete category by Id
    public Result categoryDelete(int id) {
        Result result = new Result();

        // deleting
        try {
            if (!getCategoryModelList().stream().anyMatch(x -> x.getId() == id)) return new Result("Cannot find category with id: " + id);
            getCategoryModelList().remove(getCategoryModelList().stream().filter(x -> x.getId() == id).findFirst().get());
            saveCategoryChanges();
        } catch (Exception ex) {
            result.addError(ex);
        }
        return result;
    }

    //endregion

    //region Menu Item

    // get ItemModel by id
    public ItemModel getItem(int id) {
        try {
            return getItemModelList().stream().filter(x -> x.getId() == id).findFirst().get();
        } catch (Exception ex) {
            System.out.println("Error: MenuService.getItem() " + ex);
            return null;
        }
    }

    // get ItemModel list
    public List<ItemModel> getItemList(String menuName) {
        try {
            List<CategoryModel> categories = getCategoryList(menuName);

            // Selecting only items from given categories
            Stream<ItemModel> dbSet = getItemModelList().stream().filter(x -> categories.stream().map(c -> c.getId()).anyMatch(c -> c == x.getIdCategory()));
            return dbSet.collect(Collectors.toList());
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
                model.setId(getNextItemId());
                getItemModelList().add(model);

                result.setId(model.getId());
            } else {
                // editing
                if (!getItemModelList().stream().anyMatch(x -> x.getId() == model.getId())) return new Result("Cannot find item with id: " + model.getId());
                ItemModel entity = getItemModelList().stream().filter(x -> x.getId() == model.getId()).findFirst().get();
                entity.setName(model.getName());
                entity.setIngredients(model.getIngredients());
                entity.setPrice(model.getPrice());
                entity.setIdCategory(model.getIdCategory());
                entity.setPicture(model.getPicture());
            }
            saveItemsChanges();
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
            if (!getItemModelList().stream().anyMatch(x -> x.getId() == id)) return new Result("Cannot find item with id: " + id);
            getItemModelList().remove(getItemModelList().stream().filter(x -> x.getId() == id).findFirst().get());
            saveItemsChanges();
        } catch (Exception ex) {
            result.addError(ex);
        }
        return result;
    }

    //endregion
}
