/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriafarfarela;

import java.util.Collection;
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
public class ArticulosIT {
    
    public ArticulosIT() {
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
     * Test of getArtId method, of class Articulos.
     */
    @Test
    public void testGetArtId() {
        System.out.println("getArtId");
        Articulos instance = new Articulos();
        int expResult = 0;
        int result = instance.getArtId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtId method, of class Articulos.
     */
    @Test
    public void testSetArtId() {
        System.out.println("setArtId");
        int artId = 0;
        Articulos instance = new Articulos();
        instance.setArtId(artId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtNombre method, of class Articulos.
     */
    @Test
    public void testGetArtNombre() {
        System.out.println("getArtNombre");
        Articulos instance = new Articulos();
        String expResult = "";
        String result = instance.getArtNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtNombre method, of class Articulos.
     */
    @Test
    public void testSetArtNombre() {
        System.out.println("setArtNombre");
        String artNombre = "";
        Articulos instance = new Articulos();
        instance.setArtNombre(artNombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtDescripcion method, of class Articulos.
     */
    @Test
    public void testGetArtDescripcion() {
        System.out.println("getArtDescripcion");
        Articulos instance = new Articulos();
        String expResult = "";
        String result = instance.getArtDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtDescripcion method, of class Articulos.
     */
    @Test
    public void testSetArtDescripcion() {
        System.out.println("setArtDescripcion");
        String artDescripcion = "";
        Articulos instance = new Articulos();
        instance.setArtDescripcion(artDescripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtPrecio method, of class Articulos.
     */
    @Test
    public void testGetArtPrecio() {
        System.out.println("getArtPrecio");
        Articulos instance = new Articulos();
        float expResult = 0.0F;
        float result = instance.getArtPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtPrecio method, of class Articulos.
     */
    @Test
    public void testSetArtPrecio() {
        System.out.println("setArtPrecio");
        float artPrecio = 0.0F;
        Articulos instance = new Articulos();
        instance.setArtPrecio(artPrecio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtStock method, of class Articulos.
     */
    @Test
    public void testGetArtStock() {
        System.out.println("getArtStock");
        Articulos instance = new Articulos();
        double expResult = 0.0;
        double result = instance.getArtStock();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtStock method, of class Articulos.
     */
    @Test
    public void testSetArtStock() {
        System.out.println("setArtStock");
        double artStock = 0.0;
        Articulos instance = new Articulos();
        instance.setArtStock(artStock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaiva method, of class Articulos.
     */
    @Test
    public void testGetFechaiva() {
        System.out.println("getFechaiva");
        Articulos instance = new Articulos();
        Collection expResult = null;
        Collection result = instance.getFechaiva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaiva method, of class Articulos.
     */
    @Test
    public void testSetFechaiva() {
        System.out.println("setFechaiva");
        Collection fechaiva = null;
        Articulos instance = new Articulos();
        instance.setFechaiva(fechaiva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalle method, of class Articulos.
     */
    @Test
    public void testGetDetalle() {
        System.out.println("getDetalle");
        Articulos instance = new Articulos();
        Collection expResult = null;
        Collection result = instance.getDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetalle method, of class Articulos.
     */
    @Test
    public void testSetDetalle() {
        System.out.println("setDetalle");
        Collection detalle = null;
        Articulos instance = new Articulos();
        instance.setDetalle(detalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
