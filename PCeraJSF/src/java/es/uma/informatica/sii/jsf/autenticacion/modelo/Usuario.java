/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.management.Query;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Boti
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "getDocumentos", query = "select d from Documento d where d.usuarioIdUsuario=:idUsuario")})
public class Usuario implements Serializable {

    @Transient
    public static final int PERF_ADMINISTRADOR = 0;
    @Transient
    public static final int PERF_COORDINADOR = 1;
    @Transient
    public static final int PERF_SCOUTER = 2;
    @Transient
    public static final int PERF_EDUCANDO = 3;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUsuario;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellidos;
    private String dni;
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    private Integer tipoUsuario;
    private String email;
    private String direccion;
    private String sexo;
    @Lob
    @Column(length = 10000)
    private byte[] fotoPerfil;
    @ManyToMany(mappedBy = "usuarioCollection")
    private List<Evento> eventoCollection;
    @OneToMany(mappedBy = "usuarioIdUsuario")
    private List<Documento> documentoCollection;
    @OneToMany(mappedBy = "usuarioIdUsuario")
    private List<Cuota> cuotaCollection;
    @OneToMany(mappedBy = "usuario")
    private List<Promesa> promesaCollection;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String usuario, String contraseña, String nombre, String apellidos, String dni, Date fechaNacimiento, Integer tipoUsuario, String email, String direccion, String sexo) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoUsuario = tipoUsuario;
        this.email = email;
        this.direccion = direccion;
        this.sexo = sexo;
    }

    public Usuario(Integer idUsuario, String usuario, String contrasenia, Integer rol) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contraseña = contrasenia;
        this.tipoUsuario = rol;
    }
    
    public List<Documento> getDocumentos(){
        //hay que llamar al entityManager para crear la query
        List<Documento> l= new ArrayList<>();
        l.add(new Documento(1, "DNI", new Date(1902, 2, 2), this.idUsuario));
        l.add(new Documento(2, "Recibo Banco", new Date(1902, 2, 2), this.idUsuario));
        l.add(new Documento(3, "Fotocopia", new Date(1902, 2, 2), this.idUsuario));
        return l;
    }
    
    public String getSeccion(){
        ////hay que llamar al entityManager para crear la query
        return "Lobatos";
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Tipo de usuario
    // 0: Admin
    // 1: Scouter
    // 2: Educando
    public Integer getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte[] getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(byte[] fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    @XmlTransient
    public List<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(List<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    @XmlTransient
    public List<Documento> getDocumentoCollection() {
        return documentoCollection;
    }

    public void setDocumentoCollection(List<Documento> documentoCollection) {
        this.documentoCollection = documentoCollection;
    }

    @XmlTransient
    public List<Cuota> getCuotaCollection() {
        return cuotaCollection;
    }

    public void setCuotaCollection(List<Cuota> cuotaCollection) {
        this.cuotaCollection = cuotaCollection;
    }

    @XmlTransient
    public List<Promesa> getPromesaCollection() {
        return promesaCollection;
    }

    public void setPromesaCollection(List<Promesa> promesaCollection) {
        this.promesaCollection = promesaCollection;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contraseña;
    }

    public void setContrasenia(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", tipoUsuario=" + tipoUsuario + ", email=" + email + ", direccion=" + direccion + ", sexo=" + sexo + ", fotoPerfil=" + fotoPerfil + ", eventoCollection=" + eventoCollection + ", documentoCollection=" + documentoCollection + ", cuotaCollection=" + cuotaCollection + ", promesaCollection=" + promesaCollection + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idUsuario);
        hash = 29 * hash + Objects.hashCode(this.usuario);
        hash = 29 * hash + Objects.hashCode(this.contraseña);
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.apellidos);
        hash = 29 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.idUsuario, other.idUsuario)) {
            return false;
        }
        return true;
    }

}
