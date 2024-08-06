/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade01;

/**
 *
 * @author aluno.den
 */
public class Principal_livro {

    public static void main(String[] args) {
        Livros livro = new Livros("Crimes ABC", "Agatha Christie", 240, 20.0+0);
        Livros livroDois  = new Livros("A revolução dos bichos", "George Orwell", 96, 10.00);
        
        System.out.println("\nDados do Primeiro Livro: ");
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de páginas: " + livro.getNumeroDePaginas());
        System.out.println("Preço: " + livro.getPreco());
        
        System.out.println("\nDados do Segundo Livro: ");
        System.out.println("Titulo: " + livroDois.getTitulo());
        System.out.println("Autor: " + livroDois.getAutor());
        System.out.println("Número de páginas: " + livroDois.getNumeroDePaginas());
        System.out.println("Preço: " + livroDois.getPreco());
    }
}
