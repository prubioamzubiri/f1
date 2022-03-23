package dominio;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="Equipo")
public class Equipo {
	
	@Id
	private String id;


	private String nombre_equipo;

	private int mundiales_de_constructores;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Equipo_id")
	private ArrayList<Piloto> pilotos;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Equipo_id")
	private ArrayList<Ingeniero> ingenieros;
	
	@OneToOne(mappedBy = "Equipo", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
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
	
	public void setJefe_equipo(Ingeniero jefe)
	{
		if(!ingenieros.contains(jefe))
		{
			ingenieros.add(jefe);
		}
		
		this.jefe_equipo = jefe;
	}


}
