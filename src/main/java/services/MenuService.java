package services;

import classes.Result;
import models.dao.DAO;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import models.menu.MenuModel;

public class MenuService extends BaseService {

    // Adding or editing category
    public Result categoryEdit(CategoryModel model){
        Result result = new Result();

        if (model == null) return new Result("Model is null");

        try {
            if (model.getId() == 0) {
                // creating
                dbCategories().create(model);
                result.setId(model.getId());
            } else {
                // editing
                if (!dbCategories().idExists(model.getId())) return new Result("Cannot find category with id: " + model.getId());
                dbCategories().update(model);
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
            if (!dbCategories().idExists(id)) return new Result("Cannot find category with id: " + id);
            dbCategories().deleteById(id);
        }
        catch (Exception ex){
            result.addError(ex);
        }
        return result;
    }

}
