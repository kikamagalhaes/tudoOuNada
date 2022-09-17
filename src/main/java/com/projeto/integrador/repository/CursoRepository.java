package com.projeto.integrador.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.integrador.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{
    @Query(value = "select c from Curso c where c.titulo like %?1%")
    List<Curso> buscarPorTitulo(String titulo);
    
}
