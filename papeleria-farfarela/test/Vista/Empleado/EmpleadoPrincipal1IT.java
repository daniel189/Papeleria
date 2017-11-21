/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Empleado;

import VistaEmpleado.EmpleadoPrincipal1;
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
public class EmpleadoPrincipal1IT {
    
    public EmpleadoPrincipal1IT() {
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
     * Test of filtro method, of class EmpleadoPrincipal1.
     */
    @Test
    public void testFiltro() {
        System.out.println("filtro");
        EmpleadoPrincipal1 instance = new EmpleadoPrincipal1();
        instance.Filtrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
