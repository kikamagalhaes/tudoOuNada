package com.projeto.integrador;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.projeto.integrador.model.Usuario;
import com.projeto.integrador.repository.UsuarioRepository;
import com.projeto.integrador.service.UsuarioService;

@SpringBootTest
public class UsuarioMockTest {

    @InjectMocks
    private UsuarioService usuarioService;

    @Mock
    private UsuarioRepository usuarioRepository;

    @Test
    public void testarBuscarPorId(){
        var obj = mockUsuario();
        when(usuarioRepository.findById(any())).thenReturn(Optional.of(obj));
        var mock = usuarioService.buscarPorId(1);
        assertEquals(mock,obj);
    }

    public Usuario mockUsuario(){
        Usuario usuario = new Usuario();
        usuario.setEmail("email");
        usuario.setNome("nome");
        usuario.setWhatsapp("9999999");
        return usuario;
    }
}