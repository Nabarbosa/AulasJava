package br.com.example.demo;

public class ValidadorSenha {
    
    public boolean validar(String senha) {
        if(senha == null) return false;
        return senha.length() >= 8 &&
                senha.matches(".*[A-Z].*") &&
                senha.matches(".*\\d.*");
    }
}
