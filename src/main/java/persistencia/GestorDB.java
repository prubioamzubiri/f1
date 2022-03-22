package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dominio.Piloto;

public class GestorDB {

    private IGestorPilotos gestorPilotos;
    private Session session;
    
    public GestorDB()
    {
       
        Configuration cfg = this.connection();

        cfg.configure().addAnnotatedClass(Piloto.class);

        SessionFactory factory = cfg.buildSessionFactory();

        this.session = factory.openSession();

        gestorPilotos = new GestorPìlotos(session);


    }


    private Configuration connection()
    {
        Configuration cfg = new Configuration();

        String connectionURL;
    
          connectionURL = "jdbc:h2:mem:default";
          cfg.setProperty("hibernate.connection.url", connectionURL);
    
          cfg.setProperty("hibernate.connection.driver_class","org.h2.Driver");
          cfg.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect");
    
          cfg.setProperty("hibernate.connection.username", "sa");
    
          cfg.setProperty("hibernate.connection.password", "sa");

          return cfg;

        
    }

    public void close()
    {
        this.session.close();
    }

    public void insertData()
    {

    }
}
