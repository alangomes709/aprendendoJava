/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca09;

/**
 *
 * @author todyn
 */
public class Biblioteca09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro l = new Livro("O Hobbit", "JRR Tolkien", 465);
        l.registrarLeitura(45);
        l.status();
        l.registrarLeitura(345);
        l.status();
        l.registrarLeitura(45);
        l.status();
    }
    
}
