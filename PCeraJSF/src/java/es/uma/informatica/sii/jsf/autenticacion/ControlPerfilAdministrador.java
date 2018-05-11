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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Juan Antonio
 */
@Named(value = "controlPerfilAdministrador")
@SessionScoped
public class ControlPerfilAdministrador implements Serializable {

    /**
     * Creates a new instance of controlPerfilAdministrador
     */
    public ControlPerfilAdministrador() {
    }

    public List<Usuario> getListaEducandos() {
        List<Usuario> l = new ArrayList<>();
        //public Usuario(Integer idUsuario, String usuario, String contraseña, String nombre, 
        //String apellidos, String dni, Date fechaNacimiento, Integer tipoUsuario, String email, 
        //String direccion, String sexo) 
        l.add(new Usuario(1, "pepe", "asdf", "Pepe", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        l.add(new Usuario(2, "xXWillyrexXx", "asdf", "Paco", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        l.add(new Usuario(3, "Wigeta", "asdf", "Mustafar", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        l.add(new Usuario(4, "MickJackson", "asdf", "Laura", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        l.add(new Usuario(5, "TheCook", "asdf", "Adolfo", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        l.add(new Usuario(6, "JijiNoseMeOcurreMas", "asdf", "Lucia", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        return l;
    }

    public String clickVerDocumentacion() {
        return "gestionDocumantacion.xhtml";
    }

}
