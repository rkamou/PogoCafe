import models.entities.CategoryEntity;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

//     String uri = getClass().getClassLoader().getResource("hibernate.cfg.xml").toURI().getPath();
//    static String  r = uri;




//    public static Session getSession() throws HibernateException {
//        return ourSessionFactory.openSession();
//    }

    public static void main(final String[] args) throws Exception {
          SessionFactory ourSessionFactory;

            Configuration configuration = new Configuration();
            //configuration.configure("hibernate.cfg.xml");
            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/pogocafe");
            configuration.setProperty("hibernate.connection.username", "root");
            configuration.setProperty("hibernate.connection.password", "");



            configuration.setProperty("hibernate.hbm2ddl.auto", "none");
            configuration.setProperty("hibernate.show_sql", "false");
            configuration.setProperty("hibernate.connection.pool_size", "10");

//            configuration.setProperty("hibernate.transaction.coordinator_class", "org.hibernate.transaction.JDBCTransactionFactory");
//            configuration.setProperty("hibernate.current_session_context_class", "thread");

            configuration.addAnnotatedClass(CategoryEntity.class);
            //configuration.addAnnotatedClass(UserEntity.class);
            //ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().

            //ourSessionFactory = configuration.buildSessionFactory();


        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        ourSessionFactory = configuration.buildSessionFactory(builder.build());



        final Session session = ourSessionFactory.openSession();
        session.beginTransaction();
        CategoryEntity cat = new CategoryEntity();
        cat.setName("cat"); cat.setMenuName("Pat"); cat.setDescription("Dest");
        session.save(cat);
        session.getTransaction().commit();
        session.close();
    }
}