package es.uma.informatica.sii.jsf.autenticacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Juan Antonio
 */
@Named(value = "controlGestionDocumentacion")
@SessionScoped
public class ControlGestionDocumentacion implements Serializable {

    /**
     * Creates a new instance of ControlGestionDocumentacion
     */
    public ControlGestionDocumentacion() {
    }
    private Usuario usuario;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

}
