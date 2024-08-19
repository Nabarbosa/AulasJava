/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade15_thisxsuper;

/**
 *
 * @author aluno.den
 */
public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    public String getCrea() {
        return crm;
    }

    public void setCrea(String crea) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nDados do Medico(a): " + 
               super.toString() + 
               "\nCRM: " + crm;
    }
   
}
