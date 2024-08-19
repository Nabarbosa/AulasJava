/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poojava;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Fisica primeiraPessoaFisica = new Fisica("444", "256", "20/04/1966", "José", "7195565456");
        Juridica primeiraPessoaJuridica = new Juridica("1145.562", "1452", "Camila", "719123456789");
        
        /*System.out.println("\n -Pessoa Fisica");
        System.out.println("Nome: " + primeiraPessoaFisica.getNome() + "\nData de nascimento: " + primeiraPessoaFisica.getDataDeNascimento()
        + "\nCPF: " + primeiraPessoaFisica.getCpf() + "\nRG: " + primeiraPessoaFisica.getRg() + "\nTelefone: " + primeiraPessoaFisica.getTelefone());
        
        System.out.println("\n -Pessoa Juridica");
        System.out.println("Nome: " + primeiraPessoaJuridica.getNome() + "\nTelefone: " + primeiraPessoaJuridica.getTelefone()
        + "\nCNPJ: " + primeiraPessoaJuridica.getCnpj() + "\nInscricao Atual: " + primeiraPessoaJuridica.getInscricaoAtual());*/
        
        System.out.println(primeiraPessoaFisica);
        System.out.println(primeiraPessoaJuridica);
    }
}
