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

/**
 *
 * @author w8
 */
public class queryClienteIT {
    
    public queryClienteIT() {
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
     * Test of setCliente method, of class queryClientes.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        ArrayList<String> lista = null;
        queryCliente instance = new queryCliente();
        instance.setCliente(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarRegistro method, of class queryClientes.
     */
    @Test
    public void testEliminarRegistro() {
        System.out.println("EliminarRegistro");
        String iden = "";
        queryCliente instance = new queryCliente();
        instance.EliminarRegistro(iden);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCliente method, of class queryClientes.
     */
    @Test
    public void testUpdateCliente() {
        System.out.println("updateCliente");
        ArrayList<String> lista = null;
        queryCliente instance = new queryCliente();
        instance.updateCliente(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCliente method, of class queryClientes.
     */
    @Test
    public void testAgregarCliente() {
        System.out.println("agregarCliente");
        String cedula = "";
        String nombre = "";
        String apellido = "";
        queryCliente instance = new queryCliente();
        instance.agregarCliente(cedula, nombre, apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTodosClientes method, of class queryClientes.
     */
    @Test
    public void testListarTodosClientes() {
        System.out.println("listarTodosClientes");
        queryCliente instance = new queryCliente();
        instance.listarTodosClientes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarClientes method, of class queryClientes.
     */
    @Test
    public void testCargarClientes() {
        System.out.println("CargarClientes");
        queryCliente instance = new queryCliente();
        instance.CargarClientes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutarConsultaTodaTabla method, of class queryClientes.
     */
    @Test
    public void testEjecutarConsultaTodaTabla() {
        System.out.println("ejecutarConsultaTodaTabla");
        queryCliente instance = new queryCliente();
        instance.ejecutarConsultaTodaTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCliente method, of class queryClientes.
     */
    @Test
    public void testBuscarCliente() {
        System.out.println("buscarCliente");
        String parametroBusqueda = "";
        boolean buscarPorCedula = false;
        boolean buscarPorNombre = false;
        boolean buscarPorApellido = false;
        queryCliente instance = new queryCliente();
        instance.buscarCliente(parametroBusqueda, buscarPorCedula, buscarPorNombre, buscarPorApellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRegistroCedulaONombreOapellido method, of class queryClientes.
     */
    @Test
    public void testBuscarRegistroCedulaONombreOapellido() {
        System.out.println("buscarRegistroCedulaONombreOapellido");
        String parametroBusqueda = "";
        boolean buscarPorCedula = false;
        boolean buscarPorNombre = false;
        boolean buscarPorApellido = false;
        queryCliente instance = new queryCliente();
        instance.buscarRegistroCedulaONombreOapellido(parametroBusqueda, buscarPorCedula, buscarPorNombre, buscarPorApellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
