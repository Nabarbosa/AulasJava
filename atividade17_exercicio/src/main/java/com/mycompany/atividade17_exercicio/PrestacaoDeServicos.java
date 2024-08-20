/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade16_exercicio;

/**
 *
 * @author aluno.den
 */
public class PrestacaoDeServicos extends Juridica{
    private String contratoInicio;
    private String contraFim;

    public PrestacaoDeServicos(String contratoInicio, String contraFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contraFim = contraFim;
    }

    public String getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(String contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public String getContraFim() {
        return contraFim;
    }

    public void setContraFim(String contraFim) {
        this.contraFim = contraFim;
    }

    @Override
    public String toString() {
        return "\n== Prestação de Serviços == " + 
                "\nInicio do Contrato: " + contratoInicio + 
                "\nFim do Contrato: " + contraFim +
                "\n" +
                super.toStringJuridica() +
                "\n" +
                super.toString();
        
    }
    
}
