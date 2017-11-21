/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

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
public class queryFamiliasIT {
    
    public queryFamiliasIT() {
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
     * Test of modificarFamilia method, of class queryFamilias.
     */
    @Test
    public void testModificarFamilia() {
        System.out.println("modificarFamilia");
        int fami_id = 0;
        int iva_ide = 0;
        String fam_nom = "";
        String fam_descripcion = "";
        queryFamilias instance = new queryFamilias();
        instance.modificarFamilia(fami_id, iva_ide, fam_nom, fam_descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargariva method, of class queryFamilias.
     */
    @Test
    public void testCargariva() {
        System.out.println("cargariva");
        queryFamilias instance = new queryFamilias();
        JComboBox expResult = null;
        JComboBox result = instance.cargariva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignariva method, of class queryFamilias.
     */
    @Test
    public void testAsignariva() {
        System.out.println("asignariva");
        int iva = 0;
        queryFamilias instance = new queryFamilias();
        int expResult = 0;
        int result = instance.asignariva(iva);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateFamilia method, of class queryFamilias.
     */
    @Test
    public void testUpdateFamilia() {
        System.out.println("UpdateFamilia");
        String texto = "";
        int item = 0;
        queryFamilias instance = new queryFamilias();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.UpdateFamilia(texto, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFamilia method, of class queryFamilias.
     */
    @Test
    public void testSetFamilia() {
        System.out.println("setFamilia");
        int id = 0;
        int iva = 0;
        String nombre = "";
        String detalle = "";
        queryFamilias instance = new queryFamilias();
        boolean expResult = false;
        boolean result = instance.setFamilia(id, iva, nombre, detalle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
