/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite n1");
        float n1 = ler.nextFloat();
        System.out.println("Digite n2");
        float n2 = ler.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média é "+m);
        if (m>9) {
            System.out.println("Parabéns");
        }
    }
    
}
