/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade16_exercicio;

/**
 *
 * @author aluno.den
 */
public abstract class Juridica extends Pessoa{
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String toStringJuridica() {
        return "\n== Dados de Pessoa Juridica ==" + 
                "\nCNPJ: " + cnpj + 
                "\nInscrição Estadual: " + inscricaoEstadual;
    }
    
    
       
}
