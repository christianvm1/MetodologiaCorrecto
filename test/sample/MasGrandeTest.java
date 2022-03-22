/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of max method, of class MasGrande.
     */
    @Test
    public void testMaxOrdenado() {
        System.out.println("testMaxOrdenado");
        int[] a = {3, 4, 5};
        
        assertEquals(5, MasGrande.max(a));
    }
    
    @Test
    public void testMaxDesordenado() {
        System.out.println("testMaxDesordenado");
        int[] b = {4, 3, 5};

        assertEquals(5, MasGrande.max(b));
    }
    
    @Test
    public void testMaxUno() {
        System.out.println("testMaxUno");
        int[] c = {3};

        assertEquals(3, MasGrande.max(c));
    }
    
    @Test
    public void testMaxNegativo() {
        System.out.println("testMaxNegativo");
        int[] d = {-1, -2, -3};

        assertEquals(-1, MasGrande.max(d));
    }
    
    @Test
    public void testMaxVacio() {
        System.out.println("testMaxVacio");
        int[] e = {};

        assertEquals(0, MasGrande.max(e));
    }
    
    @Test
    public void testMaxNull() {
        System.out.println("testMaxNull");
        int[] f = null;
        
        assertEquals(0, MasGrande.max(f));
    }
    
}
