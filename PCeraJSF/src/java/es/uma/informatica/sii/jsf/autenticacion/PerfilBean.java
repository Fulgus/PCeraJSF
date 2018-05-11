/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;
import java.util.Date;

/**
 *
 * @author JoseMaria
 */
@Named(value = "perfil")
@RequestScoped
public class PerfilBean {
    
    private String usuario;
    private String nombre;
    private String apellidos;
    private String localidad;
    private String sexo;
    private String direccion;
    private String grupo;
    private String email;
    private String telefono;
    private Date fecha_nacimiento;
    private Date fecha_jura_bandera;
    private Date fecha_alta;
    /**
     * Creates a new instance of PerfilBean
     */
    public PerfilBean() {
        //TODO: creamos datos ficticios
        //TODO: cambiar navegacion en el perfil
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_jura_bandera() {
        return fecha_jura_bandera;
    }

    public void setFecha_jura_bandera(Date fecha_jura_bandera) {
        this.fecha_jura_bandera = fecha_jura_bandera;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
    
    
    
    public String clickLinkModificar() {
        return "modificar-perfil.xhtml";
    }
    
    public String clickLinkCambiarContrasenia() {
        return "cambiarContrasenia.xhtml";
    }
    
    public String clickLinkPagarCuota() {
        return "PagarCuota.xhtml";
    }
    
    public String clickLinkVerDocumentacion() {
        return "documentosPrincipal.xhtml";
    }
    
    public String clickLinkGestionUsuarios() {
        return "gest-usuarios.xhtml";
    }
    
    public String clickLinkGestionCuotas() {
        return "GetionarCuota.xhtml";
    }
    
    public String clickLinkGestionEventos() {
        return "GestionEventos.xhtml";
    }
    
    public String clickLinkGestionDocumentacion() {
        return "GestionDocumentacion.xhtml";
    }
    
    public String clickLinkPrivilegios() {
        return "privilegios.xhtml";
    }
}
