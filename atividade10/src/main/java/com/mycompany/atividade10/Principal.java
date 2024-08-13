/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade10;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        
        Clientes primeiroCliente = new Clientes("Marta", Sexo.FEMININO);
        Clientes segundoCliente = new Clientes("José", Sexo.MASCULINO);
        Clientes terceiroCliente = new Clientes("Amanda", Sexo.FEMININO);
        
        System.out.println("\n1º Cliente: ");
        System.out.println("Nome do Cliente: " + primeiroCliente.getNome()+"\nSexo: " + primeiroCliente.getSexo());
        
        System.out.println("\n2º Cliente: ");
        System.out.println("Nome do Cliente: " + segundoCliente.getNome()+"\nSexo: " + segundoCliente.getSexo());
        
        System.out.println("\n3º Cliente: ");
        System.out.println("Nome do Cliente: " + terceiroCliente.getNome()+"\nSexo: " + terceiroCliente.getSexo());
    }
}
