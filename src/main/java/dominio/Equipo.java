package dominio;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Equipo {
	
	private String nombre_equipo;
	
	private int primer_ano;
	
	private int mundiales_de_constructores;
	
	private ArrayList<Piloto> pilotos;
	
	private ArrayList<Ingeniero> ingenieros;
	
	private Ingeniero jefe_equipo;
	
	public Equipo(String nombre_equipo, int primer_ano, int mundiales_de_constructores)
	{
		this.nombre_equipo = nombre_equipo;
		this.mundiales_de_constructores = mundiales_de_constructores;
		this.primer_ano = primer_ano;
		
		ingenieros = new ArrayList<Ingeniero>();
		
		pilotos = new ArrayList<Piloto>();
	}
	
	public Equipo(String nombre_equipo, int primer_ano, int mundiales_de_constructores, Ingeniero jefe_de_equipo)
	{
		this.nombre_equipo = nombre_equipo;
		this.mundiales_de_constructores = mundiales_de_constructores;
		this.primer_ano = primer_ano;
		this.jefe_equipo = jefe_de_equipo;
		
		ingenieros = new ArrayList<Ingeniero>();
		
		ingenieros.add(jefe_de_equipo);
		
		pilotos = new ArrayList<Piloto>();
	}
	
	public Equipo()
	{
		
		ingenieros = new ArrayList<Ingeniero>();
		
		pilotos = new ArrayList<Piloto>();
	}


}
