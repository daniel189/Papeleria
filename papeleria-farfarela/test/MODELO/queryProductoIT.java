/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

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
public class queryProductoIT {
    
    public queryProductoIT() {
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
     * Test of reportePrductosMasV method, of class queryProductos.
     */
    @Test
    public void testReportePrductosMasV() {
        System.out.println("reportePrductosMasV");
        queryProductos instance = new queryProductos();
        instance.reportePrductosMasV();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reportePrductosMenosV method, of class queryProductos.
     */
    @Test
    public void testReportePrductosMenosV() {
        System.out.println("reportePrductosMenosV");
        queryProductos instance = new queryProductos();
        instance.reportePrductosMenosV();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
