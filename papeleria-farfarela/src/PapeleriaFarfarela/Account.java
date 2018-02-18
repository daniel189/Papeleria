package PapeleriaFarfarela;

/***********************************************************************
 * Module:  Cuenta.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Cuenta
 ***********************************************************************/


/** Cuentas de usuarios que tienen la empresa para proporcionar a sus empleados
 * 
 * @pdOid 532ba145-291e-4b4c-ac3d-89fe8db52f6a */
public class Account {
    private String accountName, accountPassword, accountStatus;
    private int accountAccessLevel, employeeId;
    
    /** @pdRoleInfo migr=no name=Facturas assc=factura coll=java.util.Collection impl=java.util.HashSet mult=0..* */
    public java.util.Collection<Bill> bills;
   
    /*Constructor*/
    /*
     * @param accountName nombre de la accountName
     * @param accountPassword accountPassword de la accountName
     * @param accountAccessLevel accountAccessLevel de permiso de la accountName
     * @param employeeId id de empleado asociado a la accountName
     * @param accountStatus estado de la accountName
     */
    public Account(String accountName, String accountPassword, int accountLevel, int employeeId, String accountStatus){
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.accountAccessLevel = accountLevel;
        this.employeeId = employeeId;
        this.accountStatus=accountStatus;
    }
    
    public Account() {
        //Constructor vacio!
    }
     
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<Bill> getBills() {
      if (bills == null)
         bills = new java.util.HashSet<Bill>();
      return bills;
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

   //GETTERS Y SETTERS
    /**
     * @return the accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return the pass
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * @param accountPassword the accountPassword to set
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    /**
     * @return the accountAccessLevel
     */
    public int getAccountAccessLevel() {
        return accountAccessLevel;
    }

    /**
     * @param AccountAccessLevel the accountAccessLevel to set
     */
    public void setAccountAccessLevel(int AccountAccessLevel) {
        this.accountAccessLevel = AccountAccessLevel;
    }

    /**
     * @return the emp_id
     */
    public int getemployeeId() {
        return employeeId;
    }

    /**
     * @param emp_id the emp_id to set
     */
    public void setEmployeeId(int emp_id) {
        this.employeeId = emp_id;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    
}