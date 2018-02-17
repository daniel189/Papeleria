/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasArticulo;

import VistasArticulos.EditArticles;
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
public class ArticuloUpdateIT {
    
    public ArticuloUpdateIT() {
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
     * Test of getvalorencontrado method, of class EditaArticulos.
     */
    @Test
    public void testGetvalorencontrado() {
        System.out.println("getvalorencontrado");
        EditArticles instance = new EditArticles();
        int expResult = 0;
        int result = instance.getvalorencontrado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionaritem method, of class EditaArticulos.
     */
    @Test
    public void testSeleccionaritem() {
        System.out.println("seleccionaritem");
        EditArticles instance = new EditArticles();
        int expResult = 0;
        int result = instance.selectItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargartxt method, of class EditaArticulos.
     */
    @Test
    public void testCargartxt() {
        System.out.println("cargartxt");
        EditArticles instance = new EditArticles();
        instance.loadTxt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
