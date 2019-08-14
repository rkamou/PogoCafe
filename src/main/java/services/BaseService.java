package services;

import com.j256.ormlite.dao.Dao;
import models.dao.DAO;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import models.menu.MenuModel;
import models.orders.OrderModel;

public class BaseService {

    private static DAO<MenuModel> daoMenu;
    public static Dao<MenuModel, Integer> dbMenu() {
        if (daoMenu == null) daoMenu = new DAO<>(MenuModel.class);
        return daoMenu.getDao();
    }

    private static DAO<CategoryModel> daoCategory;
    public static Dao<CategoryModel, Integer> dbCategory() {
        if (daoCategory == null) daoCategory = new DAO<>(CategoryModel.class);
        return daoCategory.getDao();
    }

    private static DAO<ItemModel> daoItem;
    public static Dao<ItemModel, Integer> dbItem() {
        if (daoItem == null) daoItem = new DAO<>(ItemModel.class);
        return daoItem.getDao();
    }


    private static DAO<OrderModel> daoOrders;
    public static Dao<OrderModel, Integer> dbOrders() {
        if (daoOrders == null) daoOrders = new DAO<>(OrderModel.class);
        return daoOrders.getDao();
    }

}
