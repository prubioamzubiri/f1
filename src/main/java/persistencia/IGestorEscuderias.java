package persistencia;

import java.util.List;

import dominio.Escuderia;

public interface IGestorEscuderias {

    public List<Escuderia> getEscuderias();

    public Escuderia getEscuderia(String id);

    public void addEscuderia(Escuderia escuderia);

    public void removeEscuderia(String id);

    public void updateEscuderia(Escuderia escuderia);

    public void insertData();
    
}
