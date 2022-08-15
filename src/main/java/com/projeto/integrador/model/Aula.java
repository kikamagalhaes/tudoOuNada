package com.projeto.integrador.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
@Entity
@Table(name = "aula")
@Data
@Builder
public class Aula {
	
	public Aula() {
    }

    @Id
	@Column(name="id_aula")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_aula;

	@Column(name = "tituloAula", nullable = true)
	private String tituloAula;
	
	@Column(name = "video", nullable = true)
	private String video;
	
	@Column(name = "texto", nullable = true)
	private String texto;
	
	@Column(name = "exercicio", nullable = true)
	private String exercicio;
	
	@ManyToMany
	private List<Curso> curso;
	
	


}
