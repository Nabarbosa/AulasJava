/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.atividade16_exercicio;

/**
 *
 * @author aluno.den
 */
public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORSIADO("Divorciado"),
    VIUVO("Viuvo");
    
    private String estadoCivil;

    private EstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
   
}   
