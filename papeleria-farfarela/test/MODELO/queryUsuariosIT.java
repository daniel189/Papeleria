/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import papeleriafarfarela.Cuenta;

/**
 *
 * @author w8
 */
public class queryUsuariosIT {
    
    public queryUsuariosIT() {
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
     * Test of getcuenta method, of class queryUsuarios.
     */
    @Test
    public void testGetcuenta() {
        System.out.println("getcuenta");
        String parametroCuenta = "";
        queryUsuarios instance = new queryUsuarios();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getcuenta(parametroCuenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuentas method, of class queryUsuarios.
     */
    @Test
    public void testGetCuentas() {
        System.out.println("getCuentas");
        queryUsuarios instance = new queryUsuarios();
        ArrayList<Cuenta> expResult = null;
        ArrayList<Cuenta> result = instance.getCuentas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuenta method, of class queryUsuarios.
     */
    @Test
    public void testSetCuenta() {
        System.out.println("setCuenta");
        Cuenta cue = null;
        queryUsuarios instance = new queryUsuarios();
        instance.setCuenta(cue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarRegistro method, of class queryUsuarios.
     */
    @Test
    public void testEliminarRegistro() {
        System.out.println("EliminarRegistro");
        String cuenta = "";
        queryUsuarios instance = new queryUsuarios();
        instance.EliminarRegistro(cuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCuenta method, of class queryUsuarios.
     */
    @Test
    public void testUpdateCuenta() {
        System.out.println("updateCuenta");
        ArrayList<String> lista = null;
        queryUsuarios instance = new queryUsuarios();
        instance.updateCuenta(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetCuenta method, of class queryUsuarios.
     */
    @Test
    public void testResetCuenta() {
        System.out.println("resetCuenta");
        String cuenta = "";
        String pass = "";
        queryUsuarios instance = new queryUsuarios();
        instance.resetCuenta(cuenta, pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
