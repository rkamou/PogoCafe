package services;

import classes.Np;
import classes.Result;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MenuService extends BaseService {
    private static List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
    private static List<ItemModel> itemModelList = new ArrayList<ItemModel>();

    static {
        CategoryModel c1 = new CategoryModel();
        c1.setId(1);
        c1.setName("Chicken dishes");
        c1.setDescription("Chicken dishes description");
        c1.setMenuName(Np.Menu.breakfast);
        categoryModelList.add(c1);

        CategoryModel c2 = new CategoryModel();
        c2.setId(2);
        c2.setName("Beef dishes");
        c2.setDescription("Beef dishes description");
        c2.setMenuName(Np.Menu.breakfast);
        categoryModelList.add(c2);

        ItemModel i1 = new ItemModel();
        i1.setId(1);
        i1.setName("Fried eggs");
        i1.setIngredients("2 fresh eggs, salt, pepper");
        i1.setPrice(10.5);
        i1.setPicture("https://cdn-image.foodandwine.com/sites/default/files/1502722278/fried-eggs-with-jamon-and-caviar-XL-RECIPE0917.jpg");
        i1.setIdCategory(1);
        itemModelList.add(i1);

        ItemModel i2 = new ItemModel();
        i2.setId(2);
        i2.setName("Toast with jam");
        i2.setIngredients("2 fresh served toast, with 4 jams and honey");
        i2.setPrice(7.8);
        i2.setPicture("https://www.cleaneatingmag.com/.image/t_share/MTUzNjc2NjYyNTIzODMyMDY2/white-bean--roasted-red-pepper-toasts-with-avocado_77_web.jpg");
        i2.setIdCategory(1);
        itemModelList.add(i2);
    }

    //region Menu Category

    // get CategoryModel by id
    public CategoryModel getCategory(int id) {
        try {
            // CategoryModel model = dbCategory().queryForId(id);
            // return model;
            return categoryModelList.stream().filter(x->x.getId() == id).findFirst().get();
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
            // List<CategoryModel> models = dbCategory().queryBuilder()
            //         .where()
            //         .eq("menuName", menuName)
            //         .query();
            //
            // return models;
            String menuNameVar = menuName;
            return categoryModelList.stream().filter(x -> x.getMenuName().equals(menuNameVar)).collect(Collectors.toList());
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
                // dbCategory().create(model);
                // result.setId(model.getId());

                model.setId(categoryModelList.size() + 1);
                categoryModelList.add(model);

                result.setId(model.getId());
            } else {
                // editing
                // if (!dbCategory().idExists(model.getId())) return new Result("Cannot find category with id: " + model.getId());
                // dbCategory().update(model);

                if (!categoryModelList.stream().anyMatch(x->x.getId() == model.getId())) return new Result("Cannot find category with id: " + model.getId());
                CategoryModel entity = categoryModelList.stream().filter(x -> x.getId() == model.getId()).findFirst().get();
                entity.setName(model.getName());
                entity.setDescription(model.getDescription());
                entity.setMenuName(model.getMenuName());
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
            // if (!dbCategory().idExists(id)) return new Result("Cannot find category with id: " + id);
            // dbCategory().deleteById(id);

            if (!categoryModelList.stream().anyMatch(x -> x.getId() == id)) return new Result("Cannot find category with id: " + id);
            categoryModelList.remove(categoryModelList.stream().filter(x -> x.getId() == id).findFirst().get());
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
            //ItemModel model = dbItem().queryForId(id);
            //return model;
            return itemModelList.stream().filter(x->x.getId() == id).findFirst().get();
        } catch (Exception ex) {
            System.out.println("Error: MenuService.getItem() " + ex);
            return null;
        }
    }

    // get ItemModel list
    public List<ItemModel> getItemList() {
        try {
            // List<ItemModel> models = dbItem().queryBuilder()
            //         .where()
            //         .eq("idCategory", categoryId)
            //         .query();
            //
            // return models;
            Stream<ItemModel> dbSet = itemModelList.stream();
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
                // dbItem().create(model);
                // result.setId(model.getId());

                model.setId(itemModelList.size() + 1);
                itemModelList.add(model);

                result.setId(model.getId());
            } else {
                // editing
                // if (!dbItem().idExists(model.getId())) return new Result("Cannot find item with id: " + model.getId());
                // dbItem().update(model);

                if (!itemModelList.stream().anyMatch(x -> x.getId() == model.getId())) return new Result("Cannot find item with id: " + model.getId());
                ItemModel entity = itemModelList.stream().filter(x -> x.getId() == model.getId()).findFirst().get();
                entity.setName(model.getName());
                entity.setIngredients(model.getIngredients());
                entity.setPrice(model.getPrice());
                entity.setIdCategory(model.getIdCategory());
                entity.setPicture(model.getPicture());
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
            // if (!dbItem().idExists(id)) return new Result("Cannot find item with id: " + id);
            // dbItem().deleteById(id);

            if (!itemModelList.stream().anyMatch(x -> x.getId() == id)) return new Result("Cannot find item with id: " + id);
            itemModelList.remove(itemModelList.stream().filter(x -> x.getId() == id).findFirst().get());
        } catch (Exception ex) {
            result.addError(ex);
        }
        return result;
    }

    //endregion
}
