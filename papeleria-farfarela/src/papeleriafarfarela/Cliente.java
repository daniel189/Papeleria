package papeleriafarfarela;

/***********************************************************************
 * Module:  Cliente.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Cliente
 ***********************************************************************/

import java.util.*;

/** Clientes que compran en la papeleria
 * 
 * @pdOid d1ccead4-38c7-4e05-8cf4-86b81c55ce0e */
public class Cliente {
   /** CI, RUC, PASAPORTE, ETC
    * 
    * @pdOid 958df245-75b5-4280-8ea1-bd31809a98c8 */
   public java.lang.String clienteIdentificador;
   /** @pdOid e2b21e43-f098-436f-a8e4-d501259229c3 */
   public java.lang.String clienteNombres;
   /** @pdOid 920c59cd-5bd4-4b05-89a6-7dd8a9ae049a */
   public java.lang.String clienteApelidos;
   /** @pdOid ed918176-dd5f-46b0-b98f-e83ffeee0a32 */
   public java.lang.String clienteDireccion;
   /** @pdOid 7508ef06-42a0-4f11-b0f4-d2f6f4d31e22 */
   public java.lang.String clienteTelefono;
   /** @pdOid badbac0d-bf06-477b-bb92-37b0b62bfbc7 */
   public java.util.Date clienteFechaNacimiento;
   
   /** @pdRoleInfo migr=no name=Facturas assc=obtiene coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Factura> facturas;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Factura> getFacturas() {
      if (facturas == null)
         facturas = new java.util.HashSet<Factura>();
      return facturas;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFacturas() {
      if (facturas == null)
         facturas = new java.util.HashSet<Factura>();
      return facturas.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFacturas */
   public void setFacturas(java.util.Collection<Factura> newFacturas) {
      removeAllFacturas();
      for (java.util.Iterator iter = newFacturas.iterator(); iter.hasNext();)
         addFacturas((Factura)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newFacturas */
   public void addFacturas(Factura newFacturas) {
      if (newFacturas == null)
         return;
      if (this.facturas == null)
         this.facturas = new java.util.HashSet<Factura>();
      if (!this.facturas.contains(newFacturas))
         this.facturas.add(newFacturas);
   }
   
   /** @pdGenerated default remove
     * @param oldFacturas */
   public void removeFacturas(Factura oldFacturas) {
      if (oldFacturas == null)
         return;
      if (this.facturas != null)
         if (this.facturas.contains(oldFacturas))
            this.facturas.remove(oldFacturas);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFacturas() {
      if (facturas != null)
         facturas.clear();
   }

}