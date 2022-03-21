package dominio;

import java.util.Date;
import java.util.HashMap;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Carrera {
	
	private String nombre_gp;

	private Circuito circuito;
	
	private Date fecha_gp;
	
	private int ano;
	
	private HashMap<Integer, Piloto> pilotos_por_posicion;
	
	public Carrera(String nombre_gp, Date fecha_gp, Circuito ciruito, int ano)
	{
		this.nombre_gp = nombre_gp;
		this.ano = ano;
		this.fecha_gp = fecha_gp;
		this.circuito = circuito;
		
		pilotos_por_posicion = new HashMap<Integer, Piloto>();
	}
	
	public Carrera()
	{
		pilotos_por_posicion = new HashMap<Integer, Piloto>();
	}
}
