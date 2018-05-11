/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author francis
 */
@Named(value = "login")
@RequestScoped
public class Login {

    private String usuario;
    private String contrasenia;
    private List<Usuario> usuarios;

    @Inject
    private ControlInicio ctrl;

    /**
     * Creates a new instance of Login
     */
    public Login() {
        usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario(1, "pepe", "asdf", Usuario.PERF_ADMINISTRADOR));
        usuarios.add(new Usuario(2, "manolo", "qwer", Usuario.PERF_COORDINADOR));
        usuarios.add(new Usuario(3, "jose", "jose", Usuario.PERF_EDUCANDO));
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String autenticar() {
        // Implementar este mÃ©todo
        Iterator it = usuarios.iterator();
        boolean encontrado = false;
        Usuario user = null;
        while (it.hasNext() && !encontrado) {
            user = (Usuario) it.next();
            if (user.getUsuario().equals(usuario)) {
                encontrado = true;
            }
        }
        if (user != null) {
            if (user.getContrasenia().equals(contrasenia)) {
                ctrl.setUsuario(user);
                return ctrl.clickLinkInicio();
            } else if (!user.getContrasenia().equals(contrasenia)) {
                FacesContext ctx = FacesContext.getCurrentInstance();
                ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "ContraseÃ±a no valida", "ContraseÃ±a no valida"));
                return null;
            } else {
                FacesContext ctx = FacesContext.getCurrentInstance();
                ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario no valido", "Usuario no valido"));
                return null;
            }

        } else {
            return null;
        }
    }
}
