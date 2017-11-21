/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Proveedor;

import VistaProveedor.DatosProveedor;
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
public class DatosIT {
    
    public DatosIT() {
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
     * Test of claveMax method, of class DatosProveedor.
     */
    @Test
    public void testClaveMax() {
        System.out.println("claveMax");
        DatosProveedor instance = new DatosProveedor();
        instance.claveMax();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hint method, of class DatosProveedor.
     */
    @Test
    public void testHint() {
        System.out.println("Hint");
        DatosProveedor instance = new DatosProveedor();
        instance.Hint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCamposVacios method, of class DatosProveedor.
     */
    @Test
    public void testValidarCamposVacios() {
        System.out.println("validarCamposVacios");
        DatosProveedor instance = new DatosProveedor();
        instance.validarCamposVacios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Llenar method, of class DatosProveedor.
     */
    @Test
    public void testLlenar() {
        System.out.println("Llenar");
        String cod = "";
        String idt = "";
        String rsocial = "";
        String telf = "";
        String contacto = "";
        String tcontc = "";
        String direcc = "";
        DatosProveedor instance = new DatosProveedor();
        instance.Llenar(cod, idt, rsocial, telf, contacto, tcontc, direcc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Desabilitar method, of class DatosProveedor.
     */
    @Test
    public void testDesabilitar() {
        System.out.println("Desabilitar");
        DatosProveedor instance = new DatosProveedor();
        instance.Deshabilitar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class DatosProveedor.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        DatosProveedor instance = new DatosProveedor();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class DatosProveedor.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DatosProveedor.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpcion method, of class DatosProveedor.
     */
    @Test
    public void testGetOpcion() {
        System.out.println("getOpcion");
        DatosProveedor instance = new DatosProveedor();
        int expResult = 0;
        int result = instance.getOpcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpcion method, of class DatosProveedor.
     */
    @Test
    public void testSetOpcion() {
        System.out.println("setOpcion");
        int opcion = 0;
        DatosProveedor instance = new DatosProveedor();
        instance.setOpcion(opcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCod method, of class DatosProveedor.
     */
    @Test
    public void testGetCod() {
        System.out.println("getCod");
        DatosProveedor instance = new DatosProveedor();
        String expResult = "";
        String result = instance.getCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCod method, of class DatosProveedor.
     */
    @Test
    public void testSetCod() {
        System.out.println("setCod");
        String cod = "";
        DatosProveedor instance = new DatosProveedor();
        instance.setCod(cod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdt method, of class DatosProveedor.
     */
    @Test
    public void testGetIdt() {
        System.out.println("getIdt");
        DatosProveedor instance = new DatosProveedor();
        String expResult = "";
        String result = instance.getIdt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdt method, of class DatosProveedor.
     */
    @Test
    public void testSetIdt() {
        System.out.println("setIdt");
        String idt = "";
        DatosProveedor instance = new DatosProveedor();
        instance.setIdt(idt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRsocial method, of class DatosProveedor.
     */
    @Test
    public void testGetRsocial() {
        System.out.println("getRsocial");
        DatosProveedor instance = new DatosProveedor();
        String expResult = "";
        String result = instance.getRsocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRsocial method, of class DatosProveedor.
     */
    @Test
    public void testSetRsocial() {
        System.out.println("setRsocial");
        String rsocial = "";
        DatosProveedor instance = new DatosProveedor();
        instance.setRsocial(rsocial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelf method, of class DatosProveedor.
     */
    @Test
    public void testGetTelf() {
        System.out.println("getTelf");
        DatosProveedor instance = new DatosProveedor();
        String expResult = "";
        String result = instance.getTelf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelf method, of class DatosProveedor.
     */
    @Test
    public void testSetTelf() {
        System.out.println("setTelf");
        String telf = "";
        DatosProveedor instance = new DatosProveedor();
        instance.setTelf(telf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContacto method, of class DatosProveedor.
     */
    @Test
    public void testGetContacto() {
        System.out.println("getContacto");
        DatosProveedor instance = new DatosProveedor();
        String expResult = "";
        String result = instance.getContacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContacto method, of class DatosProveedor.
     */
    @Test
    public void testSetContacto() {
        System.out.println("setContacto");
        String contacto = "";
        DatosProveedor instance = new DatosProveedor();
        instance.setContacto(contacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTcontc method, of class DatosProveedor.
     */
    @Test
    public void testGetTcontc() {
        System.out.println("getTcontc");
        DatosProveedor instance = new DatosProveedor();
        String expResult = "";
        String result = instance.getTcontc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTcontc method, of class DatosProveedor.
     */
    @Test
    public void testSetTcontc() {
        System.out.println("setTcontc");
        String tcontc = "";
        DatosProveedor instance = new DatosProveedor();
        instance.setTcontc(tcontc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirecc method, of class DatosProveedor.
     */
    @Test
    public void testGetDirecc() {
        System.out.println("getDirecc");
        DatosProveedor instance = new DatosProveedor();
        String expResult = "";
        String result = instance.getDirecc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirecc method, of class DatosProveedor.
     */
    @Test
    public void testSetDirecc() {
        System.out.println("setDirecc");
        String direcc = "";
        DatosProveedor instance = new DatosProveedor();
        instance.setDirecc(direcc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
