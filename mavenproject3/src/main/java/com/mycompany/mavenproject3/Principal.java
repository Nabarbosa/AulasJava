/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        //Instanciando um objeto.
        Clientes cliente =  new Clientes("Marta", 20); // Utilizando o construtor.
        Funcionarios funcionario = new Funcionarios("José", "Gerente", 5000);
        
        //cliente.nome = "Marta"; - Não se utiliza.
        //cliente.idade = 18;
        
        //Inserir valores
        //*Atualização de informações.
        //cliente.setNome("Marta");
        //cliente.setIdade(18);
        
        //Dados cliente
        System.out.println("\nDados do cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        
        //Dados funcionário
        System.out.println("\nDados do funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Função: " + funcionario.getFuncao());
        System.out.println("Salário: " + funcionario.getSalario());
        
    }
}
