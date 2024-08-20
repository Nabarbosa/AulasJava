/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade16_exercicio;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Cliente primeiraPessoa = new Cliente("123", Sexo.MASCULINO, EstadoCivil.CASADO, "15/03/1990", "José", "71 97894-1234", "Jose@gmail.com",
                new Endereco("Rua A", "50", "N/D", "450.789.365", "Cidade A", UnidadeFederativa.BAHIA));
        
        PrestacaoDeServicos segundaPessoa = new PrestacaoDeServicos("15/10/1980", "15/10/2030", "123.456.78", "123", "Amanda", "71 95648-1478",
                "Amanda@gmail.com", new Endereco("Rua B", "56", "N/D", "850.458.698", "Cidade B", UnidadeFederativa.SAO_PAULO));
        
        System.out.println(" == Pessoa Fisica ==");
        System.out.println(primeiraPessoa.toString());
        
        System.out.println("\n == Pessoa Juridica ==\n");
        System.out.println(segundaPessoa.toString());
    }
}
