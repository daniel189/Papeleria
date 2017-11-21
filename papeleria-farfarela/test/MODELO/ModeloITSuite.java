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
@Suite.SuiteClasses({MODELO.queryUsuariosIT.class, MODELO.ConexionIT.class, MODELO.CerrarConexionIT.class, MODELO.queryClienteIT.class, MODELO.queryFamiliaIT.class, MODELO.queryIvasIT.class, MODELO.queryProductosIT.class, MODELO.queryProveedoresIT.class, MODELO.queryEmpleadoIT.class, MODELO.queryArticulosIT.class, MODELO.queryFacturaIT.class})
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
