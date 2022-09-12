package com.projeto.integrador.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "aula")
@Data

public class Aula {
	
	@Id
	@Column(name="id_aula")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_aula;
	
	@Column(name = "video", nullable = true)
	private String video;
	
	@Column(name = "texto", nullable = true)
	private String texto;
	
	@Column(name = "exercicio", nullable = true)
	private String exercicio;
	
	@ManyToMany
	private List<Curso> curso = new ArrayList<>();
	public Aula() {
		
	}
	


}
