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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author w8
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MODELO.queryUsuarioIT.class, MODELO.ConexionIT.class, MODELO.CerrarConexionIT.class, MODELO.queryClienteIT.class, MODELO.queryFamiliaIT.class, MODELO.queryIvaIT.class, MODELO.queryProductoIT.class, MODELO.queryProveedorIT.class, MODELO.queryEmpleadoIT.class, MODELO.queryArticuloIT.class, MODELO.queryFacturaIT.class})
public class ModeloITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
