package com.projeto.integrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.integrador.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
