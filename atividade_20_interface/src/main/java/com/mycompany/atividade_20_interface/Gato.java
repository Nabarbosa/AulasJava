/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_20_interface;

/**
 *
 * @author aluno.den
 */
public class Gato implements Animal{

    @Override
    public String emitirSom() {
        return "Miau!";
    }

    @Override
    public String comer() {
        return "Peixe e carne";
    }
    
}
