/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
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
public class queryIvaIT {
    
    public queryIvaIT() {
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
     * Test of setIVas method, of class queryIvas.
     */
    @Test
    public void testSetIVas() {
        System.out.println("setIVas");
        ArrayList<String> lista = null;
        queryIvas instance = new queryIvas();
        boolean expResult = false;
        boolean result = instance.setIVas(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarIvas method, of class queryIvas.
     */
    @Test
    public void testCargarIvas() {
        System.out.println("cargarIvas");
        queryIvas instance = new queryIvas();
        JComboBox expResult = null;
        JComboBox result = instance.cargarIvas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateIvas method, of class queryIvas.
     */
    @Test
    public void testUpdateIvas() {
        System.out.println("updateIvas");
        ArrayList<String> lista = null;
        queryIvas instance = new queryIvas();
        instance.updateIvas(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerIvas method, of class queryIvas.
     */
    @Test
    public void testLeerIvas() {
        System.out.println("leerIvas");
        queryIvas instance = new queryIvas();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.leerIvas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
