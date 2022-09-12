package com.projeto.integrador.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.projeto.integrador.model.Usuario;
import com.projeto.integrador.repository.UsuarioRepository;
import com.projeto.integrador.resource.UsuarioRequest;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
	public Usuario salvar(UsuarioRequest usuarioRequest) {
		return usuarioRepository.save(usuarioRequest.converterUsuario());
	}
	
	public List<Usuario> buscarTodos(){
		return usuarioRepository.findAll();
	}

	public Usuario buscarPorId(Integer id) {
		return usuarioRepository.findById(id).get();
		
	}

}
