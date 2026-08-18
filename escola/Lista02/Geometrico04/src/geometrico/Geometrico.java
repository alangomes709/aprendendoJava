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
        Retangulo r = new Retangulo();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite base");
        r.base = (double)ler.nextDouble();
        System.out.println("Digite Altura");
        r.altura = (double)ler.nextDouble();
        System.out.println("Área: " + (String.format("%.2f", r.calcularArea(r.base, r.altura))));
        System.out.println("Perímetro: " + (String.format("%.2f", r.calcularPerimetro(r.base, r.altura))));
    }
    
}
