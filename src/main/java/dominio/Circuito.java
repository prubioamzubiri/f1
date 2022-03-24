package dominio;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Circuito")
public class Circuito {
	
	@Id
	private String id;

	private String pais;
	
	private String nombre_circuito;
	
	private int distancia;

}
