package edu.eci.cosw.samples.model;
// Generated 9/10/2015 03:08:07 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Epsafilidas generated by hbm2java
 */
@Entity
@Table(name="EPSAfilidas"
    ,catalog="cosw2"
)
public class Epsafilida  implements java.io.Serializable {


     private int idEps;
     private String nombre;
     private String regimen;
     private String correo;
     private Set<Paciente> pacienteses = new HashSet<Paciente>(0);
     private Set<Contrato> contratoses = new HashSet<Contrato>(0);
     private Set<Autorizacion> autorizacioneses = new HashSet<Autorizacion>(0);

    public Epsafilida() {
    }

	
    public Epsafilida(int idEps, String nombre, String regimen) {
        this.idEps = idEps;
        this.nombre = nombre;
        this.regimen = regimen;
    }
    public Epsafilida(int idEps, String nombre, String regimen, String correo, Set<Paciente> pacienteses, Set<Contrato> contratoses, Set<Autorizacion> autorizacioneses) {
       this.idEps = idEps;
       this.nombre = nombre;
       this.regimen = regimen;
       this.correo = correo;
       this.pacienteses = pacienteses;
       this.contratoses = contratoses;
       this.autorizacioneses = autorizacioneses;
    }
   
     @Id 

    
    @Column(name="idEPS", unique=true, nullable=false)
    public int getIdEps() {
        return this.idEps;
    }
    
    public void setIdEps(int idEps) {
        this.idEps = idEps;
    }

    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="regimen", nullable=false, length=45)
    public String getRegimen() {
        return this.regimen;
    }
    
    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    
    @Column(name="correo", length=45)
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="epsafilidas")
    public Set<Paciente> getPacienteses() {
        return this.pacienteses;
    }
    
    public void setPacienteses(Set<Paciente> pacienteses) {
        this.pacienteses = pacienteses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="epsafilidas")
    public Set<Contrato> getContratoses() {
        return this.contratoses;
    }
    
    public void setContratoses(Set<Contrato> contratoses) {
        this.contratoses = contratoses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="epsafilidas")
    public Set<Autorizacion> getAutorizacioneses() {
        return this.autorizacioneses;
    }
    
    public void setAutorizacioneses(Set<Autorizacion> autorizacioneses) {
        this.autorizacioneses = autorizacioneses;
    }




}

