/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade8;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario(1001, "Carla Andrade", 1.200, Setor.MARKETING, Genero.FEMININO, 22);
        
        System.out.println("\nPrimeiro funcionario --");
        System.out.println("ID: " + funcionario.getId() + "\nNome: " + funcionario.getNome() + "\nSexo: "
        + funcionario.getGenero() + "\nIdade: " + funcionario.getIdade());
        System.out.println("\nFunção --");
        System.out.println("Setor: " + funcionario.getSetor() + "\nSalário: " + funcionario.getSalaro());
    }
}
