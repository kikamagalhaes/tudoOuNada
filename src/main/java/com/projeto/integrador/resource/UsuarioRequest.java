package com.projeto.integrador.resource;

import java.util.List;
import com.projeto.integrador.model.Curso;
import com.projeto.integrador.model.Usuario;

import lombok.Data;

@Data
public class UsuarioRequest {
	private String nome;
	private String email;
	private String whatsapp;
	private Boolean professor;
	private List<Curso> curso;
	
	public Usuario converterUsuario() {
		Usuario usuario = new Usuario();
		usuario.setEmail(this.email);
		usuario.setNome(this.nome);
		usuario.setWhatsapp(this.whatsapp);
		usuario.setProfessor(this.professor);
		usuario.setCurso(curso);
		return usuario;
	}


}
