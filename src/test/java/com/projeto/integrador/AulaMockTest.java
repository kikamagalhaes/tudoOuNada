package com.projeto.integrador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.projeto.integrador.model.Aula;
import com.projeto.integrador.repository.AulaRepository;
import com.projeto.integrador.service.AulaService;

@SpringBootTest
public class AulaMockTest {

    @InjectMocks
    private AulaService aulaService;

    @Mock
    private AulaRepository aulaRepository;

    @Test
    public void testarBuscarPorId(){
        var obj = mockAula();
        when(aulaRepository.findById(any())).thenReturn(Optional.of(obj));
        var mock = aulaService.buscarPorId(0);
        assertEquals(mock,obj);
    }


    public Aula mockAula(){
        Aula aula = new Aula();
        aula.setExercicio("exercicio");
        aula.setId_aula(11);
        aula.setTexto("texto");
        aula.setVideo("video");
        return aula;
    }

}
