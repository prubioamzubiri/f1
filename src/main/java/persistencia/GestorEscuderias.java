package persistencia;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import dominio.Escuderia;
import dominio.Ingeniero;
import dominio.Piloto;

public class GestorEscuderias implements IGestorEscuderias{

    Session session;

    public GestorEscuderias(Session session)
    {
        this.session = session;
    }
    

    @Override
    public List<Escuderia> getEscuderias() {
        
        return session.createQuery("from Escuderia", Escuderia.class).getResultList();

    }

    @Override
    public Escuderia getEscuderia(String id) {

        Escuderia toReturn = session.get(Escuderia.class, id);

        return toReturn;

    }

    @Override
    public void addEscuderia(Escuderia escuderia) {

        session.beginTransaction();
        session.save(escuderia);
        session.getTransaction().commit(); 
        
    }

    @Override
    public void removeEscuderia(String id) {
        
        Escuderia escuderia = session.get(Escuderia.class, id);
        session.beginTransaction();
        session.remove(escuderia);
        session.getTransaction().commit();
        
    }

    @Override
    public void updateEscuderia(Escuderia escuderia) {

        session.beginTransaction();
        session.update(escuderia);
        session.getTransaction().commit();
        
    }

    @Override
    public void insertData() {
        
        session.beginTransaction();

        //*************** */
        //Alpine
        //*************** */

        ArrayList<Piloto> listaPilotosAlpine = new ArrayList<Piloto>();
        ArrayList<Ingeniero> listaIngenierosAlpine = new ArrayList<Ingeniero>();

        Piloto p = session.get(Piloto.class, "p_fa");     
        listaPilotosAlpine.add(p);

        p = session.get(Piloto.class, "p_eo");
        listaPilotosAlpine.add(p);

        Ingeniero i = session.get(Ingeniero.class, "i_alp_pf");
        listaIngenierosAlpine.add(i);

        i = session.get(Ingeniero.class, "i_alp_os");
        listaIngenierosAlpine.add(i);

        Escuderia alpine = new Escuderia("e_alp", "Alpine", 0, listaPilotosAlpine, listaIngenierosAlpine, i, "alpine.jpeg");
        session.save(alpine);

        //*************** */
        //Aston Martin
        //*************** */

        ArrayList<Piloto> listaPilotosAston = new ArrayList<Piloto>();
        ArrayList<Ingeniero> listaIngenierosAston = new ArrayList<Ingeniero>();

        p = session.get(Piloto.class, "p_sv");     
        listaPilotosAston.add(p);

        p = session.get(Piloto.class, "p_ls");
        listaPilotosAston.add(p);

        i = session.get(Ingeniero.class, "i_am_mk");
        listaIngenierosAston.add(i);

        i = session.get(Ingeniero.class, "i_am_tm");
        listaIngenierosAston.add(i);

        Escuderia aston = new Escuderia("e_ast", "Aston Martin", 0, listaPilotosAston, listaIngenierosAston, i, "astonMartin.png");
        session.save(aston);


        session.getTransaction().commit();



        
    }


    
}