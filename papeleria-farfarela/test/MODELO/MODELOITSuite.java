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
@Suite.SuiteClasses({MODELO.queryUsuariosIT.class, MODELO.ConexionIT.class, MODELO.CerrarConexionesIT.class, MODELO.queryClientesIT.class, MODELO.queryFamiliasIT.class, MODELO.queryIvasIT.class, MODELO.queryProductosIT.class, MODELO.queryProveedoresIT.class, MODELO.queryEmpleadosIT.class, MODELO.queryArticulosIT.class, MODELO.queryFacturasIT.class})
public class MODELOITSuite {

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
