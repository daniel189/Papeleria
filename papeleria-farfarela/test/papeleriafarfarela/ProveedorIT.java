/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriafarfarela;

import PapeleriaFarfarela.Provider;
import PapeleriaFarfarela.Article;
import java.util.Collection;
import java.util.Iterator;
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
public class ProveedorIT {
    
    public ProveedorIT() {
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
     * Test of getArticle method, of class Provider.
     */
    @Test
    public void testGetArticulos() {
        System.out.println("getArticulos");
        Provider instance = new Provider();
        Collection<Article> expResult = null;
        Collection<Article> result = instance.getArticle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArticleIterator method, of class Provider.
     */
    @Test
    public void testGetIteratorArticulos() {
        System.out.println("getIteratorArticulos");
        Provider instance = new Provider();
        Iterator expResult = null;
        Iterator result = instance.getArticleIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArticle method, of class Provider.
     */
    @Test
    public void testSetArticulos() {
        System.out.println("setArticulos");
        Collection<Article> newArticulos = null;
        Provider instance = new Provider();
        instance.setArticle(newArticulos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAticle method, of class Provider.
     */
    @Test
    public void testAddArticulos() {
        System.out.println("addArticulos");
        Article newArticulos = null;
        Provider instance = new Provider();
        instance.addAticle(newArticulos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeArticle method, of class Provider.
     */
    @Test
    public void testRemoveArticulos() {
        System.out.println("removeArticulos");
        Article oldArticulos = null;
        Provider instance = new Provider();
        instance.removeArticle(oldArticulos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllArticle method, of class Provider.
     */
    @Test
    public void testRemoveAllArticulos() {
        System.out.println("removeAllArticulos");
        Provider instance = new Provider();
        instance.removeAllArticle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
