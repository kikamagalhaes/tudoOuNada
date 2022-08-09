package com.projeto.integrador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "matricula")
@Data
@Builder
public class Matricula {
	@Id
	@Column(name="id_matricula")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_matricula;
	
	@Column(name = "id_usuario_matricula")
	private Integer id_usuario_matricula;
	
	@Column(name = "id_curso_matricula")
	private Integer id_curso_matricula;

	
	

}
