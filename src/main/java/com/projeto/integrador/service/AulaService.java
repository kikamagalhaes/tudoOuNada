package com.projeto.integrador.service;

import com.projeto.integrador.model.Aula;
import com.projeto.integrador.repository.AulaRepository;
import com.projeto.integrador.controller.AulaRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AulaService {

    @Autowired
    private AulaRepository aulaRepository;
    public void salvar(){
        var obj = aulaRepository.findById(5l);
        System.out.println(obj.toString());
        Aula aula = null;
        
        aulaRepository.save(aula);

    }

}
