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
		return Usuario.builder().nome(this.nome).email(this.email)
				.whatsapp(this.whatsapp).professor(this.professor)
				.curso(this.curso).build();
	}


}
