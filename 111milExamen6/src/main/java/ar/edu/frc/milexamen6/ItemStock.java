/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.frc.milexamen6;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class ItemStock {
 
 static int idItemStock;   
 private Computadora computadora;
 private int cantidad;
 private Date ultimaFechaModificacion;
 
 public ItemStock(int id, Computadora c, int cantidad){
     idItemStock=id;
     computadora=c;
     this.cantidad=cantidad;
 }

    public ItemStock() {
        idItemStock=0;
        computadora=null;
        cantidad=0;
    }

    public static int getIdItemStock() {
        return idItemStock;
    }

    public static void setIdItemStock(int idItemStock) {
        ItemStock.idItemStock = idItemStock;
    }

    public ItemStock(Computadora computadora, int cantidad, Date ultimaFechaModificacion) {
        this.computadora = computadora;
        this.cantidad = cantidad;
        this.ultimaFechaModificacion = ultimaFechaModificacion;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getUltimaFechaModificacion() {
        return ultimaFechaModificacion;
    }

    public void setUltimaFechaModificacion(Date ultimaFechaModificacion) {
        this.ultimaFechaModificacion = ultimaFechaModificacion;
    }
 
    
}
