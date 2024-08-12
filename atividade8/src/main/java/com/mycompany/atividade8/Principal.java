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
        
        Processador processador = new Processador(25.6, "Intel", "i5");
        Memoria memoria = new Memoria("8G", "15", "Ar", "20");
        PlacaMae placamae = new PlacaMae("sei lá", "De placa mesmo", "17");
        DispositivoDeArmazenamento armazenamento = new DispositivoDeArmazenamento("8G", "boa", "Qualquer", "16");
        
        System.out.println("\nProcessador: ");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frequência: " + processador.getFrequencia());
        
        System.out.println("\nMemoria: ");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Capacidade de armazenamento: " + memoria.getCapacidadeDeArmazenamento());
        System.out.println("frequência: " + memoria.getFrequencia());
        
        System.out.println("\nPlaca mãe: ");
        System.out.println("Marca: " + placamae.getMarca());
        System.out.println("Modelo: " + placamae.getModelo());
        System.out.println("Soquete: " + placamae.getSoquete());
        
        System.out.println("\nDispositivo de armazenamento: ");
        System.out.println("Marca: " + armazenamento.getMarca());
        System.out.println("Modelo: " + armazenamento.getModelo());
        System.out.println("Capacidade de armazenamento: " + armazenamento.getCapacidadeDeArmazenamento());
        System.out.println("Tipo de Conexão: " + armazenamento.getTipoDeConexao());
    }
}
