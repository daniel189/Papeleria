/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasCliente;

import VistasClientes.NuevoCliente;
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
public class ClienteNewIT {
    
    public ClienteNewIT() {
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
     * Test of valida method, of class NuevoCliente.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        String x = "";
        boolean expResult = false;
        boolean result = NuevoCliente.valida(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiarDatos method, of class NuevoCliente.
     */
    @Test
    public void testLimpiarDatos() {
        System.out.println("limpiarDatos");
        NuevoCliente instance = new NuevoCliente();
        instance.limpiarDatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
