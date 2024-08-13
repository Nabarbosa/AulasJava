/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade13_uml;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
                
        Pessoa primeiraPessoa = new Pessoa(1234, "Marta da Silva", 36, "7198654795", "Silvamarta@gmail.com", Sexo.FEMININO, 
        new Endereco("Rua A", "11b", "Padaria", "1524789036", "A", UnidadeFederativa.RIO_DE_JANEIRO));
        
        System.out.println("\n1ª Pessoa-- ");
        System.out.println("Nome: " + primeiraPessoa.getNome());
        System.out.println("ID: " + primeiraPessoa.getId());
        System.out.println("Idade: " + primeiraPessoa.getIdade());
        System.out.println("Telefone: " + primeiraPessoa.getTelefone());
        System.out.println("E-mail: " + primeiraPessoa.getEmail());
        System.out.println("Sexo: " + primeiraPessoa.getSexo().getTexto());
        System.out.println("\nEndereço 1ª Pessoa--");
        System.out.println("Endereço: " + primeiraPessoa.getEndereco());
        System.out.println("Numero: " + primeiraPessoa.getEndereco().getNumero());
        System.out.println("Complemento: " + primeiraPessoa.getEndereco().getComplemento());
        System.out.println("CEP: " + primeiraPessoa.getEndereco().getCep());
        System.out.println("Cidade: " + primeiraPessoa.getEndereco().getCidade());
        System.out.println("UF: " + primeiraPessoa.getEndereco().getUf().getNome() + " " + primeiraPessoa.getEndereco().getUf().getSigla());
        

        
        
    }
}
