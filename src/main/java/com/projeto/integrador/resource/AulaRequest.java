package com.projeto.integrador.resource;

import java.util.List;


import com.projeto.integrador.model.Aula;
import com.projeto.integrador.model.Curso;
import lombok.Data;

@Data
public class AulaRequest {
	
	private Integer id_aula;
	private String video;
	private String texto;
	private String exercicio;
	private List<Curso> curso;
	
	public Aula converterAula() {
		return Aula.builder().video(this.video).texto(this.texto).exercicio
				(this.exercicio).curso(this.curso).build();
	}


}
