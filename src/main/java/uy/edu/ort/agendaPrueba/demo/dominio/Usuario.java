package uy.edu.ort.agendaPrueba.demo.dominio;

import lombok.Getter;

public class Usuario {
    @Getter
    private Agenda agenda;
    @Getter
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.agenda = new Agenda();
    }

    private boolean contrasenaValida(String contrasena) {
        return this.contrasena.equals(contrasena);
    }

    public boolean validLogin(String nombre, String contrasena) {
        return this.nombre.equals(nombre) && contrasenaValida(contrasena);
    }
}
