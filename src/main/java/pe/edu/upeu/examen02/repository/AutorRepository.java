package pe.edu.upeu.examen02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examen02.entity.Autores;


@Repository
public interface AutorRepository extends JpaRepository<Autores, Integer>{

}







