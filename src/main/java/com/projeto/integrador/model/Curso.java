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
@Table(name = "curso")
@Data
@Builder
public class Curso {
	@Id
	@Column(name="id_curso")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_curso;
	
	@Column(name = "titulo", nullable = true)
	private String titulo;
	
	@Column(name = "assunto", nullable = true)
	private String assunto;
	
	@Column(name = "descricao", nullable = true)
	private String descricao;
	
	@Column(name = "conteudo", nullable = true)
	private String conteudo;

	@ManyToMany
	private List<Aula> aula;
	
	@ManyToMany
	private List<Usuario> usuario;

}
