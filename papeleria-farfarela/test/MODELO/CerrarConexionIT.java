/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import MODEL.CloseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class CerrarConexionIT {
    
    public CerrarConexionIT() {
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
     * Test of CloseConnection method, of class CerrarConexiones.
     */
    @Test
    public void testCerrarConexiones() {
        System.out.println("metodoCerrarConexiones");
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        PreparedStatement ps = null;

        CloseConnection.CloseConnection(conexion, sentencia, resultado, ps);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
