/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade9;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        
        Pets pet = new Pets("Pastor Alemão", "Apollo", 4);
        
        Clientes cliente = new Clientes(pet, "José", 55);
        
        Clientes cliente2 = new Clientes(new Pets("Chiaua", "Lulu", 9), "Marta", 70);
        
        System.out.println("\nDados do cliente: ");
        System.out.println("Nome do tutor: " + cliente.getNome());
        System.out.println("Idade do tutor: " + cliente.getIdade());
        System.out.println("\nDados do Pet -- ");
        System.out.println("Pet do tutor: " + cliente.getPet().getNome());
        System.out.println("Raça do pet: " + cliente.getPet().getRaca());
        System.out.println("Idade do pet: " + cliente.getPet().getIdade());
        
        System.out.println("\nSegundo Cliente --");
        
        System.out.println("\nDados do cliente: ");
        System.out.println("Nome do tutor: " + cliente2.getNome());
        System.out.println("Idade do tutor: " + cliente2.getIdade());
        System.out.println("\nDados do Pet -- ");
        System.out.println("Pet do tutor: " + cliente2.getPet().getNome());
        System.out.println("Raça do pet: " + cliente2.getPet().getRaca());
        System.out.println("Idade do pet: " + cliente2.getPet().getIdade());
    }
}
