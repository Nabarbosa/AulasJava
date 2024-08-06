/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animais;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Pets primeiroPet = new Pets("Spaike", 4, "Labrador", "Grande", "Ração");
        Pets segundoPet = new Pets("Bella", 9, "SRD", "Médio", "Comida de gente");
        
        System.out.println("\nDados do pet: ");
        System.out.println("Nome do Pet: " + primeiroPet.getNome());
        System.out.println("Idade do Pet: " + primeiroPet.getIdade());
        System.out.println("Raça do Pet: " + primeiroPet.getRaca());
        System.out.println("Porte do Pet: " + primeiroPet.getPorte());
        System.out.println("Alimentação do Pet: " + primeiroPet.getAlimentacao());
        
        System.out.println("\nDados do pet");
        System.out.println("Nome do Pet: " + segundoPet.getNome());
        System.out.println("Idade do Pet: " + segundoPet.getIdade());
        System.out.println("Raça do Pet: " + segundoPet.getRaca());
        System.out.println("Porte do Pet: " + segundoPet.getPorte());
        System.out.println("Alimentação do Pet: " + segundoPet.getAlimentacao());
    }
}
