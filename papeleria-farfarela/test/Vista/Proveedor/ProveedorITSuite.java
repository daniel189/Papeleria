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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author w8
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Vista.Proveedor.Datos1IT.class, Vista.Proveedor.DatosIT.class, Vista.Proveedor.ProveedorPrincipalIT.class, Vista.Proveedor.ProveedorPrincipal1IT.class, Vista.Proveedor.NewJFrameIT.class})
public class ProveedorITSuite {

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
