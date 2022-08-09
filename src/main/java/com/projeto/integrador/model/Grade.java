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
@Table(name = "grade")
@Data
@Builder
public class Grade {
	@Id
	@Column(name="id_grade")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_grade;
	
	@Column(name = "id_curso_grade")
	private Integer id_curso_grade;

	@Column(name = "id_aula_grade")
	private Integer id_aula_grade;


}
