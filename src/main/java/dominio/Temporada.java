package dominio;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Temporada {
	
	private int ano;
	
	private ArrayList<Equipo> equipos;
	
	private ArrayList<Carrera> carreras;
	
	public Temporada(int ano)
	{
		this.ano = ano;
		
		equipos = new ArrayList<Equipo>();
		
		carreras = new ArrayList<Carrera>();
	}
	
	public Temporada()
	{
		equipos = new ArrayList<Equipo>();
		
		carreras = new ArrayList<Carrera>();
	}

}
