package com.projeto.integrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrador.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
