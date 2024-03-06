package com.login.app.servicio;

import com.login.app.dto.UsuarioRegistroDTO;
import com.login.app.modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public  interface UsuarioServicio extends UserDetailsService {
    public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO);
}
