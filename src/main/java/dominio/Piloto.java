package dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Piloto {
	
	private String nombre;
	
	private int año_nacimiento;
	
	private int primera_temporada;
	
	private int mundiales;

}
