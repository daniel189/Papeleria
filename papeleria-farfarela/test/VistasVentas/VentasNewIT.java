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
     * Test of verEmpleado method, of class VentasNew.
     */
    @Test
    public void testVerEmpleado() {
        System.out.println("verEmpleado");
        String cuenta = "";
        VentasNew instance = new VentasNew();
        String expResult = "";
        String result = instance.verEmpleado(cuenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verFamilia method, of class VentasNew.
     */
    @Test
    public void testVerFamilia() {
        System.out.println("verFamilia");
        int idArticulo = 0;
        VentasNew instance = new VentasNew();
        int expResult = 0;
        int result = instance.verFamilia(idArticulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verStock method, of class VentasNew.
     */
    @Test
    public void testVerStock() {
        System.out.println("verStock");
        int idArticulo = 0;
        VentasNew instance = new VentasNew();
        int expResult = 0;
        int result = instance.verStock(idArticulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GenerarFactura method, of class VentasNew.
     */
    @Test
    public void testGenerarFactura() {
        System.out.println("GenerarFactura");
        VentasNew instance = new VentasNew();
        boolean expResult = false;
        boolean result = instance.GenerarFactura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GuardarArticulos method, of class VentasNew.
     */
    @Test
    public void testGuardarArticulos() {
        System.out.println("GuardarArticulos");
        VentasNew instance = new VentasNew();
        instance.GuardarArticulos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GenerarPDF method, of class VentasNew.
     */
    @Test
    public void testGenerarPDF() {
        System.out.println("GenerarPDF");
        VentasNew instance = new VentasNew();
        instance.GenerarPDF();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DosDecimales method, of class VentasNew.
     */
    @Test
    public void testDosDecimales() {
        System.out.println("DosDecimales");
        double valor = 0.0;
        VentasNew instance = new VentasNew();
        double expResult = 0.0;
        double result = instance.DosDecimales(valor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminaCaracteres method, of class VentasNew.
     */
    @Test
    public void testEliminaCaracteres() {
        System.out.println("EliminaCaracteres");
        String s_cadena = "";
        String s_caracteres = "";
        VentasNew instance = new VentasNew();
        String expResult = "";
        String result = instance.EliminaCaracteres(s_cadena, s_caracteres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
