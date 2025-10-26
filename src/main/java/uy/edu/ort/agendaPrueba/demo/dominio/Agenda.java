package uy.edu.ort.agendaPrueba.demo.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    public Agenda() {
        this.contactos = new ArrayList<>();
    }
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }
    public List<Contacto> getContactos() {
        return contactos;
    }
    
}