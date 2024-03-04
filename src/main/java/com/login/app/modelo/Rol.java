package com.login.app.modelo;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="TiposUsuarios")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoUsuario;
    private String nombre;

    public Long getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol(Long idTipoUsuario, String nombre) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombre = nombre;
    }

    public Rol() {
        super();
    }

    public Rol(String nombre) {
        this.nombre = nombre;
    }
}