/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import MODEL.QueryProvider;
import java.util.Date;
import javax.swing.JTextField;
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
public class queryProveedorIT {
    
    public queryProveedorIT() {
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
     * Test of agregarProveedor method, of class queryProveedores.
     */
    @Test
    public void testAgregarProveedor() {
        System.out.println("agregarProveedor");
        int cod = 0;
        String id = "";
        String nombres = "";
        String apellidos = "";
        String direccion = "";
        String telefono = "";
        String observacion = "";
        Date fNacimiento = null;
        Date fIngreso = null;
        QueryProvider instance = new QueryProvider();
        instance.agregarProveedor(cod, id, nombres, apellidos, direccion, telefono, observacion, fNacimiento, fIngreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarProveedor method, of class queryProveedores.
     */
    @Test
    public void testEliminarProveedor() {
        System.out.println("eliminarProveedor");
        int code = 0;
        QueryProvider instance = new QueryProvider();
        instance.eliminarProveedor(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarProveedor method, of class queryProveedores.
     */
    @Test
    public void testModificarProveedor() {
        System.out.println("modificarProveedor");
        int cod = 0;
        String id = "";
        String razonSocial = "";
        String telefono = "";
        String contacto = "";
        String telfContacto = "";
        String direccion = "";
        QueryProvider instance = new QueryProvider();
        instance.modificarProveedor(cod, id, razonSocial, telefono, contacto, telfContacto, direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarTabla method, of class queryProveedores.
     */
    @Test
    public void testActualizarTabla() {
        System.out.println("actualizarTabla");
        QueryProvider instance = new QueryProvider();
        instance.actualizarTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTodosProveedores method, of class queryProveedores.
     */
    @Test
    public void testListarTodosProveedores() {
        System.out.println("listarTodosProveedores");
        QueryProvider instance = new QueryProvider();
        instance.listarTodosProveedores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRepetido method, of class queryProveedores.
     */
    @Test
    public void testBuscarRepetido() {
        System.out.println("buscarRepetido");
        String identificador = "";
        QueryProvider instance = new QueryProvider();
        boolean expResult = false;
        boolean result = instance.buscarRepetido(identificador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutarConsultaTodaTabla method, of class queryProveedores.
     */
    @Test
    public void testEjecutarConsultaTodaTabla() {
        System.out.println("ejecutarConsultaTodaTabla");
        QueryProvider instance = new QueryProvider();
        instance.ejecutarConsultaTodaTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarProveedor method, of class queryProveedores.
     */
    @Test
    public void testBuscarProveedor() {
        System.out.println("buscarProveedor");
        String parametroBusqueda = "";
        boolean buscarPorCodigo = false;
        boolean buscarPorIdentificador = false;
        boolean buscarPorRazonSocial = false;
        QueryProvider instance = new QueryProvider();
        instance.buscarProveedor(parametroBusqueda, buscarPorCodigo, buscarPorIdentificador, buscarPorRazonSocial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRegistroCodigoOIdentificadorONombreOapellido method, of class queryProveedores.
     */
    @Test
    public void testBuscarRegistroCodigoOIdentificadorONombreOapellido() {
        System.out.println("buscarRegistroCodigoOIdentificadorONombreOapellido");
        String parametroBusqueda = "";
        boolean buscarPorCodigo = false;
        boolean buscarPorIdentificador = false;
        boolean buscarPorRazonSocial = false;
        QueryProvider instance = new QueryProvider();
        instance.buscarRegistroCodigoOIdentificadorONombreOapellido(parametroBusqueda, buscarPorCodigo, buscarPorIdentificador, buscarPorRazonSocial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarDocumento method, of class queryProveedores.
     */
    @Test
    public void testValidarDocumento() {
        System.out.println("validarDocumento");
        JTextField numero = null;
        QueryProvider instance = new QueryProvider();
        boolean expResult = false;
        boolean result = instance.validarDocumento(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporteProveedores method, of class queryProveedores.
     */
    @Test
    public void testReporteProveedores() {
        System.out.println("reporteProveedores");
        QueryProvider instance = new QueryProvider();
        instance.reporteProveedores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
