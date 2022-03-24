package persistencia;

import java.util.List;

import dominio.Escuderia;

public interface IGestorEscuderias {

    public List<Escuderia> getEscuderias();

    public Escuderia getEscuderia(String id);

    public void addEscuderia(Escuderia Escuderia);

    public void removeEscuderia(String id);

    public void updateEscuderia(Escuderia Escuderia);

    public void insertData();
    
}
