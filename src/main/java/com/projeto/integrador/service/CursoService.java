package com.projeto.integrador.service;

import java.util.List;
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
	 public List<Curso> buscarTodos(){
		 return cursoRepository.findAll();
	 }
		public Curso buscarPorId(Integer id) {
			return cursoRepository.findById(id).get();
			
		
		}

	public List<Curso> buscaPorTitulo(String titulo){
		return cursoRepository.buscarPorTitulo(titulo);
	}


	


}
