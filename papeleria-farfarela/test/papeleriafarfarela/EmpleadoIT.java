/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriafarfarela;

import PapeleriaFarfarela.Account;
import PapeleriaFarfarela.Employee;
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
     * Test of getAccount method, of class Employee.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        Employee instance = new Employee();
        Collection<Account> expResult = null;
        Collection<Account> result = instance.getAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIteratorAccount method, of class Employee.
     */
    @Test
    public void testGetIteratorCuenta() {
        System.out.println("getIteratorCuenta");
        Employee instance = new Employee();
        Iterator expResult = null;
        Iterator result = instance.getIteratorAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccount method, of class Employee.
     */
    @Test
    public void testSetCuenta() {
        System.out.println("setCuenta");
        Collection<Account> newCuenta = null;
        Employee instance = new Employee();
        instance.setAccount(newCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccount method, of class Employee.
     */
    @Test
    public void testAddCuenta() {
        System.out.println("addCuenta");
        Account newCuenta = null;
        Employee instance = new Employee();
        instance.addAccount(newCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAccount method, of class Employee.
     */
    @Test
    public void testRemoveCuenta() {
        System.out.println("removeCuenta");
        Account oldCuenta = null;
        Employee instance = new Employee();
        instance.removeAccount(oldCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllAccount method, of class Employee.
     */
    @Test
    public void testRemoveAllCuenta() {
        System.out.println("removeAllCuenta");
        Employee instance = new Employee();
        instance.removeAllAccount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
