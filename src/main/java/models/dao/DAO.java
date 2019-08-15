package models.dao;


import java.io.FileReader;
import java.util.Properties;
//
// public class  DAO <T> {
//   private Dao<T, Integer> dao;
//
//   public DAO(Class<T> tClass){
//
//       String db_properties = "db.properties";
//     try {
//       System.out.println(db_properties);
//       String uri =  this.getClass().getClassLoader().getResource(db_properties).toURI().getPath();
//       System.out.println(uri);
//       FileReader reader = new FileReader(uri);
//
//       Properties properties = new Properties();
//       properties.load(reader);
//       System.out.println(properties.getProperty("db.url"));
//       JdbcConnectionSource connectionSource=null;
//       connectionSource = new JdbcConnectionSource(properties.getProperty("db.url"), properties.getProperty("db.username"), properties.getProperty("db.password"));
// ////
// //      dao = DaoManager.createDao(connectionSource,tClass);
//       System.out.println("=============================================");
//     }catch (Exception e){
//       e.printStackTrace();
//     }
//   }
//
//
//   public Dao<T, Integer> getDao() {
//     return dao;
//   }
// }
