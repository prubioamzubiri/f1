package dominio;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Temporada {
	
	private int ano;
	
	private ArrayList<Escuderia> escuderias;
	
	private ArrayList<Carrera> carreras;
	
	public Temporada(int ano)
	{
		this.ano = ano;
		
		escuderias = new ArrayList<Escuderia>();
		
		carreras = new ArrayList<Carrera>();
	}
	
	public Temporada()
	{
		escuderias = new ArrayList<Escuderia>();
		
		carreras = new ArrayList<Carrera>();
	}

}
