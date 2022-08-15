package com.projeto.integrador.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "aula")
public class AulaResource {

	//PARÂMETROS FORNECIDOS PELO QUERY STRING
	@GetMapping(path = "listar")
	public String buscar (@RequestParam String tituloAula) {
		return null;
	}


    }

