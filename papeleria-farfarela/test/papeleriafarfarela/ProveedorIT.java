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
public class ProveedorIT {
    
    public ProveedorIT() {
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
     * Test of getArticulos method, of class Proveedor.
     */
    @Test
    public void testGetArticulos() {
        System.out.println("getArticulos");
        Proveedor instance = new Proveedor();
        Collection<Articulos> expResult = null;
        Collection<Articulos> result = instance.getArticulos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIteratorArticulos method, of class Proveedor.
     */
    @Test
    public void testGetIteratorArticulos() {
        System.out.println("getIteratorArticulos");
        Proveedor instance = new Proveedor();
        Iterator expResult = null;
        Iterator result = instance.getIteratorArticulos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArticulos method, of class Proveedor.
     */
    @Test
    public void testSetArticulos() {
        System.out.println("setArticulos");
        Collection<Articulos> newArticulos = null;
        Proveedor instance = new Proveedor();
        instance.setArticulos(newArticulos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addArticulos method, of class Proveedor.
     */
    @Test
    public void testAddArticulos() {
        System.out.println("addArticulos");
        Articulos newArticulos = null;
        Proveedor instance = new Proveedor();
        instance.addArticulos(newArticulos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeArticulos method, of class Proveedor.
     */
    @Test
    public void testRemoveArticulos() {
        System.out.println("removeArticulos");
        Articulos oldArticulos = null;
        Proveedor instance = new Proveedor();
        instance.removeArticulos(oldArticulos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllArticulos method, of class Proveedor.
     */
    @Test
    public void testRemoveAllArticulos() {
        System.out.println("removeAllArticulos");
        Proveedor instance = new Proveedor();
        instance.removeAllArticulos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
