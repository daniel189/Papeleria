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
     * Test of getArtId method, of class Articulo.
     */
    @Test
    public void testGetArtId() {
        System.out.println("getArtId");
        Articulo instance = new Articulo();
        int expResult = 0;
        int result = instance.getArticuloId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtId method, of class Articulo.
     */
    @Test
    public void testSetArtId() {
        System.out.println("setArtId");
        int artId = 0;
        Articulo instance = new Articulo();
        instance.setArticuloId(artId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtNombre method, of class Articulo.
     */
    @Test
    public void testGetArtNombre() {
        System.out.println("getArtNombre");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.getArticuloNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtNombre method, of class Articulo.
     */
    @Test
    public void testSetArtNombre() {
        System.out.println("setArtNombre");
        String artNombre = "";
        Articulo instance = new Articulo();
        instance.setArticuloNombre(artNombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtDescripcion method, of class Articulo.
     */
    @Test
    public void testGetArtDescripcion() {
        System.out.println("getArtDescripcion");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.getArticuloDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtDescripcion method, of class Articulo.
     */
    @Test
    public void testSetArtDescripcion() {
        System.out.println("setArtDescripcion");
        String artDescripcion = "";
        Articulo instance = new Articulo();
        instance.setArticuloDescripcion(artDescripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtPrecio method, of class Articulo.
     */
    @Test
    public void testGetArtPrecio() {
        System.out.println("getArtPrecio");
        Articulo instance = new Articulo();
        float expResult = 0.0F;
        float result = instance.getArticuloPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtPrecio method, of class Articulo.
     */
    @Test
    public void testSetArtPrecio() {
        System.out.println("setArtPrecio");
        float artPrecio = 0.0F;
        Articulo instance = new Articulo();
        instance.setArticuloPrecio(artPrecio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtStock method, of class Articulo.
     */
    @Test
    public void testGetArtStock() {
        System.out.println("getArtStock");
        Articulo instance = new Articulo();
        double expResult = 0.0;
        double result = instance.getArticuloStock();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtStock method, of class Articulo.
     */
    @Test
    public void testSetArtStock() {
        System.out.println("setArtStock");
        double artStock = 0.0;
        Articulo instance = new Articulo();
        instance.setArticuloStock(artStock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaiva method, of class Articulo.
     */
    @Test
    public void testGetFechaiva() {
        System.out.println("getFechaiva");
        Articulo instance = new Articulo();
        Collection expResult = null;
        Collection result = instance.getFechaIva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaiva method, of class Articulo.
     */
    @Test
    public void testSetFechaiva() {
        System.out.println("setFechaiva");
        Collection fechaiva = null;
        Articulo instance = new Articulo();
        instance.setFechaIva(fechaiva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetalle method, of class Articulo.
     */
    @Test
    public void testGetDetalle() {
        System.out.println("getDetalle");
        Articulo instance = new Articulo();
        Collection expResult = null;
        Collection result = instance.getDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetalle method, of class Articulo.
     */
    @Test
    public void testSetDetalle() {
        System.out.println("setDetalle");
        Collection detalle = null;
        Articulo instance = new Articulo();
        instance.setDetalle(detalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
