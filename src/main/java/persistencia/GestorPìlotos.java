package persistencia;

import java.util.List;

import org.hibernate.Session;

import dominio.Piloto;

public class GestorPìlotos implements IGestorPilotos {

    Session session;

    public GestorPìlotos(Session session)
    {
        this.session = session;
    }


    @Override
    public List<Piloto> getPilotos() {
        
        return session.createQuery("from Piloto", Piloto.class).getResultList();   
        
    }

    @Override
    public Piloto getPiloto(String id) {
        
        Piloto toReturn = session.get(Piloto.class, id);

        return toReturn;
    }

    @Override
    public void addPiloto(Piloto piloto) {
        
        session.beginTransaction();
        session.save(piloto);
        session.getTransaction().commit();
        
    }

    @Override
    public void removePiloto(String id) {
       
        Piloto piloto = session.get(Piloto.class, id);
        session.beginTransaction();
        session.remove(piloto);
        session.getTransaction().commit();
        
    }

    @Override
    public void updatePiloto(Piloto piloto) {
        
        session.beginTransaction();
        session.update(piloto);
        session.getTransaction().commit();
        
    }


    @Override
    public void insertData() {
        
        session.beginTransaction();
        Piloto p = new Piloto("p_sv", "Sebastia Vettel", 1987, 5, 2007, 4, "sebastian-vettel-2022.png");
        session.save(p);
        p = new Piloto("p_ls", "Lance Stroll", 1998, 18, 2017 , 0, "lance-stroll-2022.png");
        session.save(p);
        p = new Piloto("p_fa", "Fernando Alonso", 1981, 14, 2001, 2, "fernando-alonso-2022.png");
        session.save(p);
        p = new Piloto("p_eo", "Esteban Ocon", 1996, 31, 2016, 0, "esteban-ocon-2022.png");
        session.save(p);
        session.getTransaction().commit();

        
        
    }



    
}
