package com.sportgear.sportgear.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table
public class Prestamos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Falta fecha de Inicio
    private Date fechaPrestamo;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuarios;

    @OneToOne
    @JoinColumn(name = "idImplemento")
    private ImplementosDeportivos implementosDeportivos;

    @Override
    public String toString() {
        return "Prestamos{" +
                "id=" + id +
                ", fechaPrestamo=" + fechaPrestamo +
                ", usuarios=" + usuarios +
                ", implementosDeportivos=" + implementosDeportivos +
                '}';
    }
}
