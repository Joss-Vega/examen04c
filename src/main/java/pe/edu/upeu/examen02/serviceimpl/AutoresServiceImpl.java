package pe.edu.upeu.examen02.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen02.entity.Autores;
import pe.edu.upeu.examen02.repository.AutorRepository;
import pe.edu.upeu.examen02.service.AutorService;

@Service
public class AutoresServiceImpl implements AutorService {

	@Autowired
	private AutorRepository autorRepository;

	@Override
	public Autores create(Autores pc) {
		// TODO Auto-generated method stub
		return autorRepository.save(pc);
	}

	@Override
	public List<Autores> readAll() {
		// TODO Auto-generated method stub
		return autorRepository.findAll();
	}

	@Override
	public Autores read(int id) {
		// TODO Auto-generated method stub
		return autorRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		autorRepository.deleteById(id);
	}

	@Override
	public Autores update(Autores pc) {
		// TODO Auto-generated method stub
		return autorRepository.save(pc);
	}

}
