package persistencia;

import java.util.ArrayList;
import java.util.List;

import dominio.Piloto;

public interface IGestorPilotos {
	
	public List<Piloto> getPilotos();

	public Piloto getPiloto(String id);
	
	public void addPiloto(Piloto piloto);
	
	public void removePiloto(String id);
	
	public void updatePiloto(Piloto piloto);

}
