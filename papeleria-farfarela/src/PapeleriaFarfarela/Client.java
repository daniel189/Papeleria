package PapeleriaFarfarela;

/***********************************************************************
 * Module:  Cliente.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Cliente
 ***********************************************************************/


/** Clientes que compran en la papeleria
 * 
 * @pdOid d1ccead4-38c7-4e05-8cf4-86b81c55ce0e */
public class Client {
   /** CI, RUC, PASAPORTE, ETC
    * 
    * @pdOid identificador de cliente: CEDULA */
   public String clientId;
   /** @pdOid nombres del cliente */
   public String clientNames;
   /** @pdOid apellidos del cliente */
   public String clientLastNames;
   /** @pdOid direccion del cliente */
   public String clientDirecction;
   /** @pdOid telefono del cliente */
   public String clientPhone;
   /** @pdOid fecha de nacimiento del cliente */
   public java.util.Date clientBirthDate;
   
   /** @pdRoleInfo migr=no name=Facturas assc=obtiene coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Bill> bills;
   
   
   /**
     * @return  
     *  @pdGenerated default getter */
   public java.util.Collection<Bill> getBills() {
      if (bills == null)
         bills = new java.util.HashSet<Bill>();
      return bills;
   }
   
   /**
     * @return  *  
     * @pdGenerated default iterator getter */
   public java.util.Iterator getBillsIterator() {
      if (bills == null)
         bills = new java.util.HashSet<Bill>();
      return bills.iterator();
   }
   
   /** *  @pdGenerated default setter
     * @param newBills */
   public void setBills(java.util.Collection<Bill> newBills) {
      removeAllBills();
      for (java.util.Iterator iter = newBills.iterator(); iter.hasNext();)
         addBills((Bill)iter.next());
   }
   
   /** *  @pdGenerated default add
     * @param newBills */
   public void addBills(Bill newBills) {
      if (newBills == null)
         return;
      if (this.bills == null)
         this.bills = new java.util.HashSet<Bill>();
      if (!this.bills.contains(newBills))
         this.bills.add(newBills);
   }
   
   /** *  @pdGenerated default remove
     * @param oldBills */
   public void removeBills(Bill oldBills) {
      if (oldBills == null)
         return;
      if (this.bills != null)
         if (this.bills.contains(oldBills))
            this.bills.remove(oldBills);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBills() {
      if (bills != null)
         bills.clear();
   }

}