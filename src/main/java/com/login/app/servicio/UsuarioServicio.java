package com.login.app.servicio;

import com.login.app.dto.UsuarioRegistroDTO;
import com.login.app.modelo.Usuario;

public  interface UsuarioServicio{
    public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO);
}
