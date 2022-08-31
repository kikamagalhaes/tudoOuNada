package com.projeto.integrador.resource;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Aula salvar(@RequestBody @Valid AulaRequest aulaRequest) {
		return aulaService.salvar(aulaRequest);
	}
	
	@GetMapping(path = "buscar")
	public String buscar(@RequestParam String tituloAula) {
		System.out.println(tituloAula);
		return "AULA" + tituloAula;
	}
	

}
