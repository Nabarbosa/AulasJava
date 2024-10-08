/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade16_exercicio;

/**
 *
 * @author aluno.den
 */
public class Cliente extends Fisica{
    private String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Sexo sexo, EstadoCivil estadoCivil, String dataDeNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadoCivil, dataDeNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\n== Protocolo de Atendimento == " + 
                "\n" +
                "\nProtocolo de Atendimento: " + protocoloAtendimento +
                "\n" +
                super.toStringFisica() +
                "\n" +
                super.toString();
    }
    
}
