package dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circuito {
	
	private String pais;
	
	private String nombre_circuito;
	
	private int distancia;

}
