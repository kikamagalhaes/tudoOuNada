package com.projeto.integrador.resource;

import java.util.List;

import javax.validation.Valid;

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
		//throw new DefaultException(HttpStatus.BAD_REQUEST, "Minha Primeira Exceção");
		return aulaService.salvar(aulaRequest);
	}
	
	@GetMapping(path = "buscar")
	public String buscar(@RequestParam String tituloAula) {
		System.out.println(tituloAula);
		return "AULA " + tituloAula;
	}
	
	@GetMapping(path = "todos")
	public List<Aula> buscar() {
		return aulaService.buscarTodos();
	}

	@GetMapping(path = "{id:[0-9]+}")
	public Aula buscarPorId(@PathVariable Integer id) {
		return aulaService.buscarPorIdOuFalhar(id);
	}
	
	@DeleteMapping(path = "{id}")
	public void deletar(@PathVariable Integer id) {
		aulaService.deletar(id);
	}
	
	@PutMapping(path = "{id}")
	public Aula update(@PathVariable Integer id, @RequestBody AulaRequest aulaRequest) {
		return aulaService.atualizar(id, aulaRequest);
	}
	
	@PatchMapping(path = "video/{id}")
	public Aula atualizarUnico(@PathVariable Integer id, @RequestBody String video) {
		return aulaService.atualizarVideo(id, video);
	}

}
