/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriafarfarela;

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
public class EmpleadoIT {
    
    public EmpleadoIT() {
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
     * Test of getCuenta method, of class Empleado.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        Empleado instance = new Empleado();
        Collection<Cuenta> expResult = null;
        Collection<Cuenta> result = instance.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIteratorCuenta method, of class Empleado.
     */
    @Test
    public void testGetIteratorCuenta() {
        System.out.println("getIteratorCuenta");
        Empleado instance = new Empleado();
        Iterator expResult = null;
        Iterator result = instance.getIteratorCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuenta method, of class Empleado.
     */
    @Test
    public void testSetCuenta() {
        System.out.println("setCuenta");
        Collection<Cuenta> newCuenta = null;
        Empleado instance = new Empleado();
        instance.setCuenta(newCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCuenta method, of class Empleado.
     */
    @Test
    public void testAddCuenta() {
        System.out.println("addCuenta");
        Cuenta newCuenta = null;
        Empleado instance = new Empleado();
        instance.addCuenta(newCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCuenta method, of class Empleado.
     */
    @Test
    public void testRemoveCuenta() {
        System.out.println("removeCuenta");
        Cuenta oldCuenta = null;
        Empleado instance = new Empleado();
        instance.removeCuenta(oldCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllCuenta method, of class Empleado.
     */
    @Test
    public void testRemoveAllCuenta() {
        System.out.println("removeAllCuenta");
        Empleado instance = new Empleado();
        instance.removeAllCuenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
