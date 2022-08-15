package com.projeto.integrador.controller;
import javax.print.attribute.standard.Media;

import com.projeto.integrador.service.AulaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

