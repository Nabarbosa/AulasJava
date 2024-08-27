/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_19_interface;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        
        System.out.println("Soma:");
        System.out.println(soma.calcular(10, 10));
        
        System.out.println("\nSubtracao:");
        System.out.println(sub.calcular(10, 5));
        
        System.out.println("\nDivisao:");
        System.out.println(divisao.calcular(10, 2));
        
        System.out.println("\nMultiplicacao:");
        System.out.println(multiplicacao.calcular(2, 10));
    }
}
