package pe.edu.upeu.examen02.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen02.entity.Libros;
import pe.edu.upeu.examen02.repository.LibroRepository;
import pe.edu.upeu.examen02.service.LibroService;

@Service
public class LibrosServiceImpl implements LibroService {

	@Autowired
	private LibroRepository libroRepository;

	@Override
	public Libros create(Libros pc) {
		// TODO Auto-generated method stub
		return libroRepository.save(pc);
	}

	@Override
	public List<Libros> readAll() {
		// TODO Auto-generated method stub
		return libroRepository.findAll();
	}

	@Override
	public Libros read(int id) {
		// TODO Auto-generated method stub
		return libroRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		libroRepository.deleteById(id);
	}

	@Override
	public Libros update(Libros pc) {
		// TODO Auto-generated method stub
		return libroRepository.save(pc);
	}

}

