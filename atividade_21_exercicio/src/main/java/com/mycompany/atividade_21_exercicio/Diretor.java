/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_21_exercicio;

/**
 *
 * @author aluno.den
 */
public class Diretor extends CargoConfianca implements Contratacao{
    public final double PREMIO = 0.5;
    
    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }
    
    
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir Funcionario");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir Funcionario");
    }

    @Override
    public String toString() {
        return "\nDiretor:" + 
                "\nPremio: " + PREMIO;
    }

    @Override
    public double getsalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario * super.bonificacao.DIRETOR.getValor();
        salarioFinal = super.salario * PREMIO;
        salarioFinal += super.salario;
        return salarioFinal;
    }
    
}
