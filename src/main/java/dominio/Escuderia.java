package dominio;

import java.util.ArrayList;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="Escuderia")
public class Escuderia {
	
	@Id
	private String id;


	private String nombre_escuderia;

	private int mundiales_de_constructores;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Escuderia_id")
	private ArrayList<Piloto> pilotos;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Escuderia_id")
	private ArrayList<Ingeniero> ingenieros;
	
	@OneToOne(mappedBy = "Escuderia", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Ingeniero jefe_escuderia;
	
	public Escuderia(String nombre_escuderia,  int mundiales_de_constructores)
	{
		this.nombre_escuderia = nombre_escuderia;
		this.mundiales_de_constructores = mundiales_de_constructores;
		
		ingenieros = new ArrayList<Ingeniero>();
		
		pilotos = new ArrayList<Piloto>();
	}
	
	public Escuderia(String nombre_escuderia,  int mundiales_de_constructores, Ingeniero jefe_escuderia)
	{
		this.nombre_escuderia = nombre_escuderia;
		this.mundiales_de_constructores = mundiales_de_constructores;
		this.jefe_escuderia = jefe_escuderia;
		
		ingenieros = new ArrayList<Ingeniero>();
		
		ingenieros.add(jefe_escuderia);
		
		pilotos = new ArrayList<Piloto>();
	}
	
	public Escuderia()
	{
		
		ingenieros = new ArrayList<Ingeniero>();
		
		pilotos = new ArrayList<Piloto>();
	}
	
	public void setJefe_escuderia(Ingeniero jefe)
	{
		if(!ingenieros.contains(jefe))
		{
			ingenieros.add(jefe);
		}
		
		this.jefe_escuderia= jefe;
	}


}
