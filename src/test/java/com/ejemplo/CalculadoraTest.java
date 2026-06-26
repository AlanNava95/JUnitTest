package com.ejemplo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void sumarDosNumeros() {
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    void sumarConCero() {
        assertEquals(7, calculadora.sumar(7, 0));
    }

    @Test
    void restarDosNumeros() {
        assertEquals(2, calculadora.restar(5, 3));
    }
}
