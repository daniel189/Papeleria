/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriafarfarela;

import PapeleriaFarfarela.Bill;
import PapeleriaFarfarela.Account;
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
public class CuentaIT {
    
    public CuentaIT() {
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
     * Test of getBills method, of class Account.
     */
    @Test
    public void testGetFacturas() {
        System.out.println("getFacturas");
        Account instance = new Account();
        Collection<Bill> expResult = null;
        Collection<Bill> result = instance.getBills();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBills method, of class Account.
     */
    @Test
    public void testAddFacturas() {
        System.out.println("addFacturas");
        Bill newFacturas = null;
        Account instance = new Account();
        instance.addBills(newFacturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBills method, of class Account.
     */
    @Test
    public void testRemoveFacturas() {
        System.out.println("removeFacturas");
        Bill oldFacturas = null;
        Account instance = new Account();
        instance.removeBills(oldFacturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllBills method, of class Account.
     */
    @Test
    public void testRemoveAllFacturas() {
        System.out.println("removeAllFacturas");
        Account instance = new Account();
        instance.removeAllBills();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountName method, of class Account.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getAccountName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountName method, of class Account.
     */
    @Test
    public void testSetCuenta() {
        System.out.println("setCuenta");
        String cuenta = "";
        Account instance = new Account();
        instance.setAccountName(cuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountPassword method, of class Account.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getAccountPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountPassword method, of class Account.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "";
        Account instance = new Account();
        instance.setAccountPassword(pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountAccessLevel method, of class Account.
     */
    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getAccountAccessLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountAccessLevel method, of class Account.
     */
    @Test
    public void testSetNivel() {
        System.out.println("setNivel");
        int nivel = 0;
        Account instance = new Account();
        instance.setAccountAccessLevel(nivel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getemployeeId method, of class Account.
     */
    @Test
    public void testGetEmp_id() {
        System.out.println("getEmp_id");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getemployeeId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeId method, of class Account.
     */
    @Test
    public void testSetEmp_id() {
        System.out.println("setEmp_id");
        int emp_id = 0;
        Account instance = new Account();
        instance.setEmployeeId(emp_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountStatus method, of class Account.
     */
    @Test
    public void testGetHabilitado() {
        System.out.println("getHabilitado");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getAccountStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountStatus method, of class Account.
     */
    @Test
    public void testSetHabilitado() {
        System.out.println("setHabilitado");
        String habilitado = "";
        Account instance = new Account();
        instance.setAccountStatus(habilitado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
