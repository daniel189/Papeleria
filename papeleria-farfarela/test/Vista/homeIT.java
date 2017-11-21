/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JLabel;
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
public class homeIT {
    
    public homeIT() {
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
     * Test of getLblCuenta method, of class HomeAplicativo.
     */
    @Test
    public void testGetLblCuenta() {
        System.out.println("getLblCuenta");
        JLabel expResult = null;
        JLabel result = HomeAplicativo.getLblCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLblCuenta method, of class HomeAplicativo.
     */
    @Test
    public void testSetLblCuenta() {
        System.out.println("setLblCuenta");
        JLabel lblCuenta = null;
        HomeAplicativo.setLblCuenta(lblCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estacerrado method, of class HomeAplicativo.
     */
    @Test
    public void testEstacerrado() {
        System.out.println("estacerrado");
        Object obj = null;
        boolean expResult = false;
        boolean result = HomeAplicativo.Cerrado(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of habilitar method, of class HomeAplicativo.
     */
    @Test
    public void testHabilitar() {
        System.out.println("habilitar");
        HomeAplicativo instance = new HomeAplicativo();
        instance.Habilitar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class HomeAplicativo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HomeAplicativo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class HomeAplicativo.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        String expResult = "";
        String result = HomeAplicativo.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuenta method, of class HomeAplicativo.
     */
    @Test
    public void testSetCuenta() {
        System.out.println("setCuenta");
        String aCuenta = "";
        HomeAplicativo.setCuenta(aCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNivel method, of class HomeAplicativo.
     */
    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        String expResult = "";
        String result = HomeAplicativo.getNivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNivel method, of class HomeAplicativo.
     */
    @Test
    public void testSetNivel() {
        System.out.println("setNivel");
        String aNivel = "";
        HomeAplicativo.setNivel(aNivel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta1 method, of class HomeAplicativo.
     */
    @Test
    public void testGetCuenta1() {
        System.out.println("getCuenta1");
        String expResult = "";
        String result = HomeAplicativo.getCuenta1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
