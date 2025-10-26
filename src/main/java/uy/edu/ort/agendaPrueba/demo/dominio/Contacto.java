package uy.edu.ort.agendaPrueba.demo.dominio;

import lombok.Getter;

public class Contacto {
    @Getter
    private String nombre;
    @Getter
    private String telefono;
    @Getter
    private TipoContacto tipoContacto;

    public Contacto(String nombre, String telefono, TipoContacto tipoContacto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipoContacto = tipoContacto;
    }
}
