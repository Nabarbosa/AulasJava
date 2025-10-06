package br.com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UsusarioTest {
    @Test
    public void testCriarUsuarioValido() {
        Usuario u = new Usuario("Tainá");
        assertEquals("Tainá", u.getNome());
    }

    @Test
    public void testCriarUsuarioNomeInvalido() {
        Exception e = assertThrows(IllegalArgumentException.class,
            () -> new Usuario(""));
        assertEquals("Nome inválido", e.getMessage());
    }
}
