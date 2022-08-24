package com.projeto.integrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrador.model.Aula;

public interface AulaRepository extends JpaRepository<Aula, Integer> {
	

}
