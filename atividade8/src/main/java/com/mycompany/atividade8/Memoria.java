/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade8;

/**
 *
 * @author aluno.den
 */
public class Memoria extends Produto{
    
    private String capacidadeDeArmazenamento;
    private String frequencia;

    public Memoria(String capacidadeDeArmazenamento, String frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.frequencia = frequencia;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
    
}
