package pe.edu.upeu.examen02.service;

import java.util.List;

import pe.edu.upeu.examen02.entity.Libros;

public interface LibroService {
	Libros create(Libros libros);
	List<Libros> readAll();
	Libros read(int id);
	void delete(int id);
	Libros update(Libros libros);
}
