/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Date;
import javax.inject.Inject;

/**
 *
 * @author Marcos
 */

@Named(value = "controlCuota")
@RequestScoped
public class ControlCuota {
    private double importe;
    private Integer Anio;

    public ControlCuota(){
    
    }
        
    
    
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Integer getAnio() {
        return Anio;
    }

    public void setFecha(Integer Anio) {
        this.Anio = Anio;
    }
    
    //Este metodo controla que cancelas la creación de cuota
    public String btnCancelarCrCuota(){
        return "GestionarCuota.xhtml";
    }
    
    //Este metodo controla que crea la cuota
    public String btnCrearCrCuota(){
        return "GestionarCuota.xhtml";
    }
    //Este metodo controla el cierre del popup de IRPF
    public String btnCerrarIRPF(){
        return "VerCuota.xhtml";
    }
    
    public String btnEnviarIRPF(){
        return "EnvioIRPF.xhtml";
    }
    
    public String btnAceptarMetPag(){
        return "perfil-educando.xhtml";
    }
    
    public String btnAtrasMetPag(){
        return "perfil-educando.xhtml";
    }
}
    

