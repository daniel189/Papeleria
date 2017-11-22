package papeleriafarfarela;

/***********************************************************************
 * Module:  Empleado.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Empleado
 ***********************************************************************/

import papeleriafarfarela.Cuenta;
import java.util.*;

/** Empleados que pertenecen a la empresa
 * 
 * @pdOid f1a65f98-bb4e-4310-ac6b-e95267503be2 */
public class Empleado {
   /** @pdOid 3444e82e-6e19-40e3-930f-7649e82df401 */
   public double empleadoId;
   /** CI, RUC, PASAPORTE, ETC
    * 
    * @pdOid f9b9faec-ff9c-4977-96d1-bb99a9da875f */
   public java.lang.String empleadoIdentificador;
   /** @pdOid b2116f1a-701c-4ea2-9caa-c19506d57f44 */
   public java.lang.String empleadoNombres;
   /** @pdOid 103cdfc6-a47b-4c84-9ab6-54258e4bee84 */
   public java.lang.String empleadoApellidos;
   /** @pdOid 96a5950c-e31c-401e-a856-370abf695a67 */
   public java.lang.String emppeladoDireccion;
   /** @pdOid c46e643f-e96e-422a-ab44-4ae5ba048eb0 */
   public java.lang.String emppeladoTelefono;
   /** @pdOid bdee5ee8-2272-408d-baff-01367f48d576 */
   public java.lang.String empleadoObservacion;
   /** @pdOid 1551617b-7de7-410c-91d5-84fa7e359c7a */
   public java.util.Date emppleadoFechaNacimiento;
   /** @pdOid bdb564b2-9cd4-4cfa-b51b-9081dd372a81 */
   public java.util.Date emppleadoFechaIngreso;
   
   /** @pdRoleInfo migr=no name=Cuenta assc=tiene coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Cuenta> cuenta;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Cuenta> getCuenta() {
      if (cuenta == null)
         cuenta = new java.util.HashSet<Cuenta>();
      return cuenta;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCuenta() {
      if (cuenta == null)
         cuenta = new java.util.HashSet<Cuenta>();
      return cuenta.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCuenta */
   public void setCuenta(java.util.Collection<Cuenta> newCuenta) {
      removeAllCuenta();
      for (java.util.Iterator iter = newCuenta.iterator(); iter.hasNext();)
         addCuenta((Cuenta)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCuenta */
   public void addCuenta(Cuenta newCuenta) {
      if (newCuenta == null)
         return;
      if (this.cuenta == null)
         this.cuenta = new java.util.HashSet<Cuenta>();
      if (!this.cuenta.contains(newCuenta))
         this.cuenta.add(newCuenta);
   }
   
   /** @pdGenerated default remove
     * @param oldCuenta */
   public void removeCuenta(Cuenta oldCuenta) {
      if (oldCuenta == null)
         return;
      if (this.cuenta != null)
         if (this.cuenta.contains(oldCuenta))
            this.cuenta.remove(oldCuenta);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCuenta() {
      if (cuenta != null)
         cuenta.clear();
   }

}