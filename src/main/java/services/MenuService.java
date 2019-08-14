package services;

import classes.Result;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import models.menu.MenuModel;

public class MenuService extends DeliveryService {

    // Adding or editing menu
    public Result menuEdit(MenuModel model) {
        Result result = new Result();

        if (model == null) return new Result("Model is null");

        // TODO: check name available
        // if (name is not available) return new Result("Menu name " + model.getName() + " is unavailable");

        try {
            if (model.getId() == 0) {
                // creating
                // TODO: Identity
                model.setId(1);

                // TODO: Save to database
                result.setId(model.getId());
            } else {
                // editing
                // MenuModel entity = get entity from database by model.getId()

                // if (entity == null) return new Result("Cannot find category with id: " + model.getId());

                // entity.setName(model.getName());
                // TODO: Save to database
            }
        } catch (Exception ex) {
            result.addError(ex);
        }

        return result;
    }

    // Delete category by Id
    public Result menuDelete(int id) {
        Result result = new Result();

        // deleting
        // MenuModel entity = get entity from database by id

        // if (entity == null) return new Result("Cannot find menu with id: " + model.getId());

        // delete from DB
        // TODO: Save to database

        return result;
    }

    // Adding or editing category
    public Result categoryEdit(CategoryModel model){
        Result result = new Result();

        if (model == null) return new Result("Model is null");

        try {
            if (model.getId() == 0) {
                // creating
                // TODO: Identity
                model.setId(1);

                // TODO: Save to database
                result.setId(model.getId());
            } else {
                // editing
                // CategoryModel entity = get entity from database by model.getId()

                // if (entity == null) return new Result("Cannot find category with id: " + model.getId());

                // entity.setName(model.getName());
                // TODO: Save to database
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
        // CategoryModel entity = get entity from database by id

        // if (entity == null) return new Result("Cannot find category with id: " + model.getId());

        // delete from DB
        // TODO: Save to database

        return result;
    }

    // Adding or editing category
    public Result itemEdit(ItemModel model) {
        Result result = new Result();

        if (model == null) return new Result("Model is null");

        try {
            if (model.getId() == 0) {
                // creating
                // TODO: Identity
                model.setId(1);

                // TODO: Save to database
                result.setId(model.getId());
            } else {
                // editing
                // ItemModel entity = get entity from database by model.getId()

                // if (entity == null) return new Result("Cannot find item with id: " + model.getId());

                // entity.setName(model.getName());
                // TODO: Save to database
            }
        } catch (Exception ex) {
            result.addError(ex);
        }

        return result;
    }

    // Delete category by Id
    public Result itemDelete(int id) {
        Result result = new Result();

        // deleting
        // ItemModel entity = get entity from database by id

        // if (entity == null) return new Result("Cannot find item with id: " + model.getId());

        // delete from DB
        // TODO: Save to database

        return result;
    }

}
