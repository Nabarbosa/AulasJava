/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_20_interface;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();
        
        System.out.println("- Cachorro: ");
        System.out.println("Alimentacao: " + cachorro.comer());
        System.out.println("Som: " + cachorro.emitirSom());
        
        System.out.println("\n- Gato: ");
        System.out.println("Alimentacao: " + gato.comer());
        System.out.println("Som: " + gato.emitirSom());
         
        System.out.println("\n- Galo: ");
        System.out.println("Alimentacao: " + galo.comer());
        System.out.println("Som: " + galo.emitirSom());
        
        System.out.println("\n- Pato: ");
        System.out.println("Alimentacao: " + pato.comer());
        System.out.println("Som: " + pato.emitirSom());
        
        
        
    }
}
