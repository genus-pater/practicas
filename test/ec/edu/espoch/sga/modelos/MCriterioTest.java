/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.sga.modelos;

import ec.edu.espoch.sga.accesodatos.ConjuntoResultado;
import ec.edu.espoch.sga.entidades.CCriterio;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eborja
 */
public class MCriterioTest {
    
    public MCriterioTest() {
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
     * Test of insertarCriterio method, of class MCriterio.
     */
    @Test
    public void testInsertarCriterio() throws Exception {
        System.out.println("insertarCriterio");
        CCriterio objCriterio = null;
        boolean expResult = false;
        boolean result = MCriterio.insertarCriterio(objCriterio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarCriterio method, of class MCriterio.
     */
    @Test
    public void testActualizarCriterio() throws Exception {
        System.out.println("actualizarCriterio");
        CCriterio objCriterio = null;
        Boolean expResult = null;
        Boolean result = MCriterio.actualizarCriterio(objCriterio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCriterio method, of class MCriterio.
     */
    @Test
    public void testObtenerCriterio() throws Exception {
        System.out.println("obtenerCriterio");
        ArrayList<CCriterio> expResult = null;
        ArrayList<CCriterio> result = MCriterio.obtenerCriterio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llenarCriterio method, of class MCriterio.
     */
    @Test
    public void testLlenarCriterio() throws Exception {
        System.out.println("llenarCriterio");
        ConjuntoResultado conResultado = null;
        ArrayList<CCriterio> expResult = null;
        ArrayList<CCriterio> result = MCriterio.llenarCriterio(conResultado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
