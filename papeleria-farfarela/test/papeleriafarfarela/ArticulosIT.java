/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriafarfarela;

import PapeleriaFarfarela.Article;
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
     * Test of getArtId method, of class Article.
     */
    @Test
    public void testGetArtId() {
        System.out.println("getArtId");
        Article instance = new Article();
        int expResult = 0;
        int result = instance.getArticleId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtId method, of class Article.
     */
    @Test
    public void testSetArtId() {
        System.out.println("setArtId");
        int artId = 0;
        Article instance = new Article();
        instance.setArticleId(artId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtNombre method, of class Article.
     */
    @Test
    public void testGetArtNombre() {
        System.out.println("getArtNombre");
        Article instance = new Article();
        String expResult = "";
        String result = instance.getArticleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtNombre method, of class Article.
     */
    @Test
    public void testSetArtNombre() {
        System.out.println("setArtNombre");
        String artNombre = "";
        Article instance = new Article();
        instance.setArticleName(artNombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtDescripcion method, of class Article.
     */
    @Test
    public void testGetArtDescripcion() {
        System.out.println("getArtDescripcion");
        Article instance = new Article();
        String expResult = "";
        String result = instance.getArticleDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtDescripcion method, of class Article.
     */
    @Test
    public void testSetArtDescripcion() {
        System.out.println("setArtDescripcion");
        String artDescripcion = "";
        Article instance = new Article();
        instance.setArticleDescription(artDescripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtPrecio method, of class Article.
     */
    @Test
    public void testGetArtPrecio() {
        System.out.println("getArtPrecio");
        Article instance = new Article();
        float expResult = 0.0F;
        float result = instance.getArticlePrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtPrecio method, of class Article.
     */
    @Test
    public void testSetArtPrecio() {
        System.out.println("setArtPrecio");
        float artPrecio = 0.0F;
        Article instance = new Article();
        instance.setArticlePrice(artPrecio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtStock method, of class Article.
     */
    @Test
    public void testGetArtStock() {
        System.out.println("getArtStock");
        Article instance = new Article();
        double expResult = 0.0;
        double result = instance.getArticleStock();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtStock method, of class Article.
     */
    @Test
    public void testSetArtStock() {
        System.out.println("setArtStock");
        double artStock = 0.0;
        Article instance = new Article();
        instance.setArticleStock(artStock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaiva method, of class Article.
     */
    @Test
    public void testGetFechaiva() {
        System.out.println("getFechaiva");
        Article instance = new Article();
        Collection expResult = null;
        Collection result = instance.getVatDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaiva method, of class Article.
     */
    @Test
    public void testSetFechaiva() {
        System.out.println("setFechaiva");
        Collection fechaiva = null;
        Article instance = new Article();
        instance.setVatDate(fechaiva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetail method, of class Article.
     */
    @Test
    public void testGetDetalle() {
        System.out.println("getDetalle");
        Article instance = new Article();
        Collection expResult = null;
        Collection result = instance.getDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetail method, of class Article.
     */
    @Test
    public void testSetDetalle() {
        System.out.println("setDetalle");
        Collection detalle = null;
        Article instance = new Article();
        instance.setDetail(detalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
