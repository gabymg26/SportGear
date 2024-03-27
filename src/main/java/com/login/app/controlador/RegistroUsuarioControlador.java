package com.login.app.controlador;

import com.login.app.controlador.dto.UsuarioRegistroDTO;
import com.login.app.servicio.UsuarioServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {

    private UsuarioServicio usuarioServicio;

    public RegistroUsuarioControlador(UsuarioServicio usuarioServicio) {
        super();
        this.usuarioServicio = usuarioServicio;
    }

    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
        return new UsuarioRegistroDTO();
    }

    @GetMapping
    public String mostrarFormularioDeRegistro(Model model) {
        List<String> rolesDisponibles = Arrays.asList("Estudiante", "Administrativo"); // Suponiendo que tengas esta lista de roles
        model.addAttribute("roles", rolesDisponibles);
        return "registro";
    }

    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO, String rol) {
        usuarioServicio.guardar(registroDTO, rol);
        return "redirect:/registro?exito";
    }
}

