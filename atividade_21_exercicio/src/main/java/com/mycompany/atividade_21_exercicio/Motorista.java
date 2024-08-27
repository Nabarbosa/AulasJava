/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_21_exercicio;

/**
 *
 * @author aluno.den
 */
public class Motorista extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "\nMotorista" +
                super.toString() +
                "Carteira De Habilitação: " + carteiraDeHabilitacao;
    }

    @Override
    public double getsalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario;
        salarioFinal += super.salario;
        return salarioFinal;
    }
    
}
