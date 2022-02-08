package com.example.testbasico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacionesTest2 {
    private Operaciones operaciones;
    @Before
    public void setUp() throws Exception {
        operaciones = new Operaciones();
    }

    @Test
    public void suma() {
        assertEquals("4",operaciones.suma("2", "2"));
        assertEquals("8",operaciones.suma("6", "2"));
        assertEquals("10",operaciones.suma("8", "2"));
    }

    @Test
    public void resta() {
        assertEquals("5", operaciones.resta("10", "5"));

    }
    @Test
    public void creacionObjeto(){
        assertNotNull(operaciones);
    }
}