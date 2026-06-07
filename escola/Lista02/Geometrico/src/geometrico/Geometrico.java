/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometrico;

import java.util.Scanner;

/**
 *
 * @author todyn
 */
public class Geometrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite base");
        Retangulo.base=Integer.parseInt(ler.nextLine());
        System.out.println("Digite altura");
        Retangulo.altura = Integer.parseInt(ler.nextLine());
        System.out.printf("Area da base: %.2f\n", Retangulo.calcularArea(Retangulo.base, Retangulo.altura));
        System.out.printf("Perimetro: %.2f\n", Retangulo.calcularPerimetro(Retangulo.base, Retangulo.altura));
        
    }
    
}
