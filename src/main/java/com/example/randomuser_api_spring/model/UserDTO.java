package com.example.randomuser_api_spring.model;

public class UserDTO {
    private String nombre;
    private String genero;
    private String ubicacion;
    private String correo;
    private String fechaNacimiento;
    private String fotografia;




    // Constructor
    public UserDTO(String nombre, String genero, String ubicacion, String correo, String fechaNacimiento, String fotografia){
        this.nombre = nombre;
        this.genero = genero;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.fotografia = fotografia;
    }

    //Geters y seters
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFotografia(){
        return fotografia;
    }

    public void setFotografia(String fotografia){
        this.fotografia = fotografia;
    }


}
