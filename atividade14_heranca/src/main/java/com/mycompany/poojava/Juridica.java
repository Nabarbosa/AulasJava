/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poojava;

/**
 *
 * @author aluno.den
 */
public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoAtual;

    public Juridica(String cnpj, String inscricaoAtual, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoAtual = inscricaoAtual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoAtual() {
        return inscricaoAtual;
    }

    public void setInscricaoAtual(String inscricaoAtual) {
        this.inscricaoAtual = inscricaoAtual;
    }

    @Override
    public String toString() {
        return "\nDados da Pessoa Juridica: " + "\nNome: " + super.nome + "\nTelefone: " + 
        super.telefone + "\nCNPJ: " + cnpj + "\nInscricao Atual: " + inscricaoAtual;
    }

    
}
