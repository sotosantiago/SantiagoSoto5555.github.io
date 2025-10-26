package uy.edu.ort.agendaPrueba.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uy.edu.ort.agendaPrueba.demo.dominio.Contacto;
import uy.edu.ort.agendaPrueba.demo.dominio.TipoContacto;
import uy.edu.ort.agendaPrueba.demo.dominio.Usuario;
import uy.edu.ort.agendaPrueba.demo.servicios.fachada.fachadaServicios;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		cargoDatosPrueba();
		SpringApplication.run(DemoApplication.class, args);
		Usuario us = fachadaServicios.getInstancia().login("juan", "1234");

		System.out.println("Usuario logueado: " + (us != null ? us.getNombre() : "Ninguno"));
	}
	public static void cargoDatosPrueba() {
		// Datos de usuario 
		TipoContacto tipo1 = new TipoContacto("Amigo");
		TipoContacto tipo2 = new TipoContacto("Familiar");
		TipoContacto tipo3 = new TipoContacto("Trabajo");

		Usuario usuario1 = new Usuario("juan", "1234");
		Usuario usuario2 = new Usuario("maria", "abcd");
		Usuario usuario3 = new Usuario("pedro", "pass");
		Usuario usuario4 = new Usuario("ana", "word");
		Usuario usuario5 = new Usuario("luis", "qwerty");

		usuario1.getAgenda().agregarContacto(new Contacto("Ana", "87654321", tipo2));
		usuario2.getAgenda().agregarContacto(new Contacto("Luis", "12348765", tipo1));
		usuario3.getAgenda().agregarContacto(new Contacto("Carlos", "56781234", tipo3));
		usuario4.getAgenda().agregarContacto(new Contacto("Sofia", "43218765", tipo2));
		usuario5.getAgenda().agregarContacto(new Contacto("Marta", "34567812", tipo1));

		fachadaServicios.getInstancia().agregarUsuario(usuario1);
		fachadaServicios.getInstancia().agregarUsuario(usuario2);
		fachadaServicios.getInstancia().agregarUsuario(usuario3);
		fachadaServicios.getInstancia().agregarUsuario(usuario4);
		fachadaServicios.getInstancia().agregarUsuario(usuario5);
	}
}
