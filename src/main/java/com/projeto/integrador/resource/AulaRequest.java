package com.projeto.integrador.resource;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.projeto.integrador.model.Aula;
import com.projeto.integrador.model.Curso;
import lombok.Data;

@Data
public class AulaRequest {
	
	@NotNull(message = "O campo VÍDEO não pode ser nulo!")
	private String video;
	
	@NotNull(message = "O campo TEXTO não pode ser nulo!")
	private String texto;
	
	@NotNull(message = "O campo EXERCÍCIO não pode ser nulo!")
	private String exercicio;
	
	private List<Curso> curso;
	
	public Aula converterAula() {
		return Aula.builder().video(this.video).texto(this.texto).exercicio
				(this.exercicio).curso(this.curso).build();
	}


}