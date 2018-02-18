package PapeleriaFarfarela;

/***********************************************************************
 * Module:  Articulos.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Articulos
 ***********************************************************************/
/** Article a la venta que contiene la papeleria.
 * 
 */
public class Article {
   /**
    * @articuloId Id para el articulo a ser ingresado
    */
   private int articleId;
   /** @articuloNombre nombre del articulo */
   private String articleName;
   /** @articuloDescripcion descripcion del articulo */
   private String articleDescription;
   /** @articuloPrecio precio del articulo */
   private float articlePrice;
   /**  @pdOid Stock del articulo ingresado */
   private double articleStock;
   
   /** Asociación entre tabla IVA y ARTICULOS */
   private java.util.Collection vatDate;
   private java.util.Collection detail;

    /**
     * @return retorne el detail
     */
    public java.util.Collection getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(java.util.Collection detail) {
        this.detail = detail;
    }

    /**
     * @return the articleId
     */
    public int getArticleId() {
        return articleId;
    }

    /**
     * @param articleId the articleId to set
     */
    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    /**
     * @return the articleName
     */
    public java.lang.String getArticleName() {
        return articleName;
    }

    /**
     * @param articlename the articleName to set
     */
    public void setArticleName(java.lang.String articlename) {
        this.articleName = articlename;
    }

    /**
     * @return the articleDescription
     */
    public java.lang.String getArticleDescription() {
        return articleDescription;
    }

    /**
     * @param articleDescription the articleDescription to set
     */
    public void setArticleDescription(java.lang.String articleDescription) {
        this.articleDescription = articleDescription;
    }

    /**
     * @return the articlePrice
     */
    public float getArticlePrice() {
        return articlePrice;
    }

    /**
     * @param articlePrice the articlePrice to set
     */
    public void setArticlePrice(float articlePrice) {
        this.articlePrice = articlePrice;
    }

    /**
     * @return the articleStock
     */
    public double getArticleStock() {
        return articleStock;
    }

    /**
     * @param articleStock the articleStock to set
     */
    public void setArticleStock(double articleStock) {
        this.articleStock = articleStock;
    }

    /**
     * @return devuelve la coleccion de iva a la fecha
     */
    public java.util.Collection getVatDate() {
        return vatDate;
    }

    /**
     * @param vatDate setea la coleccion de Iva a la fecha
     */
    public void setVatDate(java.util.Collection vatDate) {
        this.vatDate = vatDate;
    }

}