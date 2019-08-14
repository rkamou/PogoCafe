package models.dao;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

import java.io.FileReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Properties;

public class  DAO <T> {
  private Dao<T, Integer> dao;
  public DAO(Class<T> tClass){
     JdbcConnectionSource connectionSource=null;
    try {
      String db_properties = "db.properties";
      String uri =  this.getClass().getClassLoader().getResource(db_properties).toURI().getPath();
      FileReader reader = new FileReader(uri);
      Properties properties = new Properties();
      properties.load(reader);
      connectionSource = new JdbcConnectionSource(properties.getProperty("db.url"), properties.getProperty("db.username"), properties.getProperty("db.password"));

      dao = DaoManager.createDao(connectionSource,tClass);
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  public Dao<T, Integer> getDao() {
    return dao;
  }
}
