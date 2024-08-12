/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade6;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        
        ContaBancaria contaDoFuncionario = new ContaBancaria("Itau", 02133, 001, "CC", 50.000, 260.000);
        
        Funcionario pessoa = new Funcionario(25.25, "Maria Carvalho", "Rua A", "+55 71 95564455", "CarvalhoMaria@gmail.com", contaDoFuncionario);
        
        Funcionario pessoa2 = new Funcionario(1235.6, "José Almeida", "Rua B", "71 966662222", "AlmeidaJose@gmail.com",
        new ContaBancaria("Bradesco", 00001, 23564, "CC", 5634.000, 10.0000));
        
        System.out.println("\nDados do Funcionário");
        System.out.println("Código do funcionário: " + pessoa.getCodigoDoFuncionario());
        System.out.println("Nome do funcionário: " + pessoa.getNome());
        System.out.println("Endereço do funcionário: " + pessoa.getEndereco());
        System.out.println("Telefone do funcionário: " + pessoa.getTelefone());
        System.out.println("E-mail do funcionário: " + pessoa.getEmail());
        System.out.println("Conta Bancaria do funcionário: " + pessoa.getContaBanco().getBanco());
        System.out.println("Agência do funcionário: " + pessoa.getContaBanco().getAgencia());
         
        System.out.println("\nDados do Segundo Funcionário");
        System.out.println("Código do funcionário: " + pessoa2.getCodigoDoFuncionario());
        System.out.println("Nome do funcionário: " + pessoa2.getNome());
        System.out.println("Endereço do funcionário: " + pessoa2.getEndereco());
        System.out.println("Telefone do funcionário: " + pessoa2.getTelefone());
        System.out.println("E-mail do funcionário: " + pessoa2.getEmail());
        System.out.println("Conta Bancaria do funcionário: " + pessoa2.getContaBanco().getBanco());
        System.out.println("Agência do funcionário: " + pessoa2.getContaBanco().getAgencia());
        
    }
}
