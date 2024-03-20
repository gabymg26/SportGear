package com.login.app.controlador;

import com.login.app.controlador.dto.UsuarioRegistroDTO;
import com.login.app.modelo.Rol;
import com.login.app.servicio.UsuarioServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public List<String> obtenerRoles() {
        return Arrays.asList("Estudiante", "Administrativo");
    }

    @GetMapping
    public String mostrarFormularioDeRegistro(Model modelo){
        return "registro";
    }

    @PostMapping
    //Lo modifico con los de los roles, desde los parametros
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario")UsuarioRegistroDTO registroDTO,@RequestParam("rol") String rolSeleccionado){
        //Linea agregada
        registroDTO.setRoles(rolSeleccionado);
        usuarioServicio.guardarUsuario(registroDTO);
        return "redirect:/registro?exito";
    }


}
