/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade9;

/**
 *
 * @author aluno.den
 */
public class Clientes extends Produto{
    
    private Pets pet;

    public Clientes(Pets pet, String nome, int idade) {
        super(nome, idade);
        this.pet = pet;
    }

    public Pets getPet() {
        return pet;
    }

    public void setPet(Pets pet) {
        this.pet = pet;
    }
    
}
