package com.projeto.integrador.resource;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.integrador.model.Curso;
import com.projeto.integrador.service.CursoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/curso")
@AllArgsConstructor
public class CursoResource {
	
	private final CursoService cursoService;
	
	
	@PostMapping
	public Curso salvar(@RequestBody @Valid CursoRequest cursoRequest) {
		return cursoService.salvar(cursoRequest);
	}
	
	@GetMapping(path = "buscar")
	public String buscar(@RequestParam String tituloCurso) {
		System.out.println(tituloCurso);
		return "CURSO" + tituloCurso;
	}


}
