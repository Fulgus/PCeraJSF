/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import es.uma.informatica.sii.jsf.autenticacion.modelo.Evento;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Seccion;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author miguelferreira
 */
@Named(value = "eventoBean")
@RequestScoped
public class EventoBean {

    private Integer cont = 0;

    private String nombre;
    private String lugar;
    private Seccion seccion;
    private String descripcion;
    private Integer precio;
    private List<Evento> ev = new ArrayList<>();
    private List<Usuario> usuarioCollection = new ArrayList<>();
    private static Evento seleccionado;

    /**
     * Creates a new instance of EventoBean
     */
    public EventoBean() {
    }

    public String editarEvento() {
        System.out.println(seleccionado.getIdEvento());

        Evento aux = new Evento(seleccionado.getIdEvento());
        aux.setDescripcion(descripcion);
        aux.setNombre(nombre);
        aux.setPrecio(precio);
        aux.setSeccion(getSeccion());
        aux.setUbicacon(lugar);
        aux.setUsuarioCollection(usuarioCollection);
        aux.setIdEvento(seleccionado.getIdEvento());

        seleccionado = aux;
        editarEvento(seleccionado);
        return "evento.xhtml";
    }

    public void editarEvento(Evento e) {
        for (Evento aux : ev) {
            if (aux.getIdEvento() == e.getIdEvento()) {
                ev.remove(aux);
                ev.add(e);
            }
        }

    }

    public List<Evento> getEv() {
        return ev;
    }

    public String editar() {
        return "editarEvento.xhtml";
    }

    public static Evento getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Evento seleccionado) {
        EventoBean.seleccionado = seleccionado;
    }

    public String ver(Evento evento) {
        setSeleccionado(evento);
        return "evento.xhtml";
    }

    public List<Evento> getEventos() {
        return getEv();
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    //public Date getFecha() {
    //   return fecha;
    //}

    /*  public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
     */
    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String t) {
        nombre = t;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String d) {
        descripcion = d;
    }

    /*   public File getImagen() {
        return imagen;
    }*/

 /*  public void setImagen(File f) {
        imagen = f;
    }
     */
    public String eliminarEvento() {
        System.out.println("PUTAVIDA");

        eliminarEvento(seleccionado);

        return "index.xhtml";
    }

    public String enviarEvento() {
        // usuario = cta.getUsuarioLogeado();
        cont++; // Me lleva el contador de los eventos
        Evento aux = new Evento();

        aux.setDescripcion(descripcion);
        aux.setIdEvento(cont);
        aux.setNombre(nombre);
        aux.setSeccion(seccion);
        aux.setPrecio(precio);
        aux.setUbicacon(lugar);
     //   aux.setUsuarioCollection(usuarioCollection);

        // aux.setImagen(imagen);
        setSeleccionado(aux);
        crearEvento(aux);
        return "evento.xhtml";
    }

    private void eliminarEvento(Evento seleccionado) {

        ev.remove(seleccionado);

    }

    private void crearEvento(Evento aux) {

        ev.add(aux);

    }

    /**
     * @return the seccion
     */
    public Seccion getSeccion() {
        return seccion;
    }

    /**
     * @param seccion the seccion to set
     */
    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

}
