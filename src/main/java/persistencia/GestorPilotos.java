package persistencia;

import java.util.ArrayList;

import dominio.Piloto;

public interface GestorPilotos {
	
	public ArrayList<Piloto> getPilotos();
	
	public void addPiloto(Piloto piloto);
	
	public void removePiloto(String id);
	
	public void updatePiloto(Piloto piloto);

}
