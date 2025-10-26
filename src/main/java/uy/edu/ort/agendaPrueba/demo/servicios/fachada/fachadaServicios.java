package uy.edu.ort.agendaPrueba.demo.servicios.fachada;

import uy.edu.ort.agendaPrueba.demo.dominio.Usuario;
import uy.edu.ort.agendaPrueba.demo.servicios.ServicioUsuarios;

public class fachadaServicios {
    private static fachadaServicios instancia;
    private ServicioUsuarios sUsuarios;

    public fachadaServicios() {
        sUsuarios = new ServicioUsuarios();
    }

    public static fachadaServicios getInstancia() {
        if (instancia == null) {
            instancia = new fachadaServicios();
        }
        return instancia;
    }

    public Usuario login(String nombre, String contrasena) {
        return sUsuarios.login(nombre, contrasena);
    }
    public void agregarUsuario(Usuario usuario) {
        sUsuarios.agregarUsuario(usuario);
    }
}
