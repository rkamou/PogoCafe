package services;

import models.CounterIndexEntities;
import models.dao.DataAccess;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import models.menu.MenuModel;
import models.orders.OrderModel;
import models.users.UserModel;
import models.users.UserType;

import java.util.ArrayList;
import java.util.List;

public class BaseService {
    DataAccess dao = new DataAccess();

    public static List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
    public static List<ItemModel> itemModelList = new ArrayList<ItemModel>();
    public static List<UserModel> users = new ArrayList<UserModel>();

    public int getNextCategoryId() {
        CounterIndexEntities c = (CounterIndexEntities) dao.readFromStorage(DataAccess.StorageType.COUNTERS);

        return (c != null) ? c.countCategories + 1 : 1;
    }

    public int getNextItemId() {
        CounterIndexEntities c = (CounterIndexEntities) dao.readFromStorage(DataAccess.StorageType.COUNTERS);
        return (c != null) ? c.countItems + 1 : 1;
    }

    public int getNextUserId() {
        CounterIndexEntities c = (CounterIndexEntities) dao.readFromStorage(DataAccess.StorageType.COUNTERS);
        return (c != null) ? c.countUsers + 1 : 1;
    }

    public static void loadOriginalUser() {
        users.add(new UserModel("1", "Toto", "Tata", "a", "a", UserType.ADMIN));
        users.add(new UserModel("2", "Riki", "Tata", "b", "b", UserType.ADMIN));
        users.add(new UserModel("3", "Titi", "Tata", "c", "c", UserType.CUSTOMER));
        users.add(new UserModel("4", "Tata", "Tata", "c", "c", UserType.DELIVER));


        // public CategoryModel(int id, String name, String description, String menuName) {
        categoryModelList.add(new CategoryModel(1, "Category1", "Description Category1", "Menu 1"));
        categoryModelList.add(new CategoryModel(2, "Category2", "Description Category2", "Menu 2"));
        categoryModelList.add(new CategoryModel(3, "Category3", "Description Category3", "Menu 3"));
        categoryModelList.add(new CategoryModel(4, "Category4", "Description Category4", "Menu 4"));

        // public ItemModel(int id, String name, String ingredients, double price, String picture, int idCategory) {
        itemModelList.add(new ItemModel(1, "Item1", "List ingredients 1", 50, "", 1));
        itemModelList.add(new ItemModel(2, "Item2", "List ingredients 2", 50, "", 1));
        itemModelList.add(new ItemModel(3, "Item1", "List ingredients 1", 50, "", 2));
        itemModelList.add(new ItemModel(4, "Item2", "List ingredients 2", 50, "", 2));
        itemModelList.add(new ItemModel(5, "Item1", "List ingredients 1", 50, "", 3));
        itemModelList.add(new ItemModel(6, "Item2", "List ingredients 2", 50, "", 3));
        itemModelList.add(new ItemModel(7, "Item1", "List ingredients 1", 50, "", 4));
        itemModelList.add(new ItemModel(8, "Item2", "List ingredients 2", 50, "", 4));


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
