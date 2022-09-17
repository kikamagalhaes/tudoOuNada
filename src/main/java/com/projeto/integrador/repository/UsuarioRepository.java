package com.projeto.integrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.integrador.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(value = "select u from Usuario u where u.nome like %?1%")
    List<Usuario> burcarPorNome(String nome);
}
