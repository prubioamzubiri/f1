package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dominio.Circuito;
import dominio.Escuderia;
import dominio.Ingeniero;
import dominio.Piloto;
import lombok.Data;

@Data
public class GestorDB {

    private IGestorPilotos gestorPilotos;
    private IGestorIngeniero gestorIngeniero;
    private IGestorEscuderias gestorEscuderia;
    private IGestorDBClase<Circuito> gestorCircuito;
    private Session session;
    
    public GestorDB()
    {
       
        Configuration cfg = this.connection();

        cfg.configure().addAnnotatedClass(Piloto.class)
                    .addAnnotatedClass(Ingeniero.class)
                    .addAnnotatedClass(Escuderia.class)
                    .addAnnotatedClass(Circuito.class);

        SessionFactory factory = cfg.buildSessionFactory();

        this.session = factory.openSession();

        gestorPilotos = new GestorPìlotos(session);
        gestorIngeniero = new GestorIngenieros(session);
        gestorEscuderia = new GestorEscuderias(session);
        gestorCircuito = new GestorCircuito(session);


    }


    private Configuration connection()
    {
        Configuration cfg = new Configuration();

        String connectionURL;
    

          connectionURL = "jdbc:mysql://127.0.0.1:3306/f1";
          cfg.setProperty("hibernate.connection.url", connectionURL);
    
         
          cfg.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
          cfg.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
    
          cfg.setProperty("hibernate.connection.username", "root");
    
          cfg.setProperty("hibernate.connection.password", "root");

          return cfg;

        
    }

    public void close()
    {
        this.session.close();
    }

    public void insertData()
    {
        this.gestorPilotos.insertData();        
        this.gestorIngeniero.insertData();
        this.gestorEscuderia.insertData();
        this.gestorCircuito.insertData();
    }
}
