package com.projeto.integrador.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.projeto.integrador.exception.DefaultException;
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

	public Usuario buscarPorIdOuFalhar(Integer id) {
		return usuarioRepository.findById(id).orElseThrow(new DefaultException
				(HttpStatus.BAD_REQUEST,"O usuário informado não existe."));
}

	public void deletar(Integer id) {
		var objeto = buscarPorIdOuFalhar(id);
		usuarioRepository.delete(objeto);
	}

	public Usuario atualizar(Integer id, UsuarioRequest usuarioRequest) {
		var entity = buscarPorIdOuFalhar(id);
		BeanUtils.copyProperties(usuarioRequest, entity, "id");
		return usuarioRepository.save(entity);
	}

}