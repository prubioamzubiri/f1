package dominio;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Ingeniero")
public class Ingeniero {
	
	@Id
	private String id;

	private String nombre;
	
	private int ano_nacimiento;

}
