package dominio;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Pilotos")
public class Piloto {
	
	@Id
//	@GeneratedValue
	@Column(name="id")
	private String id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="ano_nacimiento")
	private int año_nacimiento;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="primera_temporada")
	private int primera_temporada;
	
	@Column(name="mundiales")
	private int mundiales;
	
	public String getFotoPiloto()
	{
		return "fotos/piloto/" + this.id;
	}

}
