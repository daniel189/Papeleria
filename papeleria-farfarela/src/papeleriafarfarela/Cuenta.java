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
    private String cuenta, password, habilitado;
    private int nivel, empleadoId;
    /*Constructor*/
    /**
     * 
     * @param cuentaC nombre de la cuenta
     * @param passC password de la cuenta
     * @param nivelC nivel de permiso de la cuenta
     * @param emp_idC id de empleado asociado a la cuenta
     * @param h estado de la cuenta
     */
    public Cuenta(String cuentaC, String passC, int nivelC, int emp_idC, String h){
        this.cuenta = cuentaC;
        this.password = passC;
        this.nivel = nivelC;
        this.empleadoId = emp_idC;
        this.habilitado=h;
    }
     
   /** @pdRoleInfo migr=no name=Facturas assc=factura coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Factura> facturas;

    public Cuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Factura> getFacturas() {
      if (facturas == null)
         facturas = new java.util.HashSet<Factura>();
      return facturas;
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
        return password;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.password = pass;
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
        return empleadoId;
    }

    /**
     * @param emp_id the emp_id to set
     */
    public void setEmp_id(int emp_id) {
        this.empleadoId = emp_id;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    
}