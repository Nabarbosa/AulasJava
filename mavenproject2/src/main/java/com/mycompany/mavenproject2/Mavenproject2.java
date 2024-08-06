/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author aluno.den
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        //Declaração de variáveis.
      String nomeUsuario = "Marta";
      int senha = 123;

      //Comparação de Strings e inteiros.
      boolean resultadoNome = nomeUsuario.equals("Marta");
      boolean resultadoSenha = (senha == 456);

      //Exibindo resultadoSenha
      System.out.println("O nome de usuário está correto? " + resultadoNome);
      System.out.println("A senha está correta? " + resultadoSenha);
    }
}
