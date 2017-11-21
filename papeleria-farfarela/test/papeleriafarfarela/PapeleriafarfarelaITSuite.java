/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleriafarfarela;

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
@Suite.SuiteClasses({papeleriafarfarela.ClienteIT.class, papeleriafarfarela.CuentaIT.class, papeleriafarfarela.EmpleadoIT.class, papeleriafarfarela.PapeleriaFarfarelaIT.class, papeleriafarfarela.DetalleIT.class, papeleriafarfarela.ProveedorIT.class, papeleriafarfarela.IvaIT.class, papeleriafarfarela.FechaivaIT.class, papeleriafarfarela.ArticulosIT.class, papeleriafarfarela.FamiliaIT.class, papeleriafarfarela.FacturasIT.class})
public class PapeleriafarfarelaITSuite {

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
