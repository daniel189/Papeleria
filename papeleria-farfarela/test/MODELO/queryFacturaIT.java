/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

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
public class queryFacturaIT {
    
    public queryFacturaIT() {
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
     * Test of listarTodosFacturas method, of class queryFacturas.
     */
    @Test
    public void testListarTodosFacturas() {
        System.out.println("listarTodosFacturas");
        queryFactura instance = new queryFactura();
        instance.listarTodosFacturas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutarConsultaTodaTabladeFacturas method, of class queryFacturas.
     */
    @Test
    public void testEjecutarConsultaTodaTabladeFacturas() {
        System.out.println("ejecutarConsultaTodaTabladeFacturas");
        queryFactura instance = new queryFactura();
        instance.ejecutarConsultaTodaTabladeFacturas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarFacturas method, of class queryFacturas.
     */
    @Test
    public void testBuscarFacturas_4args() {
        System.out.println("buscarFacturas");
        String parametroBusqueda = "";
        boolean buscarPorFacturas = false;
        boolean buscarPorCliente = false;
        boolean buscarPorFecha = false;
        queryFactura instance = new queryFactura();
        instance.buscarFacturas(parametroBusqueda, buscarPorFacturas, buscarPorCliente, buscarPorFecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarFacturasporBusqueda method, of class queryFacturas.
     */
    @Test
    public void testBuscarFacturasporBusqueda() {
        System.out.println("buscarFacturasporBusqueda");
        String parametroBusqueda = "";
        boolean buscarPorFacturas = false;
        boolean buscarPorCliente = false;
        boolean buscarPorFecha = false;
        queryFactura instance = new queryFactura();
        instance.buscarFacturasporBusqueda(parametroBusqueda, buscarPorFacturas, buscarPorCliente, buscarPorFecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarFacturas method, of class queryFacturas.
     */
    @Test
    public void testBuscarFacturas_String() {
        System.out.println("buscarFacturas");
        String number = "";
        queryFactura instance = new queryFactura();
        instance.buscarFacturas(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarFacturasDetall method, of class queryFacturas.
     */
    @Test
    public void testBuscarFacturasDetall() {
        System.out.println("buscarFacturasDetall");
        String number = "";
        queryFactura instance = new queryFactura();
        instance.buscarFacturasDetall(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
