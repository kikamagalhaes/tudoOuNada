package com.projeto.integrador.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.projeto.integrador.exception.DefaultException;
import com.projeto.integrador.model.Aula;
import com.projeto.integrador.repository.AulaRepository;
import com.projeto.integrador.resource.AulaRequest;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AulaService {
	
	private final AulaRepository aulaRepository;
	
	public Aula salvar(AulaRequest aulaRequest) {
		return aulaRepository.save(aulaRequest.converterAula());
	}
	
	public List<Aula> buscarTodos(){
		return aulaRepository.findAll();
	}
	
	public Aula buscarPorIdOuFalhar(Integer id) {
		return aulaRepository.findById(id).orElseThrow(new DefaultException
				(HttpStatus.BAD_REQUEST,"A aula informada não existe."));
		
		/* Outra forma de fazer (usar o de cima):
		  var salaBusca = aulaRepository.findById(id);
		if(!salaBusca.isPresent()) {
			throw new DefaultException
			(HttpStatus.BAD_REQUEST,"A aula informada não existe.");
		}
			return salaBusca.get();*/
	}
	
	public void deletar(Integer id) {
		var objeto = buscarPorIdOuFalhar(id);
		aulaRepository.delete(objeto);
	}
	
	public Aula atualizar(Integer id, AulaRequest aulaRequest) {
		var entity = buscarPorIdOuFalhar(id);
		BeanUtils.copyProperties(aulaRequest, entity, "id");
		return aulaRepository.save(entity);
	}
	
	public Aula atualizarVideo(Integer id, String video) {
		var entity = buscarPorIdOuFalhar(id);
		entity.setVideo(video);
		return aulaRepository.save(entity);
	}

}
