package com.sportgear.sportgear.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    private Long telefono;

    private Long codigo;

    @OneToOne
    @JoinColumn(name = "idPrograma")
    private Programas programas;

    private String correoInstitucional;

    private String contrasena;

    //Falta el TipoUsuario

    @Override
    public String toString() {
        return "Usuarios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", codigo=" + codigo +
                ", correoInstitucional='" + correoInstitucional + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
