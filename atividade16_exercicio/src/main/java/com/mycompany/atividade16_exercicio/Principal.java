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
        Fisica primeiraPessoaFisica = new Fisica(Sexo.FEMININO, "121.366.477.52", "1234.68", "14/03/2000", 1250.00, 1456, "Eduarda", "7196523-1488",
        new Endereco("Rua A", "15", "N/A", "455.896.236", "Cidade B", UnidadeFederativa.BAHIA));
        
        Juridica primeiraPessoaJuridica = new Juridica("254.789.36", "123", "20/01/2023", "20/01/2050", 20000.00, 1203, "José", "7197845-2563",
        new Endereco("Rua C ", "20", "N/A", "20.356.328", "Cidade D", UnidadeFederativa.SAO_PAULO));
        
        System.out.println(primeiraPessoaFisica.toString());
        
        System.out.println(primeiraPessoaJuridica.toString());
    }
}
