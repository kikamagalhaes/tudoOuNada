package com.projeto.integrador.resource;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.integrador.model.Aula;
import com.projeto.integrador.service.AulaService;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping(value = "/aula")
@AllArgsConstructor
public class AulaResource {
	
	private final AulaService aulaService;
	
	@PostMapping
	public Aula salvar(@RequestBody AulaRequest aulaRequest) {
		return aulaService.salvar(aulaRequest);
	}
	
	@PersistenceContext
	private EntityManager manager;
	
	
	@GetMapping("/aulas")
	public List<Aula> listar() {
		return manager.createQuery("from Aula",Aula.class).getResultList();
	}

}
