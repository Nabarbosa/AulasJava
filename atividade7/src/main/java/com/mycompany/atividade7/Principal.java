/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade7;


/**
 *
 * @author aluno.den
 */
public class Principal {
   

    public static void main(String[] args) {
        
        Processador processador = new Processador("Intel", "i5", "3.5");
        
        Memoria memoria = new Memoria("Corsair", "Fury Hypex 8G", 654);
        
        System.out.println("\nProcessador: ");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frequencia: " + processador.getFrequencia());
        
        System.out.println("\nMemoria: ");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Capacidade de armazenamento: " + memoria.getCapacidadeDeArmazenamento());
    }
}
