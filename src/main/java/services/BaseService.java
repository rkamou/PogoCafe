package services;

import com.j256.ormlite.dao.Dao;
import models.dao.DAO;
import models.menu.CategoryModel;

public class BaseService {

    private static DAO<CategoryModel> daoCategories;
    public static Dao<CategoryModel, Integer> dbCategories() {
        if (daoCategories == null) daoCategories = new DAO<>(CategoryModel.class);
        return daoCategories.getDao();
    }
}
