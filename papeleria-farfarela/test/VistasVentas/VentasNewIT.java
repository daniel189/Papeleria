/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasVentas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author w8
 */
public class VentasNewIT {
    
    public VentasNewIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of verEmpleado method, of class NewSale.
     */
    @Test
    public void testVerEmpleado() {
        System.out.println("verEmpleado");
        String cuenta = "";
        NewSale instance = new NewSale();
        String expResult = "";
        String result = instance.verEmpleado(cuenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chargeFamily method, of class NewSale.
     */
    @Test
    public void testVerFamilia() {
        System.out.println("verFamilia");
        int idArticulo = 0;
        NewSale instance = new NewSale();
        int expResult = 0;
        int result = instance.chargeFamily(idArticulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStock method, of class NewSale.
     */
    @Test
    public void testVerStock() {
        System.out.println("verStock");
        int idArticulo = 0;
        NewSale instance = new NewSale();
        int expResult = 0;
        int result = instance.verStock(idArticulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GenerarFactura method, of class NewSale.
     */
    @Test
    public void testGenerarFactura() {
        System.out.println("GenerarFactura");
        NewSale instance = new NewSale();
        boolean expResult = false;
        boolean result = instance.GenerarFactura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GuardarArticulos method, of class NewSale.
     */
    @Test
    public void testGuardarArticulos() {
        System.out.println("GuardarArticulos");
        NewSale instance = new NewSale();
        instance.GuardarArticulos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GenerarPDF method, of class NewSale.
     */
    @Test
    public void testGenerarPDF() {
        System.out.println("GenerarPDF");
        NewSale instance = new NewSale();
        instance.GenerarPDF();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DosDecimales method, of class NewSale.
     */
    @Test
    public void testDosDecimales() {
        System.out.println("DosDecimales");
        double valor = 0.0;
        NewSaleWindowHelper instance = new NewSaleWindowHelper();
        double expResult = 0.0;
        double result = instance.DosDecimales(valor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminaCaracteres method, of class NewSale.
     */
    @Test
    public void testEliminaCaracteres() {
        System.out.println("EliminaCaracteres");
        String s_cadena = "";
        String s_caracteres = "";
        NewSale instance = new NewSale();
        String expResult = "";
        String result = instance.EliminaCaracteres(s_cadena, s_caracteres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
