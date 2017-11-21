/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasArticulo;

import VistasArticulos.NuevoArticulo;
import java.awt.event.KeyEvent;
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
public class ArticuloNewIT {
    
    public ArticuloNewIT() {
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
     * Test of claveMax method, of class NuevoArticulo.
     */
    @Test
    public void testClaveMax() {
        System.out.println("claveMax");
        NuevoArticulo instance = new NuevoArticulo();
        instance.claveMax();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarletra method, of class NuevoArticulo.
     */
    @Test
    public void testValidarletra() {
        System.out.println("validarletra");
        KeyEvent evt = null;
        NuevoArticulo instance = new NuevoArticulo();
        instance.validarletra(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
