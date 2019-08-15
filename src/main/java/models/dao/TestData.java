package models.dao;

import java.util.ArrayList;
import java.util.List;
import models.users.UserModel;
import models.users.UserType;


public class TestData {
	static List<UserModel> users = new ArrayList<UserModel>();
	@SuppressWarnings("serial")
	public static void loadOriginalUser(){
		users.add(new UserModel("1", "Toto",  "Tata", "a", "a", UserType.ADMIN));
		users.add(new UserModel("2", "Riki",  "Tata", "b", "b", UserType.ADMIN));
		users.add(new UserModel("3", "Titi",  "Tata", "c", "c", UserType.CUSTOMER));
		users.add(new UserModel("4", "Tata",  "Tata", "c", "c", UserType.DELIVER));

	}

	public  void main(){
		loadOriginalUser();
		DataAccess dao = new DataAccess();
		dao.saveToStorage(DataAccess.StorageType.USERS, users);
		List<UserModel> us = (List<UserModel>)dao.readFromStorage(DataAccess.StorageType.USERS);
		System.out.println((us!=null)?us.size():"null");
	}



//	public void libraryMemberData() {
//
//		DAO dao = new DAO();
//
//		DataAccess.(members);
//		DataAccessFacade.loadCheckout(members);
//
//	}
		
	
}
