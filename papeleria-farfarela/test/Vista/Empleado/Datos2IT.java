/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Empleado;

import VistaEmpleado.Datos2;
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
public class Datos2IT {
    
    public Datos2IT() {
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
     * Test of claveMax method, of class Datos2.
     */
    @Test
    public void testClaveMax() {
        System.out.println("claveMax");
        Datos2 instance = null;
        instance.claveMax();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hint method, of class Datos2.
     */
    @Test
    public void testHint() {
        System.out.println("Hint");
        Datos2 instance = null;
        instance.Hint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Llenar method, of class Datos2.
     */
    @Test
    public void testLlenar() throws Exception {
        System.out.println("Llenar");
        String cod = "";
        String ident = "";
        String nombres = "";
        String apellidos = "";
        String direccion = "";
        String telefono = "";
        String cargo = "";
        String observacion = "";
        String fnacimiento = "";
        String fingreso = "";
        Datos2 instance = null;
        instance.Llenar(cod, ident, nombres, apellidos, direccion, telefono, cargo, observacion, fnacimiento, fingreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Desabilitar method, of class Datos2.
     */
    @Test
    public void testDesabilitar() {
        System.out.println("Desabilitar");
        Datos2 instance = null;
        instance.Desabilitar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class Datos2.
     */
    @Test
    public void testLimpiar() throws Exception {
        System.out.println("Limpiar");
        Datos2 instance = null;
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCamposVacios method, of class Datos2.
     */
    @Test
    public void testValidarCamposVacios() {
        System.out.println("validarCamposVacios");
        Datos2 instance = null;
        instance.validarCamposVacios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Datos2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Datos2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpcion method, of class Datos2.
     */
    @Test
    public void testGetOpcion() {
        System.out.println("getOpcion");
        Datos2 instance = null;
        int expResult = 0;
        int result = instance.getOpcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpcion method, of class Datos2.
     */
    @Test
    public void testSetOpcion() {
        System.out.println("setOpcion");
        int opcion = 0;
        Datos2 instance = null;
        instance.setOpcion(opcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
