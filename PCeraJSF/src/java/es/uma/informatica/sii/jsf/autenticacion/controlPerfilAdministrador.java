package es.uma.informatica.sii.jsf.autenticacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import es.uma.informatica.sii.jsf.autenticacion.modelo.Documento;
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
public class controlPerfilAdministrador implements Serializable {
    
    private List<Usuario> l = new ArrayList<>();
    private List<Documento> d = new ArrayList<>();
    private Integer idUserDocumentos;
    
    public controlPerfilAdministrador() {
        //public Usuario(Integer idUsuario, String usuario, String contraseña, String nombre, 
        //String apellidos, String dni, Date fechaNacimiento, Integer tipoUsuario, String email, 
        //String direccion, String sexo) 
        l.add(new Usuario(1, "pepe", "asdf", "Pepe", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        l.add(new Usuario(2, "xXWillyrexXx", "asdf", "Paco", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        l.add(new Usuario(3, "Wigeta", "asdf", "Mustafar", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        l.add(new Usuario(4, "MickJackson", "asdf", "Laura", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        l.add(new Usuario(5, "TheCook", "asdf", "Adolfo", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));
        l.add(new Usuario(6, "JijiNoseMeOcurreMas", "asdf", "Lucia", "García", "23412332R", new Date(1999, 5, 12), Usuario.PERF_EDUCANDO, "mail@mail.com", "casa, 4", "mucho"));

        //Documentos
        d.add(new Documento(1, "DNI", new Date(2001, 2, 2), 1));
        d.add(new Documento(2, "Foto", new Date(2001, 2, 2), 1));
        d.add(new Documento(3, "Recibo", new Date(2001, 2, 2), 1));
        d.add(new Documento(4, "Factura", new Date(2001, 2, 2), 1));
    }
    
    public List<Usuario> getListaEducandos() {
        return l;
    }
    
    public String clickVerDocumentacion(Integer idUser) {
        this.setIdUserDocumentos(idUser);
        return "gestionDocumentacionDocumentos.xhtml";
    }
    
    public List<Documento> getListaDocumentosDeUsuario() {
        return this.d;
    }
    
    public void clickBotonDescargarListado() {
        //Rellenar
    }
    
    public void clickBotonBorrarDocumento(){
        //Rellenar
    }
    
    public List<Usuario> getL() {
        return l;
    }
    
    public void setL(List<Usuario> l) {
        this.l = l;
    }
    
    public List<Documento> getD() {
        return d;
    }
    
    public void setD(List<Documento> d) {
        this.d = d;
    }
    
    public Integer getIdUserDocumentos() {
        return idUserDocumentos;
    }
    
    public void setIdUserDocumentos(Integer idUserDocumentos) {
        this.idUserDocumentos = idUserDocumentos;
    }
    
}
