package com.projeto.integrador.service;

import org.springframework.stereotype.Component;

import com.projeto.integrador.model.Curso;
import com.projeto.integrador.repository.CursoRepository;
import com.projeto.integrador.resource.CursoRequest;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CursoService {
	
	private final CursoRepository cursoRepository;
	
	public Curso salvar(CursoRequest cursoRequest) {
		return cursoRepository.save(cursoRequest.converterCurso());
	}
	
	

}
