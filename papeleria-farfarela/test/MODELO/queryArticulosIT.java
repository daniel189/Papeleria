/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import papeleriafarfarela.Articulos;

/**
 *
 * @author w8
 */
public class queryArticulosIT {
    
    public queryArticulosIT() {
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
     * Test of cargarprovedores method, of class queryArticulos.
     */
    @Test
    public void testCargarprovedores() {
        System.out.println("cargarprovedores");
        queryArticulo instance = new queryArticulo();
        JComboBox expResult = null;
        JComboBox result = instance.cargarprovedores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarfamilias method, of class queryArticulos.
     */
    @Test
    public void testCargarfamilias() {
        System.out.println("cargarfamilias");
        queryArticulo instance = new queryArticulo();
        JComboBox expResult = null;
        JComboBox result = instance.cargarfamilias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignarprovedor method, of class queryArticulos.
     */
    @Test
    public void testAsignarprovedor() {
        System.out.println("asignarprovedor");
        String nombre = "";
        queryArticulo instance = new queryArticulo();
        int expResult = 0;
        int result = instance.asignarprovedor(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignarfamilia method, of class queryArticulos.
     */
    @Test
    public void testAsignarfamilia() {
        System.out.println("asignarfamilia");
        String nombre = "";
        queryArticulo instance = new queryArticulo();
        int expResult = 0;
        int result = instance.asignarfamilia(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArticulo method, of class queryArticulos.
     */
    @Test
    public void testSetArticulo() {
        System.out.println("setArticulo");
        Articulos art = null;
        int id_familia = 0;
        int id_provedor = 0;
        queryArticulo instance = new queryArticulo();
        boolean expResult = false;
        boolean result = instance.setArticulo(art, id_familia, id_provedor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateArticulo method, of class queryArticulos.
     */
    @Test
    public void testUpdateArticulo() {
        System.out.println("UpdateArticulo");
        String texto = "";
        int item = 0;
        queryArticulo instance = new queryArticulo();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.UpdateArticulo(texto, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarArticulo method, of class queryArticulos.
     */
    @Test
    public void testModificarArticulo() {
        System.out.println("modificarArticulo");
        int art_id = 0;
        int pro_id = 0;
        int fam_id = 0;
        String art_nombre = "";
        String art_descripcion = "";
        float art_precio = 0.0F;
        int stock = 0;
        queryArticulo instance = new queryArticulo();
        instance.modificarArticulo(art_id, pro_id, fam_id, art_nombre, art_descripcion, art_precio, stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarProveedor method, of class queryArticulos.
     */
    @Test
    public void testEliminarProveedor() {
        System.out.println("eliminarProveedor");
        int code = 0;
        queryArticulo instance = new queryArticulo();
        instance.eliminarProveedor(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarArticulos method, of class queryArticulos.
     */
    @Test
    public void testCargarArticulos() {
        System.out.println("CargarArticulos");
        queryArticulo instance = new queryArticulo();
        instance.CargarArticulos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutarConsultaTodaTabla method, of class queryArticulos.
     */
    @Test
    public void testEjecutarConsultaTodaTabla() {
        System.out.println("ejecutarConsultaTodaTabla");
        queryArticulo instance = new queryArticulo();
        instance.ejecutarConsultaTodaTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarArticulosparaVentas method, of class queryArticulos.
     */
    @Test
    public void testBuscarArticulosparaVentas() {
        System.out.println("buscarArticulosparaVentas");
        String parametroBusqueda = "";
        queryArticulo instance = new queryArticulo();
        instance.buscarArticulosparaVentas(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRegistroArticulos method, of class queryArticulos.
     */
    @Test
    public void testBuscarRegistroArticulos() {
        System.out.println("buscarRegistroArticulos");
        String parametroBusqueda = "";
        queryArticulo instance = new queryArticulo();
        instance.buscarRegistroArticulos(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
