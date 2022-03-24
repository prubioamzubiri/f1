package persistencia;

import java.util.List;

import org.hibernate.Session;

import dominio.Ingeniero;

public class GestorIngenieros implements IGestorIngeniero{

    Session session;

    public GestorIngenieros(Session session)
    {
        this.session = session;
    }

    @Override
    public List<Ingeniero> getIngenieros() {
    
        return session.createQuery("from Ingeniero", Ingeniero.class).getResultList(); 

    }

    @Override
    public Ingeniero getIngeniero(String id) {
 
        Ingeniero toReturn = session.get(Ingeniero.class, id);

        return toReturn;

    }

    @Override
    public void addIngeniero(Ingeniero ingeniero) {
        
        session.beginTransaction();
        session.save(ingeniero);
        session.getTransaction().commit();        
        
    }

    @Override
    public void removeIngeniero(String id) {
        
        Ingeniero ingeniero = session.get(Ingeniero.class, id);
        session.beginTransaction();
        session.remove(ingeniero);
        session.getTransaction().commit();
        
    }

    @Override
    public void updateIngeniero(Ingeniero ingeniero) {
        
        session.beginTransaction();
        session.update(ingeniero);
        session.getTransaction().commit();
        
    }

    @Override
    public void insertData() {
       
        session.beginTransaction();
        Ingeniero i = new Ingeniero("i_alp_pf", "Pat Fry", 1964);
        session.save(i);
        i = new Ingeniero("i_alp_os", "Otmar Szafnauer", 1964);
        session.save(i);
        i = new Ingeniero("i_am_mk", "Mike Krack", 1972);
        session.save(i);
        i = new Ingeniero("i_am_tm", "Tom McCullough", 1975);
        session.save(i);
        session.getTransaction().commit();
        
    }


    
}
