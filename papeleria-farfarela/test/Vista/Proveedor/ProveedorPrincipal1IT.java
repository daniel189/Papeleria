/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Proveedor;

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
public class ProveedorPrincipal1IT {
    
    public ProveedorPrincipal1IT() {
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
     * Test of HabilitarBotones method, of class ProveedorPrincipal1.
     */
    @Test
    public void testHabilitarBotones() {
        System.out.println("HabilitarBotones");
        boolean Crear = false;
        boolean Ver = false;
        boolean Editar = false;
        boolean Eliminar = false;
        ProveedorPrincipal1 instance = new ProveedorPrincipal1();
        instance.HabilitarBotones(Crear, Ver, Editar, Eliminar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filtro method, of class ProveedorPrincipal1.
     */
    @Test
    public void testFiltro() {
        System.out.println("filtro");
        ProveedorPrincipal1 instance = new ProveedorPrincipal1();
        instance.filtro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
