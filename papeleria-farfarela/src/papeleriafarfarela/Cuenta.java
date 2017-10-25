package papeleriafarfarela;

/***********************************************************************
 * Module:  Cuenta.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Cuenta
 ***********************************************************************/

import java.util.*;

/** Cuentas de usuarios que tienen la empresa para proporcionar a sus empleados
 * 
 * @pdOid 532ba145-291e-4b4c-ac3d-89fe8db52f6a */
public class Cuenta {
    private String cuenta, pass, habilitado;
    private int nivel, emp_id;
    /*Constructor*/
    public Cuenta(String cuentaC, String passC, int nivelC, int emp_idC, String h){
        this.cuenta = cuentaC;
        this.pass = passC;
        this.nivel = nivelC;
        this.emp_id = emp_idC;
        this.habilitado=h;
    }
    
   /** @pdOid de399a0e-232a-44e0-8bac-460acb2ba75d */
   public java.lang.String cueCuenta;
   /** @pdOid d3d6b90c-0f69-4418-9b34-2b3e423c03a0 */
   public java.lang.String cuePass;
   /** Nivel o ROL que cumple esta cuenta para limitar accesos al sistema.
    * 
    * @pdOid 8b233316-dfef-4c1c-ab2a-488c256d1a82 */
   public double cueNivel;
   
   /** @pdRoleInfo migr=no name=Facturas assc=factura coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Facturas> facturas;

    public Cuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Facturas> getFacturas() {
      if (facturas == null)
         facturas = new java.util.HashSet<Facturas>();
      return facturas;
   }
   /** @pdGenerated default add
     * @param newFacturas */
   public void addFacturas(Facturas newFacturas) {
      if (newFacturas == null)
         return;
      if (this.facturas == null)
         this.facturas = new java.util.HashSet<Facturas>();
      if (!this.facturas.contains(newFacturas))
         this.facturas.add(newFacturas);
   }
   
   /** @pdGenerated default remove
     * @param oldFacturas */
   public void removeFacturas(Facturas oldFacturas) {
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

   //GETTERS Y SETTERS
    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the emp_id
     */
    public int getEmp_id() {
        return emp_id;
    }

    /**
     * @param emp_id the emp_id to set
     */
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    
}