/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author francis
 */
@Named(value = "controlInicio")
@SessionScoped
public class ControlInicio implements Serializable {

    private Usuario usuario;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String clickLinkInformacion() {
        return "informacion.xhtml";
    }

    public String clickLinkApuntate() {
        return "apuntate.xhtml";
    }

    public String clickLinkInicio() {
        // Implementar el método
        // Devuelve la página Home dependiendo del rol del usuario
        // Si no hay usuario debe devolver la página de login
        // Si el usuario es el administrador debe devolver la página admin.xhtml
        // Si el usuario es un usuario normal debe devolver la página normal.xhtml

        return "index.xhtml";
    }

    public String clickLinkLogin() {
        return "inicioSesion.xhtml";
    }

    public String clickLinkPerfil() {

        switch (usuario.getTipoUsuario()) {
            case 0:
                return "perfil-administrador.xhtml";
            case 1:
                return "perfil-coordinador.xhtml";
            default:
                return "perfil-educando.xhtml";
        }

    }

    public String clickLinkCuota() {
        return "GestionarCuota.xhtml";
    }

    public String logout() {
        // Destruye la sesión (y con ello, el ámbito de este bean)
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.getExternalContext().invalidateSession();
        usuario = null;
        return "login.xhtml";
    }

    /**
     * Creates a new instance of ControlAutorizacion
     */
    public ControlInicio() {
    }
}
