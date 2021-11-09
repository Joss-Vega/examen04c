package pe.edu.upeu.examen02.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libros")
public class Libros implements Serializable{
	
	private static final long serialVersionUID = -962936564953879252L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idlibro")
	private int id;
	private String titulo;
	private int paginas;
	private String descripcion;
	
	
	@ManyToOne
	@JoinColumn(name="autor_id", nullable = false)
	private Autores autores;
	
	@ManyToOne
	@JoinColumn(name="editorial_id", nullable = false)
	private Editoriales editoriales;
}
