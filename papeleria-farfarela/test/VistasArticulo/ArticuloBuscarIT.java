/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasArticulo;

import VistasArticulos.FoundArticles;
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
public class ArticuloBuscarIT {
    
    public ArticuloBuscarIT() {
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
     * Test of seleccionaritem method, of class BusquedaArticulos.
     */
    @Test
    public void testSeleccionaritem() {
        System.out.println("seleccionaritem");
        FoundArticles instance = new FoundArticles();
        int expResult = 0;
        int result = instance.seleccionaritem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargartxt method, of class BusquedaArticulos.
     */
    @Test
    public void testCargartxt() {
        System.out.println("cargartxt");
        FoundArticles instance = new FoundArticles();
        //instance.txt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getvalor method, of class BusquedaArticulos.
     */
    @Test
    public void testGetvalor() {
        System.out.println("getvalor");
        FoundArticles instance = new FoundArticles();
        int expResult = 0;
        int result = instance.getvalor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
