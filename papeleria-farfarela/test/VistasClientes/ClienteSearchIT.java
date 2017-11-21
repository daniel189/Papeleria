/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasClientes;

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
public class ClienteSearchIT {
    
    public ClienteSearchIT() {
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
     * Test of limparDatos method, of class GestionCliente.
     */
    @Test
    public void testLimparDatos() {
        System.out.println("limparDatos");
        GestionCliente instance = new GestionCliente();
        instance.limparDatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llenarClientes method, of class GestionCliente.
     */
    @Test
    public void testLlenarClientes() {
        System.out.println("llenarClientes");
        String condicion = "";
        int aux = 0;
        GestionCliente instance = new GestionCliente();
        instance.llenarClientes(condicion, aux);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
