package console;

import models.dao.DAO;
import models.menu.MenuModel;

public class TestConsole {
    public static void main(String[] args){
      MenuModel menuModel = new MenuModel();
      menuModel.setName("Vrai");

      DAO<MenuModel> dao = new DAO<>(MenuModel.class);

      try {
        int res = dao.getDao().create(menuModel);
      }catch (Exception e){

      }
    }
}
