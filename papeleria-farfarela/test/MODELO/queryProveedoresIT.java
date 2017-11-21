/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

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
public class queryProveedoresIT {
    
    public queryProveedoresIT() {
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
        queryProveedores instance = new queryProveedores();
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
        queryProveedores instance = new queryProveedores();
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
        queryProveedores instance = new queryProveedores();
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
        queryProveedores instance = new queryProveedores();
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
        queryProveedores instance = new queryProveedores();
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
        queryProveedores instance = new queryProveedores();
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
        queryProveedores instance = new queryProveedores();
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
        queryProveedores instance = new queryProveedores();
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
        queryProveedores instance = new queryProveedores();
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
        queryProveedores instance = new queryProveedores();
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
        queryProveedores instance = new queryProveedores();
        instance.reporteProveedores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
