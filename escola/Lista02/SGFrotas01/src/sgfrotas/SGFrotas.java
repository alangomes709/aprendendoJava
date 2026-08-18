/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sgfrotas;

import java.util.Scanner;

/**
 *
 * @author todyn
 */
public class SGFrotas {
    public static void main(String[] args) {
        Carros c1 = new Carros();
        Carros c2 = new Carros();
        
        //carro 1
        c1.modelo = "Civic";
        c1.marca = "Honda";
        c1.ano = 2019;
        
        c2.modelo = "Uno marca texto";
        c2.marca = "Fiat";
        c2.ano = 2017;
        
        c1.exibirDados(c1.modelo, c1.marca, c1.ano);
        System.out.println("///////////////////////////");
        c2.exibirDados(c2.modelo, c2.marca, c2.ano);
        
    }
    
}
