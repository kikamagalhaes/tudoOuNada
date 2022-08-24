package com.projeto.integrador.resource;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.projeto.integrador.model.Aula;
import com.projeto.integrador.model.Curso;
import com.projeto.integrador.model.Usuario;
import lombok.Data;

@Data
public class CursoRequest {
	
	@NotNull(message = "O campo TÍTULO não pode ser nulo!")
	private String titulo;
	private String assunto;
	private String descricao;
	private String conteudo;
	private List<Aula> aula;
	private List<Usuario> usuario;
	
	public Curso converterCurso() {
		return Curso.builder().titulo(this.titulo).assunto(this.assunto)
				.descricao(this.descricao).conteudo(this.conteudo).aula(this.aula)
				.usuario(this.usuario).build();
	}


}
