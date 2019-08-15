package services;

import models.menu.CategoryModel;
import models.menu.ItemModel;
import models.orders.OrderModel;
import models.users.UserModel;

import java.util.ArrayList;
import java.util.List;

public class BaseService {
    private static List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
    private static List<ItemModel> itemModelList = new ArrayList<ItemModel>();

        public static int getNextCategoryId(){
            return 0;
        }



    // public static void init(){
    //     daoCategory = new DAO<>(CategoryModel.class);
    // }
    //
    // private static DAO<CategoryModel> daoCategory;
    // public static Dao<CategoryModel, Integer> dbCategory() {
    //     if (daoCategory == null) daoCategory = new DAO<>(CategoryModel.class);
    //     return daoCategory.getDao();
    // }
    //
    // private static DAO<ItemModel> daoItem;
    // public static Dao<ItemModel, Integer> dbItem() {
    //     if (daoItem == null) daoItem = new DAO<>(ItemModel.class);
    //     return daoItem.getDao();
    // }
    //
    //
    // private static DAO<OrderModel> daoOrders;
    // public static Dao<OrderModel, Integer> dbOrders() {
    //     if (daoOrders == null) daoOrders = new DAO<>(OrderModel.class);
    //     return daoOrders.getDao();
    // }
    //
    // private static DAO<UserModel> daoUser;
    // public static Dao<UserModel, Integer> dbUsers() {
    //     if (daoUser == null) daoUser = new DAO<>(UserModel.class);
    //     return daoUser.getDao();
    // }

}
