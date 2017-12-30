package papeleriafarfarela;

/***********************************************************************
 * Module:  Articulos.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Articulos
 ***********************************************************************/

import java.util.*;

/** Articulo a la venta que contiene la papeleria.
 * 
 * @pdOid d90d6935-b1ae-4bb4-b48a-192d367cfdb0 */
public class Articulo {
   /** @pdOid 368c9303-adc2-4bfa-a4fd-3acfae6fa040 */
   private int articuloId;
   /** @pdOid fb83f19b-3315-4022-92f7-8fe2aac9ba1a */
   private java.lang.String articuloNombre;
   /** @pdOid 24285171-a826-4535-933c-447008699d9c */
   private java.lang.String articuloDescripcion;
   /** @pdOid 5eb2a7d9-ee26-47b4-9982-113c37b6812e */
   private float articuloPrecio;
   /** numero de stock disponible
    * 
    * @pdOid 8535f7c3-1e9f-4a1b-8b10-27a128dcccbb */
   private double articuloStock;
   
   /** Asociación entre tabla IVA y ARTICULOS */
   private java.util.Collection fechaIva;
   private java.util.Collection detalle;

    /**
     * @return the artId
     */
   
   

    /**
     * @return the detalle
     */
    public java.util.Collection getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(java.util.Collection detalle) {
        this.detalle = detalle;
    }

    /**
     * @return the articuloId
     */
    public int getArticuloId() {
        return articuloId;
    }

    /**
     * @param articuloId the articuloId to set
     */
    public void setArticuloId(int articuloId) {
        this.articuloId = articuloId;
    }

    /**
     * @return the articuloNombre
     */
    public java.lang.String getArticuloNombre() {
        return articuloNombre;
    }

    /**
     * @param articuloNombre the articuloNombre to set
     */
    public void setArticuloNombre(java.lang.String articuloNombre) {
        this.articuloNombre = articuloNombre;
    }

    /**
     * @return the articuloDescripcion
     */
    public java.lang.String getArticuloDescripcion() {
        return articuloDescripcion;
    }

    /**
     * @param articuloDescripcion the articuloDescripcion to set
     */
    public void setArticuloDescripcion(java.lang.String articuloDescripcion) {
        this.articuloDescripcion = articuloDescripcion;
    }

    /**
     * @return the articuloPrecio
     */
    public float getArticuloPrecio() {
        return articuloPrecio;
    }

    /**
     * @param articuloPrecio the articuloPrecio to set
     */
    public void setArticuloPrecio(float articuloPrecio) {
        this.articuloPrecio = articuloPrecio;
    }

    /**
     * @return the articuloStock
     */
    public double getArticuloStock() {
        return articuloStock;
    }

    /**
     * @param articuloStock the articuloStock to set
     */
    public void setArticuloStock(double articuloStock) {
        this.articuloStock = articuloStock;
    }

    /**
     * @return the fechaIva
     */
    public java.util.Collection getFechaIva() {
        return fechaIva;
    }

    /**
     * @param fechaIva the fechaIva to set
     */
    public void setFechaIva(java.util.Collection fechaIva) {
        this.fechaIva = fechaIva;
    }

}