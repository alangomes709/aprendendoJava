/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao04;

import br.com.alan.biblioteca.Biblioteca;
import br.com.alan.biblioteca.Livro;
import java.util.ArrayList;

/**
 *
 * @author alan
 */
public class Main {
    public static void main(String[] args) {
        try{
            ArrayList<Livro> algo = new ArrayList<>();
            Livro l1 = new Livro("0001", "Senhor dos aneis", "JRR Tolkien", 1954);            
            Livro l2 = new Livro("0002", "Tutorial Hamburgueres", "Cane de hamburguer", 32);
            Livro l3 = new Livro("0003", "Senhor das coxinhas", "Frango desfiado", -45);
            Livro l4 = new Livro("0004", "Senhor das coxinhas", "Frango desfiado", -45);
            Biblioteca bi = new Biblioteca("The biblioteca");
            bi.cadastrarLivro(l1);
            bi.cadastrarLivro(l2);
            bi.cadastrarLivro(l3);
            bi.cadastrarLivro(l4);
            System.out.println(bi.getQuantidadeTotal());
            
            algo=bi.buscarPorTitulo("t");
            for(Livro a:algo){
                System.out.println(a.getTitulo());
            }
        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
                     
        
        
    }
}
