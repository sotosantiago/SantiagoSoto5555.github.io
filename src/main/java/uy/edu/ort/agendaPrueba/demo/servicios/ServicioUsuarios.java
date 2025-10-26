package uy.edu.ort.agendaPrueba.demo.servicios;

import java.util.ArrayList;
import java.util.List;

import uy.edu.ort.agendaPrueba.demo.dominio.Usuario;

public class ServicioUsuarios {
    private List<Usuario> usuarios;

    public ServicioUsuarios() {
        this.usuarios = new ArrayList<>();
    }
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario login(String nombre, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.validLogin(nombre, contrasena)) {
                return usuario;
            }
        }
        return null;
    }
}
