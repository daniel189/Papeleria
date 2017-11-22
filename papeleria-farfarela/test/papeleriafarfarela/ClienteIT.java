/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriafarfarela;

import java.util.Collection;
import java.util.Iterator;
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
public class ClienteIT {
    
    public ClienteIT() {
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
     * Test of getFacturas method, of class Cliente.
     */
    @Test
    public void testGetFacturas() {
        System.out.println("getFacturas");
        Cliente instance = new Cliente();
        Collection<Factura> expResult = null;
        Collection<Factura> result = instance.getFacturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIteratorFacturas method, of class Cliente.
     */
    @Test
    public void testGetIteratorFacturas() {
        System.out.println("getIteratorFacturas");
        Cliente instance = new Cliente();
        Iterator expResult = null;
        Iterator result = instance.getIteratorFacturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFacturas method, of class Cliente.
     */
    @Test
    public void testSetFacturas() {
        System.out.println("setFacturas");
        Collection<Factura> newFacturas = null;
        Cliente instance = new Cliente();
        instance.setFacturas(newFacturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFacturas method, of class Cliente.
     */
    @Test
    public void testAddFacturas() {
        System.out.println("addFacturas");
        Factura newFacturas = null;
        Cliente instance = new Cliente();
        instance.addFacturas(newFacturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFacturas method, of class Cliente.
     */
    @Test
    public void testRemoveFacturas() {
        System.out.println("removeFacturas");
        Factura oldFacturas = null;
        Cliente instance = new Cliente();
        instance.removeFacturas(oldFacturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllFacturas method, of class Cliente.
     */
    @Test
    public void testRemoveAllFacturas() {
        System.out.println("removeAllFacturas");
        Cliente instance = new Cliente();
        instance.removeAllFacturas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
