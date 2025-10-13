package br.com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testSomar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2 , 3);
        System.out.println(resultado);
        assertEquals(5, resultado);
    }
}
