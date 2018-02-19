/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriafarfarela;

import PapeleriaFarfarela.Bill;
import PapeleriaFarfarela.Client;
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
public class ClienteIT {
    
    public ClienteIT() {
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
     * Test of getBills method, of class Client.
     */
    @Test
    public void testGetFacturas() {
        System.out.println("getFacturas");
        Client instance = new Client();
        Collection<Bill> expResult = null;
        Collection<Bill> result = instance.getBills();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBillsIterator method, of class Client.
     */
    @Test
    public void testGetIteratorFacturas() {
        System.out.println("getIteratorFacturas");
        Client instance = new Client();
        Iterator expResult = null;
        Iterator result = instance.getBillsIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBills method, of class Client.
     */
    @Test
    public void testSetFacturas() {
        System.out.println("setFacturas");
        Collection<Bill> newFacturas = null;
        Client instance = new Client();
        instance.setBills(newFacturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBills method, of class Client.
     */
    @Test
    public void testAddFacturas() {
        System.out.println("addFacturas");
        Bill newFacturas = null;
        Client instance = new Client();
        instance.addBills(newFacturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBills method, of class Client.
     */
    @Test
    public void testRemoveFacturas() {
        System.out.println("removeFacturas");
        Bill oldFacturas = null;
        Client instance = new Client();
        instance.removeBills(oldFacturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllBills method, of class Client.
     */
    @Test
    public void testRemoveAllFacturas() {
        System.out.println("removeAllFacturas");
        Client instance = new Client();
        instance.removeAllBills();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
