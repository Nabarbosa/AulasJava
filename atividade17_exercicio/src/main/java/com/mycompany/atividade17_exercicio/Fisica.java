/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade16_exercicio;

/**
 *
 * @author aluno.den
 */
public abstract class Fisica extends Pessoa{
    protected Sexo sexo;
    protected EstadoCivil estadoCivil;
    protected String dataDeNascimento;

    public Fisica(Sexo sexo, EstadoCivil estadoCivil, String dataDeNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String toStringFisica() {
        return "\n== Dados de Pessoa Fisica ==" + 
                "\nSexo: " + sexo.gettexto()+ 
                "\nEstado Civil: " + estadoCivil.getEstadoCivil() + 
                "\nData de Nascimento: " + dataDeNascimento;
    }

    
}
