package models.dao;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import models.users.UserModel;
import models.users.UserType;


public class TestData {
	static List<UserModel> users = new ArrayList<UserModel>();
	@SuppressWarnings("serial")
	public static void loadOriginalUser(){
		users.add(new UserModel(1, "Toto",  "Tata", "a", "123", UserType.ADMIN));
		users.add(new UserModel(2, "Titi",  "Tata", "c", "123", UserType.CUSTOMER));
		users.add(new UserModel(3, "Tata",  "Tata", "d", "123", UserType.DELIVER));
	}

	public  void main(){
		loadOriginalUser();
		DataAccess dao = new DataAccess();
		dao.saveToStorage(DataAccess.StorageType.USERS, users);
		List<UserModel> us = (List<UserModel>)dao.readFromStorage(DataAccess.StorageType.USERS);
		System.out.println((us!=null)?us.size():"null");
	}

	public static void main(String[] args){
		File file = new File("DataFiles/USERS");
		ObjectOutputStream out = null;
		try {

			URL sample = TestData.class.getResource("/DataFiles/USERS");

			Path path = Paths.get(sample.toURI());

			System.out.println(path.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(file.getPath());
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
