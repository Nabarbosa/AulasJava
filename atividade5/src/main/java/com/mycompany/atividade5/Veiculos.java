/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;

/**
 *
 * @author aluno.den
 */
public class Veiculos {
    
    //Declarando variáveis.
    private String placa;
    private String cor;
    private int numeroPassageiros;
    private double capacidadeTaque;
    private double velocidadeMaxima;
    private String consumoMedio;

    public Veiculos(String placa, String cor, int numeroPassageiros, double capacidadeTaque, double velocidadeMaxima, String consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTaque = capacidadeTaque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(String consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getCapacidadeTaque() {
        return capacidadeTaque;
    }

    public void setCapacidadeTaque(double capacidadeTaque) {
        this.capacidadeTaque = capacidadeTaque;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    
    
}
