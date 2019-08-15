package models.dao;

import models.entities.CategoryEntity;
import models.entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.FileReader;
import java.util.Properties;

public class HDAO {
    String db_properties = "db.properties";
    public Session getHDao(){
        try {
            System.out.println(db_properties);
            String uri =  this.getClass().getClassLoader().getResource(db_properties).toURI().getPath();
            System.out.println("Uri : "+uri);

            FileReader reader = new FileReader(uri);


            Properties properties = new Properties();
            properties.load(reader);
            SessionFactory ourSessionFactory;
            int i = 0;
            System.out.println(" i : "+i++);
            System.out.println(properties.getProperty("hibernate.url"));

            Configuration configuration = new Configuration();
            configuration.setProperty("hibernate.dialect", properties.getProperty("hibernate.dialect"));
            configuration.setProperty("hibernate.connection.driver_class", properties.getProperty("hibernate.driver.class"));
            configuration.setProperty("hibernate.connection.url", properties.getProperty("hibernate.url"));
            configuration.setProperty("hibernate.connection.username", properties.getProperty("hibernate.db.username"));
            configuration.setProperty("hibernate.connection.password", properties.getProperty("hibernate.db.password"));

            configuration.setProperty("hibernate.hbm2ddl.auto", properties.getProperty("hibernate.hbm2ddl.auto"));
            configuration.setProperty("hibernate.show_sql", properties.getProperty("hibernate.show_sql"));
            configuration.setProperty("hibernate.connection.pool_size", properties.getProperty("hibernate.connection.pool_size"));

            // Add the others Entities of the project
            configuration.addAnnotatedClass(CategoryEntity.class);
            configuration.addAnnotatedClass(UserEntity.class);
            System.out.println(" i : "+i++);

            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties());
            ourSessionFactory = configuration.buildSessionFactory(builder.build());
            System.out.println(" i : "+i++);

            return ourSessionFactory.openSession();

//            CategoryEntity cat = new CategoryEntity();
//            cat.setName("cat"); cat.setMenuName("Pat"); cat.setDescription("Dest");
//            session.save(cat);
//            session.getTransaction().commit();
//            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }


//  public static void test(){
//    SessionFactory ourSessionFactory;
//
//    Configuration configuration = new Configuration();
//    //configuration.configure("hibernate.cfg.xml");
//    configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//    configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
//    configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/pogocafe");
//    configuration.setProperty("hibernate.connection.username", "root");
//    configuration.setProperty("hibernate.connection.password", "");
//
////
////
//    configuration.setProperty("hibernate.hbm2ddl.auto", "none");
//    configuration.setProperty("hibernate.show_sql", "false");
//    configuration.setProperty("hibernate.connection.pool_size", "10");
//
////            configuration.setProperty("hibernate.transaction.coordinator_class", "org.hibernate.transaction.JDBCTransactionFactory");
////            configuration.setProperty("hibernate.current_session_context_class", "thread");
//
//    configuration.addAnnotatedClass(CategoryEntity.class);
//    //configuration.addAnnotatedClass(UserEntity.class);
////        //ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
////
////        //ourSessionFactory = configuration.buildSessionFactory();
////
////
//    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
//            .applySettings(configuration.getProperties());
//    ourSessionFactory = configuration.buildSessionFactory(builder.build());
////
////
////
//         Session session = ourSessionFactory.openSession();
//        session.beginTransaction();
//        CategoryEntity cat = new CategoryEntity();
//        cat.setName("cat"); cat.setMenuName("Pat"); cat.setDescription("Dest");
//        session.save(cat);
//        session.getTransaction().commit();
//        session.close();
//
//
//
//  }
//
}
