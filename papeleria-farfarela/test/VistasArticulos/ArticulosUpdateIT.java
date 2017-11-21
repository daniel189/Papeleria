/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasArticulos;

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
public class ArticulosUpdateIT {
    
    public ArticulosUpdateIT() {
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
     * Test of getvalorencontrado method, of class ArticulosUpdate.
     */
    @Test
    public void testGetvalorencontrado() {
        System.out.println("getvalorencontrado");
        ArticulosUpdate instance = new ArticulosUpdate();
        int expResult = 0;
        int result = instance.getvalorencontrado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionaritem method, of class ArticulosUpdate.
     */
    @Test
    public void testSeleccionaritem() {
        System.out.println("seleccionaritem");
        ArticulosUpdate instance = new ArticulosUpdate();
        int expResult = 0;
        int result = instance.seleccionaritem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargartxt method, of class ArticulosUpdate.
     */
    @Test
    public void testCargartxt() {
        System.out.println("cargartxt");
        ArticulosUpdate instance = new ArticulosUpdate();
        instance.cargartxt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
