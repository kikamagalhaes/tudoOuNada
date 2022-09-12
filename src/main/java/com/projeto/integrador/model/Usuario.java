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
@Table(name = "usuario")
@Data

public class Usuario {
	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	
	@Column(name = "nome", nullable = true)
	private String nome;
	@Column(name = "email", nullable = true)
	private String email;
	
	@Column(name = "whatsapp", nullable = true)
	private String whatsapp;
	
	@Column(name = "professor", nullable = true)
	private Boolean professor;
	
	@ManyToMany
	private List<Curso> curso = new ArrayList<>();
	public Usuario() {
		
	}

}
