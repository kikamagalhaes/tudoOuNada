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
		Aula aula = new Aula();
		aula.setExercicio(this.exercicio);
		aula.setTexto(this.texto);
		aula.setVideo(this.video);
		aula.setCurso(this.curso);;
		return aula;
	}


}
