/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade15_thisxsuper;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Motoboy primeiraPessoa = new Motoboy("69958", "Ricardo", "25569932210", "1235689", 1.300);
        Engenheiro segundaPessoa = new Engenheiro("b152", "Gabriela", "1234567896", "1256789", 5.000);
        Medico terceiraPessoa = new Medico("568412", "Paula", "123456789", "123654997", 12.000);
        
        System.out.println(primeiraPessoa.toString());
        System.out.println(segundaPessoa.toString());
        System.out.println(terceiraPessoa.toString());
        
    }
}
