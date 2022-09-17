package com.projeto.integrador.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.integrador.model.Usuario;
import com.projeto.integrador.service.UsuarioService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/usuario")
@AllArgsConstructor
public class UsuarioResource {
	
	private final UsuarioService usuarioService;
	
	@PostMapping
	public Usuario salvar(@RequestBody UsuarioRequest usuarioRequest) {
		return usuarioService.salvar(usuarioRequest);
	}
	
	@GetMapping(path = "buscarPorNome/{nome}")
	public List<Usuario> buscaPorNome(@PathVariable String nome) {
		return usuarioService.buscarPorNome(nome);
	}
	
	@GetMapping(path = "todos")
	public List<Usuario> buscar(){
		return usuarioService.buscarTodos();
	}
	
	@GetMapping(path = "{id:[0-9]+}")
	public Usuario buscarPorId(@PathVariable Integer id) {
		return usuarioService.buscarPorId(id);
	}


}

