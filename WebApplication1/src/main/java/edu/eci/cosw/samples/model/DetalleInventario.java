package edu.eci.cosw.samples.model;
// Generated 9/10/2015 03:08:07 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DetalleInventario generated by hbm2java
 */
@Entity
@Table(name="DetalleInventario"
    ,catalog="cosw2"
)
public class DetalleInventario  implements java.io.Serializable {


     private Integer idDetalleInventario;
     private Inventario inventario;
     private MedicamentoPorProveedor medicamentosPorProveedor;
     private Integer cantidad;

    public DetalleInventario() {
    }

	
    public DetalleInventario(Inventario inventario, MedicamentoPorProveedor medicamentosPorProveedor) {
        this.inventario = inventario;
        this.medicamentosPorProveedor = medicamentosPorProveedor;
    }
    public DetalleInventario(Inventario inventario, MedicamentoPorProveedor medicamentosPorProveedor, Integer cantidad) {
       this.inventario = inventario;
       this.medicamentosPorProveedor = medicamentosPorProveedor;
       this.cantidad = cantidad;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idDetalleInventario", unique=true, nullable=false)
    public Integer getIdDetalleInventario() {
        return this.idDetalleInventario;
    }
    
    public void setIdDetalleInventario(Integer idDetalleInventario) {
        this.idDetalleInventario = idDetalleInventario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idInventario", nullable=false)
    public Inventario getInventario() {
        return this.inventario;
    }
    
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MedicamentosPorProveedor_idMedicamentosPorProveedror", nullable=false)
    public MedicamentoPorProveedor getMedicamentosPorProveedor() {
        return this.medicamentosPorProveedor;
    }
    
    public void setMedicamentosPorProveedor(MedicamentoPorProveedor medicamentosPorProveedor) {
        this.medicamentosPorProveedor = medicamentosPorProveedor;
    }

    
    @Column(name="cantidad")
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }




}


