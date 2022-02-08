package com.example.testbasico;

import junit.framework.TestCase;

import org.junit.Test;

public class OperacionesTest extends TestCase {
    private Operaciones operaciones;

    public void setUp() throws Exception {
        operaciones = new Operaciones();
    }


    public void testcarga(){
        assertNotNull(operaciones);
    }

    public void testSuma() {
        assertEquals("4",operaciones.suma("2", "2"));
        assertEquals("8",operaciones.suma("6", "2"));
        assertEquals("10",operaciones.suma("8", "2"));
    }

    public void testResta() {
        assertEquals("5", operaciones.resta("10","5"));
    }
}