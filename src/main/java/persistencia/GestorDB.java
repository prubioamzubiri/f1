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

        // -Ddbhost=host -Ddbport=port -Ddbdatabase=databasename
        // String host = (System.getProperty("dbhost")==null)? "127.0.0.1":System.getProperty(data);
        //   String host = getProperty("dbhost", "127.0.0.1");
        //   String port = getProperty("dbport","3306");
        //   String database = getProperty("dbdatabase","database1");
    
          connectionURL = "jdbc:h2:mem:default";//; DB_CLOSE_ON_EXIT=FALSE"; //"jdbc:mysql://" + host + ":" + port + "/" + database;
          cfg.setProperty("hibernate.connection.url", connectionURL);
    
          cfg.setProperty("hibernate.connection.driver_class","org.h2.Driver");
          cfg.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect");
    
          // -Ddbuser=user
          //String user = getProperty("dbuser", "root");
          cfg.setProperty("hibernate.connection.username", "sa");
    
          //-Ddbpassword=password
          //String password = getProperty("dbpassword","root");
          cfg.setProperty("hibernate.connection.password", "sa");

          return cfg;

        
    }

    public void close()
    {
        this.session.close();
    }
}
