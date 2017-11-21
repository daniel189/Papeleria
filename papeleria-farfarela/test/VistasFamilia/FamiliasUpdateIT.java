/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasFamilia;

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
public class FamiliasUpdateIT {
    
    public FamiliasUpdateIT() {
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
     * Test of cargartxt method, of class FamiliasUpdate.
     */
    @Test
    public void testCargartxt() {
        System.out.println("cargartxt");
        FamiliasUpdate instance = new FamiliasUpdate();
        instance.cargartxt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionaritem method, of class FamiliasUpdate.
     */
    @Test
    public void testSeleccionaritem() {
        System.out.println("seleccionaritem");
        FamiliasUpdate instance = new FamiliasUpdate();
        int expResult = 0;
        int result = instance.seleccionaritem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
