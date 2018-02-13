package papeleriafarfarela;

/***********************************************************************
 * Module:  Articulos.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Articulos
 ***********************************************************************/
/** Articulo a la venta que contiene la papeleria.
 * 
 */
public class Articulo {
   /**
    * @articuloId Id para el articulo a ser ingresado
    */
   private int articuloId;
   /** @articuloNombre nombre del articulo */
   private String articuloNombre;
   /** @articuloDescripcion descripcion del articulo */
   private String articuloDescripcion;
   /** @articuloPrecio precio del articulo */
   private float articuloPrecio;
   /**  @pdOid Stock del articulo ingresado */
   private double articuloStock;
   
   /** Asociación entre tabla IVA y ARTICULOS */
   private java.util.Collection fechaIva;
   private java.util.Collection detalle;

    /**
     * @return retorne el detalle
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
     * @return devuelve la coleccion de iva a la fecha
     */
    public java.util.Collection getFechaIva() {
        return fechaIva;
    }

    /**
     * @param fechaIva setea la coleccion de Iva a la fecha
     */
    public void setFechaIva(java.util.Collection fechaIva) {
        this.fechaIva = fechaIva;
    }

}