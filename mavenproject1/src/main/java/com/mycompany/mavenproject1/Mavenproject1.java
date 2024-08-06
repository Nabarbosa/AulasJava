/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author aluno.den
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silveira";
        
        //Exibindo quantidade de caracteres.
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        //Concatenando nome + sobrenome.
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        //Exibindo nome completo usando métodos Strings - Maiúsculas.
        System.out.println("Concatenação Maiúsculas: " + nomeCompleto.toUpperCase());
        
        //Exibindo nome completo usando métodos Strings - Minúsculas.
        System.out.println("concatenação Minúsculas: " + nomeCompleto.toLowerCase());
    }
}
