package PapeleriaFarfarela;

/***********************************************************************
 * Module:  Proveedor.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Proveedor
 ***********************************************************************/



/** Proveedores de Article para la papeleria
 * 
 * @pdOid 736b7e57-47d8-4b3f-9a22-354d770af94f */
public class Provider {
   /** @pdOid 1838fbd1-a9aa-4f25-8620-eb8be1300004 */
   public double providerId;
   /** CI, RUC, PASAPORTE, ETC
    * 
    * @pdOid 09b3a4f1-0708-4cc5-bc93-9d066e62b48d */
   public java.lang.String providerIdentificator;
   /** Nombre del proveedor
    * 
    * @pdOid 6ea14e96-f4c0-4e33-8d38-46e92fb37408 */
   public java.lang.String providerSocialReazon;
   /** @pdOid cd29d026-60fd-47a1-8a1b-602025c95aa7 */
   public java.lang.String providerPhone;
   /** Nombre de la persona que estara representando al proveedor
    * 
    * @pdOid 6e2f3f89-5ddd-4157-993d-3dc7540b9738 */
   public java.lang.String providerContact;
   /** telefono del contacto
    * 
    * @pdOid f363d368-aa48-4dab-ac2f-1e13eb4f5c50 */
   public java.lang.String providerPhoneContact;
   /** Direccion del proveedor.
    * 
    * @pdOid 22962d4f-b688-45a0-a7b4-b74d5132ce15 */
   public java.lang.String providerDirecction;
   
   /** @pdRoleInfo migr=no name=Articulos assc=proporciona coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Article> article;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Article> getArticle() {
      if (article == null)
         article = new java.util.HashSet<Article>();
      return article;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getArticleIterator() {
      if (article == null)
         article = new java.util.HashSet<Article>();
      return article.iterator();
   }
   
   /** *  @pdGenerated default setter
     * @param newArticle */
   public void setArticle(java.util.Collection<Article> newArticle) {
      removeAllArticle();
      for (java.util.Iterator iter = newArticle.iterator(); iter.hasNext();)
         addAticle((Article)iter.next());
   }
   
   /** *  @pdGenerated default add
     * @param newArticle */
   public void addAticle(Article newArticle) {
      if (newArticle == null)
         return;
      if (this.article == null)
         this.article = new java.util.HashSet<Article>();
      if (!this.article.contains(newArticle))
         this.article.add(newArticle);
   }
   
   /** *  @pdGenerated default remove
     * @param oldArticle */
   public void removeArticle(Article oldArticle) {
      if (oldArticle == null)
         return;
      if (this.article != null)
         if (this.article.contains(oldArticle))
            this.article.remove(oldArticle);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllArticle() {
      if (article != null)
         article.clear();
   }

}