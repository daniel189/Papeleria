package papeleriafarfarela;

/***********************************************************************
 * Module:  Articulos.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Articulos
 ***********************************************************************/

import java.util.*;

/** Articulos a la venta que contiene la papeleria.
 * 
 * @pdOid d90d6935-b1ae-4bb4-b48a-192d367cfdb0 */
public class Articulos {
   /** @pdOid 368c9303-adc2-4bfa-a4fd-3acfae6fa040 */
   private int artId;
   /** @pdOid fb83f19b-3315-4022-92f7-8fe2aac9ba1a */
   private java.lang.String artNombre;
   /** @pdOid 24285171-a826-4535-933c-447008699d9c */
   private java.lang.String artDescripcion;
   /** @pdOid 5eb2a7d9-ee26-47b4-9982-113c37b6812e */
   private float artPrecio;
   /** numero de stock disponible
    * 
    * @pdOid 8535f7c3-1e9f-4a1b-8b10-27a128dcccbb */
   private double artStock;
   
   /** Asociación entre tabla IVA y ARTICULOS */
   private java.util.Collection fechaiva;
   private java.util.Collection detalle;

    /**
     * @return the artId
     */
   
   public int getArtId() {
        return artId;
    }

    /**
     * @param artId the artId to set
     */
    public void setArtId(int artId) {
        this.artId = artId;
    }

    /**
     * @return the artNombre
     */
    public java.lang.String getArtNombre() {
        return artNombre;
    }

 

    /**
     * @param artNombre the artNombre to set
     */
    public void setArtNombre(java.lang.String artNombre) {
        this.artNombre = artNombre;
    }

    /**
     * @return the artDescripcion
     */
    public java.lang.String getArtDescripcion() {
        return artDescripcion;
    }

    /**
     * @param artDescripcion the artDescripcion to set
     */
    public void setArtDescripcion(java.lang.String artDescripcion) {
        this.artDescripcion = artDescripcion;
    }

    /**
     * @return the artPrecio
     */
    public float getArtPrecio() {
        return artPrecio;
    }

    /**
     * @param artPrecio the artPrecio to set
     */
    public void setArtPrecio(float artPrecio) {
        this.artPrecio = artPrecio;
    }

    /**
     * @return the artStock
     */
    public double getArtStock() {
        return artStock;
    }

    /**
     * @param artStock the artStock to set
     */
    public void setArtStock(double artStock) {
        this.artStock = artStock;
    }

    /**
     * @return the fechaiva
     */
    public java.util.Collection getFechaiva() {
        return fechaiva;
    }

    /**
     * @param fechaiva the fechaiva to set
     */
    public void setFechaiva(java.util.Collection fechaiva) {
        this.fechaiva = fechaiva;
    }

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

}