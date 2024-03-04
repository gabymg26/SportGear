package com.login.app.dto;

public class UsuarioRegistroDTO {
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private Long codigo;
    private Long telefono;
    private String programa;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public UsuarioRegistroDTO(Long idUsuario, String nombre, String apellido, String email, String password, Long codigo, Long telefono, String programa) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.codigo = codigo;
        this.telefono = telefono;
        this.programa = programa;
    }

    public UsuarioRegistroDTO(String nombre, String apellido, String email, String password, Long codigo, Long telefono, String programa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.codigo = codigo;
        this.telefono = telefono;
        this.programa = programa;
    }

    public UsuarioRegistroDTO(String email) {
        this.email = email;
    }

    public UsuarioRegistroDTO() {
    }
}