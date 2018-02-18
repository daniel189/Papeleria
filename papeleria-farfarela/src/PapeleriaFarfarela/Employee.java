package PapeleriaFarfarela;

/***********************************************************************
 * Module:  Empleado.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Empleado
 ***********************************************************************/

/** Empleados que pertenecen a la empresa
 * 
 * @pdOid f1a65f98-bb4e-4310-ac6b-e95267503be2 */
public class Employee {
   /** @pdOid 3444e82e-6e19-40e3-930f-7649e82df401 */
   public double employeeId;
   /** CI, RUC, PASAPORTE, ETC
    * 
    * @pdOid f9b9faec-ff9c-4977-96d1-bb99a9da875f */
   public java.lang.String employeeIdentifier;
   /** @pdOid b2116f1a-701c-4ea2-9caa-c19506d57f44 */
   public java.lang.String employeeNames;
   /** @pdOid 103cdfc6-a47b-4c84-9ab6-54258e4bee84 */
   public java.lang.String employeeLastNames;
   /** @pdOid 96a5950c-e31c-401e-a856-370abf695a67 */
   public java.lang.String employeeDirection;
   /** @pdOid c46e643f-e96e-422a-ab44-4ae5ba048eb0 */
   public java.lang.String employeePhone;
   /** @pdOid bdee5ee8-2272-408d-baff-01367f48d576 */
   public java.lang.String employeeNotes;
   /** @pdOid 1551617b-7de7-410c-91d5-84fa7e359c7a */
   public java.util.Date employeeBirthDate;
   /** @pdOid bdb564b2-9cd4-4cfa-b51b-9081dd372a81 */
   public java.util.Date employeeIngressDate;
   
   /** @pdRoleInfo migr=no name=Cuenta assc=tiene coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Account> account;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Account> getAccount() {
      if (account == null)
         account = new java.util.HashSet<Account>();
      return account;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAccount() {
      if (account == null)
         account = new java.util.HashSet<Account>();
      return account.iterator();
   }
   
   /** *  @pdGenerated default setter
     * @param newAccount */
   public void setAccount(java.util.Collection<Account> newAccount) {
      removeAllAccount();
      for (java.util.Iterator iter = newAccount.iterator(); iter.hasNext();)
         addAccount((Account)iter.next());
   }
   
   /** *  @pdGenerated default add
     * @param newAccount */
   public void addAccount(Account newAccount) {
      if (newAccount == null)
         return;
      if (this.account == null)
         this.account = new java.util.HashSet<Account>();
      if (!this.account.contains(newAccount))
         this.account.add(newAccount);
   }
   
   /** *  @pdGenerated default remove
     * @param oldAccount */
   public void removeAccount(Account oldAccount) {
      if (oldAccount == null)
         return;
      if (this.account != null)
         if (this.account.contains(oldAccount))
            this.account.remove(oldAccount);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAccount() {
      if (account != null)
         account.clear();
   }

}