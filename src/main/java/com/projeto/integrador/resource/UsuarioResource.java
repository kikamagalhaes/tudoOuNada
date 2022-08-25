package com.projeto.integrador.resource;

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
	

}


//