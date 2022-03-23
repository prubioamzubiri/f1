package persistencia;

import java.util.List;

import dominio.Ingeniero;

public interface IGestorIngeniero {

    public List<Ingeniero> getIngenieros();

    public Ingeniero getIngeniero(String id);

    public void addIngeniero(Ingeniero ingeniero);

    public void removeIngeniero(String id);

    public void updateIngeniero(Ingeniero ingeniero);

    public void insertData();
    
}
