package papeleriafarfarela;

/***********************************************************************
 * Module:  Cliente.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Cliente
 ***********************************************************************/


/** Clientes que compran en la papeleria
 * 
 * @pdOid d1ccead4-38c7-4e05-8cf4-86b81c55ce0e */
public class Cliente {
   /** CI, RUC, PASAPORTE, ETC
    * 
    * @pdOid identificador de cliente: CEDULA */
   public String clienteIdentificador;
   /** @pdOid nombres del cliente */
   public String clienteNombres;
   /** @pdOid apellidos del cliente */
   public String clienteApelidos;
   /** @pdOid direccion del cliente */
   public String clienteDireccion;
   /** @pdOid telefono del cliente */
   public String clienteTelefono;
   /** @pdOid fecha de nacimiento del cliente */
   public java.util.Date clienteFechaNacimiento;
   
   /** @pdRoleInfo migr=no name=Facturas assc=obtiene coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Factura> facturas;
   
   
   /**
     * @return  
     *  @pdGenerated default getter */
   public java.util.Collection<Factura> getFacturas() {
      if (facturas == null)
         facturas = new java.util.HashSet<Factura>();
      return facturas;
   }
   
   /**
     * @return  *  
     * @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFacturas() {
      if (facturas == null)
         facturas = new java.util.HashSet<Factura>();
      return facturas.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFacturas */
   public void setFacturas(java.util.Collection<Factura> newFacturas) {
      eliminarTodasLasFacturas();
      for (java.util.Iterator iter = newFacturas.iterator(); iter.hasNext();)
         agregarFacturas((Factura)iter.next());
   }
   
   /** *  @pdGenerated default add
     * @param facturasNuevas */
   public void agregarFacturas(Factura facturasNuevas) {
      if (facturasNuevas == null)
         return;
      if (this.facturas == null)
         this.facturas = new java.util.HashSet<Factura>();
      if (!this.facturas.contains(facturasNuevas))
         this.facturas.add(facturasNuevas);
   }
   
   /** *  @pdGenerated default remove
     * @param facturasViejas */
   public void eliminarFacturas(Factura facturasViejas) {
      if (facturasViejas == null)
         return;
      if (this.facturas != null)
         if (this.facturas.contains(facturasViejas))
            this.facturas.remove(facturasViejas);
   }
   
   /** @pdGenerated default removeAll */
   public void eliminarTodasLasFacturas() {
      if (facturas != null)
         facturas.clear();
   }

}