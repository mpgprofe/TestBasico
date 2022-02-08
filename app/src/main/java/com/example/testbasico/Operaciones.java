package com.example.testbasico;

public class Operaciones {
    public String suma(String op1, String op2) {
        int resultado = Integer.parseInt(op1) + Integer.parseInt(op2);
        return String.valueOf(resultado);
    }

    public String resta(String op1, String op2) {
        int resultado = Integer.parseInt(op1) - Integer.parseInt(op2);
        return String.valueOf(resultado);
    }
}
