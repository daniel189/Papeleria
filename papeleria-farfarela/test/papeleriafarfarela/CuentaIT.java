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
     * Test of getFacturas method, of class Cuenta.
     */
    @Test
    public void testGetFacturas() {
        System.out.println("getFacturas");
        Cuenta instance = new Cuenta();
        Collection<Factura> expResult = null;
        Collection<Factura> result = instance.getFacturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFacturas method, of class Cuenta.
     */
    @Test
    public void testAddFacturas() {
        System.out.println("addFacturas");
        Factura newFacturas = null;
        Cuenta instance = new Cuenta();
        instance.addFacturas(newFacturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFacturas method, of class Cuenta.
     */
    @Test
    public void testRemoveFacturas() {
        System.out.println("removeFacturas");
        Factura oldFacturas = null;
        Cuenta instance = new Cuenta();
        instance.removeFacturas(oldFacturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllFacturas method, of class Cuenta.
     */
    @Test
    public void testRemoveAllFacturas() {
        System.out.println("removeAllFacturas");
        Cuenta instance = new Cuenta();
        instance.removeAllFacturas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class Cuenta.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        Cuenta instance = new Cuenta();
        String expResult = "";
        String result = instance.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuenta method, of class Cuenta.
     */
    @Test
    public void testSetCuenta() {
        System.out.println("setCuenta");
        String cuenta = "";
        Cuenta instance = new Cuenta();
        instance.setCuenta(cuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPass method, of class Cuenta.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        Cuenta instance = new Cuenta();
        String expResult = "";
        String result = instance.getPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPass method, of class Cuenta.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "";
        Cuenta instance = new Cuenta();
        instance.setPass(pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNivel method, of class Cuenta.
     */
    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        Cuenta instance = new Cuenta();
        int expResult = 0;
        int result = instance.getNivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNivel method, of class Cuenta.
     */
    @Test
    public void testSetNivel() {
        System.out.println("setNivel");
        int nivel = 0;
        Cuenta instance = new Cuenta();
        instance.setNivel(nivel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmp_id method, of class Cuenta.
     */
    @Test
    public void testGetEmp_id() {
        System.out.println("getEmp_id");
        Cuenta instance = new Cuenta();
        int expResult = 0;
        int result = instance.getEmp_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmp_id method, of class Cuenta.
     */
    @Test
    public void testSetEmp_id() {
        System.out.println("setEmp_id");
        int emp_id = 0;
        Cuenta instance = new Cuenta();
        instance.setEmp_id(emp_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHabilitado method, of class Cuenta.
     */
    @Test
    public void testGetHabilitado() {
        System.out.println("getHabilitado");
        Cuenta instance = new Cuenta();
        String expResult = "";
        String result = instance.getHabilitado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHabilitado method, of class Cuenta.
     */
    @Test
    public void testSetHabilitado() {
        System.out.println("setHabilitado");
        String habilitado = "";
        Cuenta instance = new Cuenta();
        instance.setHabilitado(habilitado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
