package pe.edu.upeu.examen02.service;

import java.util.List;

import pe.edu.upeu.examen02.entity.Editoriales;

public interface EditorialService {
	Editoriales create(Editoriales editoriales);
	List<Editoriales> readAll();
	Editoriales read(int id);
	void delete(int id);
	Editoriales update(Editoriales editoriales);
}
