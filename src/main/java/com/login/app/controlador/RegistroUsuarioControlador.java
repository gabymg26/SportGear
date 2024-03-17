package com.login.app.controlador;

import com.login.app.controlador.dto.UsuarioRegistroDTO;
import com.login.app.modelo.Rol;
import com.login.app.servicio.UsuarioServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {

    private UsuarioServicio usuarioServicio;

    public RegistroUsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDTO();
    }

    @ModelAttribute("roles")
    public List<Rol> obtenerRoles() {
        // Crear objetos de rol para "Estudiante" y "Administrativo"
        Rol estudiante = new Rol("Estudiante");
        Rol administrativo = new Rol("Administrativo");

        List<Rol> roles = new ArrayList<>();
        roles.add(estudiante);
        roles.add(administrativo);
        return roles;
    }

    @GetMapping
    public String mostrarFormularioDeRegistro(Model modelo){
        return "registro";
    }

    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario")UsuarioRegistroDTO registroDTO){
        usuarioServicio.guardarUsuario(registroDTO);
        return "redirect:/registro?exito";
    }


}
