/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade12_enum;

/**
 *
 * @author aluno.den
 */
public class Clientes {
    private String nome;
    private Sexo sexo;

    public Clientes(String nome, Sexo sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }
}
