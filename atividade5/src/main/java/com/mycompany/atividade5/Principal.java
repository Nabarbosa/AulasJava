/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade5;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        
        Clientes cliente = new Clientes("Maria", 25, "633.561.789.10", "Rua Ruy Barbosa", "+55 71 91234-1456");
        Veiculos veiculos = new Veiculos("789 b4 152", "Prata", 5, 80.0, 240.0, "15");
        
        System.out.println("\nDados do Cliente");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());
        
        System.out.println("\nDados do Veículo");
        System.out.println("Placa: " + veiculos.getPlaca());
        System.out.println("Cor: " + veiculos.getCor());
        System.out.println("Número de Passageiros: " + veiculos.getNumeroPassageiros());
        System.out.println("Capacidade do Tanque: " + veiculos.getCapacidadeTaque() + " Litros");
        System.out.println("Velocidade Máxima: " + veiculos.getVelocidadeMaxima() + "KM");
        System.out.println("Consumo Médio: " + veiculos.getConsumoMedio() + " Litros por KM");
        
    }
}
