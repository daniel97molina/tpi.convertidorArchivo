/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi.practica.leedorArchivo;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danm
 */
public class leedorArchivoTest {
    
    public leedorArchivoTest() {
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
     * Test of validarPath method, of class leedorArchivo.
     */
    @Test
    public void testValidarPath() {
        System.out.println("validarPath");
        String path = "";
        leedorArchivo instance = new leedorArchivo();
        File expResult = null;
        File result = instance.validarPath(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirArchivo method, of class leedorArchivo.
     */
    @Test
    public void testConvertirArchivo() {
        System.out.println("convertirArchivo");
        String path = "";
        leedorArchivo instance = new leedorArchivo();
        String expResult = "";
        String result = instance.convertirArchivo(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
