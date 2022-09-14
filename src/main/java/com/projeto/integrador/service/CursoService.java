package com.projeto.integrador.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.projeto.integrador.exception.DefaultException;
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
		public Curso buscarPorIdOuFalhar(Integer id) {
			return cursoRepository.findById(id).orElseThrow(new DefaultException
					(HttpStatus.BAD_REQUEST,"O curso informado não existe."));
		}
		
		public void deletar(Integer id) {
			var objeto = buscarPorIdOuFalhar(id);
			cursoRepository.delete(objeto);
		}
		
		public Curso atualizar(Integer id, CursoRequest cursoRequest) {
			var entity = buscarPorIdOuFalhar(id);
			BeanUtils.copyProperties(cursoRequest, entity, "id");
			return cursoRepository.save(entity);
		}


}
