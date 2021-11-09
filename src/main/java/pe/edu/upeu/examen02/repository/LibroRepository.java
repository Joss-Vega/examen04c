package pe.edu.upeu.examen02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examen02.entity.Libros;

@Repository

public interface LibroRepository extends JpaRepository<Libros, Integer>{

}
