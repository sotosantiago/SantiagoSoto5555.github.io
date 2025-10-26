package uy.edu.ort.agendaPrueba.demo.dominio;

import lombok.Getter;

public class Contacto {
    @Getter
    private String nombre;
    @Getter
    private String telefono;
    @Getter
    private String email;
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
}
