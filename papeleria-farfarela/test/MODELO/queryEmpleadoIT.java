/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import MODEL.QueryEmployee;
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
public class queryEmpleadoIT {
    
    public queryEmpleadoIT() {
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
     * Test of agregarEmpleado method, of class queryEmpleados.
     */
    @Test
    public void testAgregarEmpleado() {
        System.out.println("agregarEmpleado");
        int cod = 0;
        String id = "";
        String nombres = "";
        String apellidos = "";
        String direccion = "";
        String telefono = "";
        String observacion = "";
        Date fNacimiento = null;
        Date fIngreso = null;
        QueryEmployee instance = new QueryEmployee();
        instance.agregarEmpleado(cod, id, nombres, apellidos, direccion, telefono, observacion, fNacimiento, fIngreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEmpleado method, of class queryEmpleados.
     */
    @Test
    public void testEliminarEmpleado() {
        System.out.println("eliminarEmpleado");
        int code = 0;
        QueryEmployee instance = new QueryEmployee();
        instance.eliminarEmpleado(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRepetido method, of class queryEmpleados.
     */
    @Test
    public void testBuscarRepetido() {
        System.out.println("buscarRepetido");
        String identificador = "";
        QueryEmployee instance = new QueryEmployee();
        boolean expResult = false;
        boolean result = instance.buscarRepetido(identificador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEmpleado method, of class queryEmpleados.
     */
    @Test
    public void testModificarEmpleado() {
        System.out.println("modificarEmpleado");
        int cod = 0;
        String id = "";
        String nombres = "";
        String apellidos = "";
        String direccion = "";
        String telefono = "";
        String cargo = "";
        String observacion = "";
        String fNacimiento = "";
        String fIngreso = "";
        QueryEmployee instance = new QueryEmployee();
        instance.modificarEmpleado(cod, id, nombres, apellidos, direccion, telefono, cargo, observacion, fNacimiento, fIngreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTodosEmpleados method, of class queryEmpleados.
     */
    @Test
    public void testListarTodosEmpleados() {
        System.out.println("listarTodosEmpleados");
        QueryEmployee instance = new QueryEmployee();
        instance.listarTodosEmpleados();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchall method, of class queryEmpleados.
     */
    @Test
    public void testEjecutarConsultaTodaTabla() {
        System.out.println("ejecutarConsultaTodaTabla");
        QueryEmployee instance = new QueryEmployee();
        instance.searchall();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporteEmpleados method, of class queryEmpleados.
     */
    @Test
    public void testReporteEmpleados() {
        System.out.println("reporteEmpleados");
        QueryEmployee instance = new QueryEmployee();
        instance.reporteEmpleados();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateTable method, of class queryEmpleados.
     */
    @Test
    public void testUpdateTable() {
        System.out.println("UpdateTable");
        QueryEmployee instance = new QueryEmployee();
        instance.UpdateTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarTabla method, of class queryEmpleados.
     */
    @Test
    public void testActualizarTabla() {
        System.out.println("actualizarTabla");
        QueryEmployee instance = new QueryEmployee();
        instance.actualizarTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validadorDeCedula method, of class queryEmpleados.
     */
    @Test
    public void testValidadorDeCedula() {
        System.out.println("validadorDeCedula");
        String cedula = "";
        int opcion = 0;
        QueryEmployee instance = new QueryEmployee();
        boolean expResult = false;
        boolean result = instance.validadorDeCedula(cedula, opcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarDocumento method, of class queryEmpleados.
     */
    @Test
    public void testValidarDocumento() {
        System.out.println("validarDocumento");
        JTextField numero = null;
        QueryEmployee instance = new QueryEmployee();
        boolean expResult = false;
        boolean result = instance.validarDocumento(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
