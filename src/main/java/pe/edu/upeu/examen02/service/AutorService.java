package pe.edu.upeu.examen02.service;

import java.util.List;

import pe.edu.upeu.examen02.entity.Autores;

public interface AutorService {
	Autores create(Autores autores);
	List<Autores> readAll();
	Autores read(int id);
	void delete(int id);
	Autores update(Autores autores);
}
