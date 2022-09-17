package com.projeto.integrador;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.projeto.integrador.model.Curso;
import com.projeto.integrador.repository.CursoRepository;
import com.projeto.integrador.service.CursoService;


@SpringBootTest
public class CursoMockTest {

    @InjectMocks
    private CursoService cursoService;

    @Mock
    private CursoRepository cursoRepository;

    @Test
    public void testarBuscarPorId(){
        var obj = mockCurso();
        when(cursoRepository.findById(any())).thenReturn(Optional.of(obj));
        var mock = cursoService.buscarPorId(1);
        assertEquals(mock,obj);
    }

    public Curso mockCurso(){
        Curso curso = new Curso();
        curso.setId_curso(1);
        return curso;
    }
}