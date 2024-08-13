/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade8;

/**
 *
 * @author aluno.den
 */
public class Funcionario {
    private int id;
    private String nome;
    private double salario;
    private Setor setor;
    private Genero genero;
    private int idade;

    public Funcionario(int id, String nome, double salaro, Setor setor, Genero genero, int idade) {
        this.id = id;
        this.nome = nome;
        this.salario = salaro;
        this.setor = setor;
        this.genero = genero;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalaro() {
        return salario;
    }

    public void setSalaro(double salaro) {
        this.salario = salaro;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
    
}
