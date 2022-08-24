package com.projeto.integrador.service;

import org.springframework.stereotype.Component;

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
	
}
