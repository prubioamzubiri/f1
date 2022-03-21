package persistencia;

import java.util.List;

import javax.persistence.Query;

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
        
        return session.createQuery("SELECT a FROM Student a", Piloto.class).getResultList();   
        
    }

    @Override
    public Piloto getPiloto(String id) {
        
        Piloto toReturn = session.get(Piloto.class, id);

        return toReturn;
    }

    @Override
    public void addPiloto(Piloto piloto) {
        
        session.save(piloto);
        
    }

    @Override
    public void removePiloto(String id) {
       
        Piloto piloto = session.get(Piloto.class, id);
        session.remove(piloto);
        
    }

    @Override
    public void updatePiloto(Piloto piloto) {
        
        session.update(piloto);
        
    }



    
}
