/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriafarfarela;

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
public class FamiliaIT {
    
    public FamiliaIT() {
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
     * Test of getFAM_id method, of class Familia.
     */
    @Test
    public void testGetFAM_id() {
        System.out.println("getFAM_id");
        Familia instance = new Familia();
        int expResult = 0;
        int result = instance.getFamiliaId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFAM_id method, of class Familia.
     */
    @Test
    public void testSetFAM_id() {
        System.out.println("setFAM_id");
        int FAM_id = 0;
        Familia instance = new Familia();
        instance.setFamiliaId(FAM_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFAM_nombre method, of class Familia.
     */
    @Test
    public void testGetFAM_nombre() {
        System.out.println("getFAM_nombre");
        Familia instance = new Familia();
        String expResult = "";
        String result = instance.getFamiliaNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFAM_nombre method, of class Familia.
     */
    @Test
    public void testSetFAM_nombre() {
        System.out.println("setFAM_nombre");
        String FAM_nombre = "";
        Familia instance = new Familia();
        instance.setFamiliaNombre(FAM_nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFAM_detale method, of class Familia.
     */
    @Test
    public void testGetFAM_detale() {
        System.out.println("getFAM_detale");
        Familia instance = new Familia();
        String expResult = "";
        String result = instance.getFamiliaDetale();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFAM_detale method, of class Familia.
     */
    @Test
    public void testSetFAM_detale() {
        System.out.println("setFAM_detale");
        String FAM_detale = "";
        Familia instance = new Familia();
        instance.setFamiliaDetale(FAM_detale);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
