package PapeleriaFarfarela;

/***********************************************************************
 * Module:  Facturas.java
 * Author:  Crispin!!
 * Purpose: Defines the Class Facturas
 ***********************************************************************/


/** Notas de venta que otorga la papeleria al vender.
 * 
 * @pdOid fa498bf1-e0cb-4594-b27b-3377a3dafd89 */
public class Bill {
   /** @pdOid b00ff4f3-235b-414e-8aac-ef483f4cf713 */
   public double billId;
   /** @pdOid 40e59fbf-39bd-47c9-8a76-ba08a61b614f */
   public java.util.Date bilDate;
   /** @pdOid a61652cc-631a-4c9e-a4e7-ea7bc64d7720 */
   public float billDiscount;
   /** Estado de la factura: TRUE(ANULADA), FALSE (VIGENTE)
    * 
    * @pdOid ba2e0633-4d70-4d41-997c-54d09fa7c52a */
   public boolean billStatus;
   
   public java.util.Collection detail;

}