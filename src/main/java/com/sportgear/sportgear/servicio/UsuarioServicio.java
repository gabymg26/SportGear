package com.login.app.servicio;

import com.login.app.controlador.dto.UsuarioRegistroDTO;
import com.login.app.modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public  interface UsuarioServicio extends UserDetailsService {
    public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO);

    public List<Usuario> listarUsuarios();

}
