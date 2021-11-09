package pe.edu.upeu.examen02.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autores")
public class Autores implements Serializable{
    private static final long serialVersionUID = -962936564953879252L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idautor")
	private int id;
	private String nombres;
	private String apellidos;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="idlibro")
	private Set<Libros> libros;
	
}
