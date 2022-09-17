package com.projeto.integrador.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	

	@GetMapping(path = "buscarPorTitulo/{titulo}")
	public List<Curso> buscaPorTitulo(@PathVariable String titulo) {
		return cursoService.buscaPorTitulo(titulo);
	}
	
	@GetMapping(path = "todos")
	public List<Curso> buscar() {
		return cursoService.buscarTodos();
		
	}
	
	@GetMapping(path = "{id:[0-9]+}")
	public Curso buscarPorId(@PathVariable Integer id) {
		return cursoService.buscarPorId(id);
	}




}
