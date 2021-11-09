package pe.edu.upeu.examen02.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen02.entity.Editoriales;
import pe.edu.upeu.examen02.repository.EditorialRepository;
import pe.edu.upeu.examen02.service.EditorialService;

@Service
public class EditorialesServiceImpl implements EditorialService {

	@Autowired
	private EditorialRepository editorialRepository;

	@Override
	public Editoriales create(Editoriales pc) {
		// TODO Auto-generated method stub
		return editorialRepository.save(pc);
	}

	@Override
	public List<Editoriales> readAll() {
		// TODO Auto-generated method stub
		return editorialRepository.findAll();
	}

	@Override
	public Editoriales read(int id) {
		// TODO Auto-generated method stub
		return editorialRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		editorialRepository.deleteById(id);
	}

	@Override
	public Editoriales update(Editoriales pc) {
		// TODO Auto-generated method stub
		return editorialRepository.save(pc);
	}

}
