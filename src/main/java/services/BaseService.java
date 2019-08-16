package services;

import models.CounterIndexEntities;
import models.dao.DataAccess;
import models.menu.CategoryModel;
import models.menu.ItemModel;
import models.users.UserModel;
import models.users.UserType;

import java.util.ArrayList;
import java.util.List;

public class BaseService {
    private static DataAccess dao = new DataAccess();

    private static List<CategoryModel> categoryModelList;
    private static List<ItemModel> itemModelList;
    private static List<UserModel> usersModelList;

    public static List<CategoryModel> getCategoryModelList() {
        if (categoryModelList == null) {
            Object list = dao.readFromStorage(DataAccess.StorageType.CATEGORIES);
            if (list == null)
                categoryModelList = new ArrayList<CategoryModel>();
            else
                categoryModelList = (List<CategoryModel>) list;
        }
        return categoryModelList;
    }

    public static List<ItemModel> getItemModelList() {
        if (itemModelList == null) {
            Object list = dao.readFromStorage(DataAccess.StorageType.ITEMS);
            if (list == null)
                itemModelList = new ArrayList<ItemModel>();
            else
                itemModelList = (List<ItemModel>) list;
        }
        return itemModelList;
    }

    public static List<UserModel> getUsersModelList() {
        if (usersModelList == null) {
            Object list = dao.readFromStorage(DataAccess.StorageType.USERS);
            if (list == null)
                usersModelList = new ArrayList<UserModel>();
            else
                usersModelList = (List<UserModel>) list;
        }
        return usersModelList;
    }

    public static void saveCategoryChanges() {
        dao.saveToStorage(DataAccess.StorageType.CATEGORIES, categoryModelList);
    }

    public static void saveItemsChanges() {
        dao.saveToStorage(DataAccess.StorageType.ITEMS, itemModelList);
    }

    public static void saveUsersChanges() {
        dao.saveToStorage(DataAccess.StorageType.USERS, usersModelList);
    }

    public int getNextCategoryId() {
        CounterIndexEntities c = (CounterIndexEntities) dao.readFromStorage(DataAccess.StorageType.COUNTERS);
        if (c == null) c = new CounterIndexEntities();
        c.countCategories++;
        dao.saveToStorage(DataAccess.StorageType.COUNTERS, c);

        return c.countCategories;
    }

    public int getNextItemId() {
        CounterIndexEntities c = (CounterIndexEntities) dao.readFromStorage(DataAccess.StorageType.COUNTERS);
        if (c == null) c = new CounterIndexEntities();
        c.countItems++;
        dao.saveToStorage(DataAccess.StorageType.COUNTERS, c);

        return c.countItems;
    }

    public int getNextUserId() {
        CounterIndexEntities c = (CounterIndexEntities) dao.readFromStorage(DataAccess.StorageType.COUNTERS);
        if (c == null) c = new CounterIndexEntities();
        c.countUsers++;
        dao.saveToStorage(DataAccess.StorageType.COUNTERS, c);

        return c.countUsers;
    }

    public static void loadOriginalUser() {
        usersModelList.add(new UserModel(1, "Toto", "Tata", "a", "a", UserType.ADMIN));
        usersModelList.add(new UserModel(2, "Riki", "Tata", "b", "b", UserType.ADMIN));
        usersModelList.add(new UserModel(3, "Titi", "Tata", "c", "c", UserType.CUSTOMER));
        usersModelList.add(new UserModel(4, "Tata", "Tata", "c", "c", UserType.DELIVER));


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
}
