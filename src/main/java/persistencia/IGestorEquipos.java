package persistencia;

import java.util.List;

import dominio.Equipo;

public interface IGestorEquipos {

    public List<Equipo> getEquipos();

    public Equipo getEquipo(String id);

    public void addEquipo(Equipo equipo);

    public void removeEquipo(String id);

    public void updateEquipo(Equipo equipo);

    public void insertData();
    
}
