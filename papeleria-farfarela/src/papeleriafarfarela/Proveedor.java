package papeleriafarfarela;

/***********************************************************************
 * Module:  Proveedor.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Proveedor
 ***********************************************************************/


import java.util.*;

/** Proveedores de Articulos para la papeleria
 * 
 * @pdOid 736b7e57-47d8-4b3f-9a22-354d770af94f */
public class Proveedor {
   /** @pdOid 1838fbd1-a9aa-4f25-8620-eb8be1300004 */
   public double proId;
   /** CI, RUC, PASAPORTE, ETC
    * 
    * @pdOid 09b3a4f1-0708-4cc5-bc93-9d066e62b48d */
   public java.lang.String proIdentificador;
   /** Nombre del proveedor
    * 
    * @pdOid 6ea14e96-f4c0-4e33-8d38-46e92fb37408 */
   public java.lang.String proRazonSocial;
   /** @pdOid cd29d026-60fd-47a1-8a1b-602025c95aa7 */
   public java.lang.String proTelefono;
   /** Nombre de la persona que estara representando al proveedor
    * 
    * @pdOid 6e2f3f89-5ddd-4157-993d-3dc7540b9738 */
   public java.lang.String proContacto;
   /** telefono del contacto
    * 
    * @pdOid f363d368-aa48-4dab-ac2f-1e13eb4f5c50 */
   public java.lang.String proTelefonoContacto;
   /** Direccion del proveedor.
    * 
    * @pdOid 22962d4f-b688-45a0-a7b4-b74d5132ce15 */
   public java.lang.String proDireccion;
   
   /** @pdRoleInfo migr=no name=Articulos assc=proporciona coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Articulos> articulos;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Articulos> getArticulos() {
      if (articulos == null)
         articulos = new java.util.HashSet<Articulos>();
      return articulos;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorArticulos() {
      if (articulos == null)
         articulos = new java.util.HashSet<Articulos>();
      return articulos.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newArticulos */
   public void setArticulos(java.util.Collection<Articulos> newArticulos) {
      removeAllArticulos();
      for (java.util.Iterator iter = newArticulos.iterator(); iter.hasNext();)
         addArticulos((Articulos)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newArticulos */
   public void addArticulos(Articulos newArticulos) {
      if (newArticulos == null)
         return;
      if (this.articulos == null)
         this.articulos = new java.util.HashSet<Articulos>();
      if (!this.articulos.contains(newArticulos))
         this.articulos.add(newArticulos);
   }
   
   /** @pdGenerated default remove
     * @param oldArticulos */
   public void removeArticulos(Articulos oldArticulos) {
      if (oldArticulos == null)
         return;
      if (this.articulos != null)
         if (this.articulos.contains(oldArticulos))
            this.articulos.remove(oldArticulos);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllArticulos() {
      if (articulos != null)
         articulos.clear();
   }

}