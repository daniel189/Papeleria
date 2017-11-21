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
     * Test of claveMax method, of class Datos.
     */
    @Test
    public void testClaveMax() {
        System.out.println("claveMax");
        Datos instance = new Datos();
        instance.claveMax();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hint method, of class Datos.
     */
    @Test
    public void testHint() {
        System.out.println("Hint");
        Datos instance = new Datos();
        instance.Hint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCamposVacios method, of class Datos.
     */
    @Test
    public void testValidarCamposVacios() {
        System.out.println("validarCamposVacios");
        Datos instance = new Datos();
        instance.validarCamposVacios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Llenar method, of class Datos.
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
        Datos instance = new Datos();
        instance.Llenar(cod, idt, rsocial, telf, contacto, tcontc, direcc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Desabilitar method, of class Datos.
     */
    @Test
    public void testDesabilitar() {
        System.out.println("Desabilitar");
        Datos instance = new Datos();
        instance.Desabilitar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class Datos.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        Datos instance = new Datos();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Datos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Datos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpcion method, of class Datos.
     */
    @Test
    public void testGetOpcion() {
        System.out.println("getOpcion");
        Datos instance = new Datos();
        int expResult = 0;
        int result = instance.getOpcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpcion method, of class Datos.
     */
    @Test
    public void testSetOpcion() {
        System.out.println("setOpcion");
        int opcion = 0;
        Datos instance = new Datos();
        instance.setOpcion(opcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCod method, of class Datos.
     */
    @Test
    public void testGetCod() {
        System.out.println("getCod");
        Datos instance = new Datos();
        String expResult = "";
        String result = instance.getCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCod method, of class Datos.
     */
    @Test
    public void testSetCod() {
        System.out.println("setCod");
        String cod = "";
        Datos instance = new Datos();
        instance.setCod(cod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdt method, of class Datos.
     */
    @Test
    public void testGetIdt() {
        System.out.println("getIdt");
        Datos instance = new Datos();
        String expResult = "";
        String result = instance.getIdt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdt method, of class Datos.
     */
    @Test
    public void testSetIdt() {
        System.out.println("setIdt");
        String idt = "";
        Datos instance = new Datos();
        instance.setIdt(idt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRsocial method, of class Datos.
     */
    @Test
    public void testGetRsocial() {
        System.out.println("getRsocial");
        Datos instance = new Datos();
        String expResult = "";
        String result = instance.getRsocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRsocial method, of class Datos.
     */
    @Test
    public void testSetRsocial() {
        System.out.println("setRsocial");
        String rsocial = "";
        Datos instance = new Datos();
        instance.setRsocial(rsocial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelf method, of class Datos.
     */
    @Test
    public void testGetTelf() {
        System.out.println("getTelf");
        Datos instance = new Datos();
        String expResult = "";
        String result = instance.getTelf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelf method, of class Datos.
     */
    @Test
    public void testSetTelf() {
        System.out.println("setTelf");
        String telf = "";
        Datos instance = new Datos();
        instance.setTelf(telf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContacto method, of class Datos.
     */
    @Test
    public void testGetContacto() {
        System.out.println("getContacto");
        Datos instance = new Datos();
        String expResult = "";
        String result = instance.getContacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContacto method, of class Datos.
     */
    @Test
    public void testSetContacto() {
        System.out.println("setContacto");
        String contacto = "";
        Datos instance = new Datos();
        instance.setContacto(contacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTcontc method, of class Datos.
     */
    @Test
    public void testGetTcontc() {
        System.out.println("getTcontc");
        Datos instance = new Datos();
        String expResult = "";
        String result = instance.getTcontc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTcontc method, of class Datos.
     */
    @Test
    public void testSetTcontc() {
        System.out.println("setTcontc");
        String tcontc = "";
        Datos instance = new Datos();
        instance.setTcontc(tcontc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirecc method, of class Datos.
     */
    @Test
    public void testGetDirecc() {
        System.out.println("getDirecc");
        Datos instance = new Datos();
        String expResult = "";
        String result = instance.getDirecc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirecc method, of class Datos.
     */
    @Test
    public void testSetDirecc() {
        System.out.println("setDirecc");
        String direcc = "";
        Datos instance = new Datos();
        instance.setDirecc(direcc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
