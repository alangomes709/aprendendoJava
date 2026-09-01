/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite quantidade de pernas:");
        int qntPernas = ler.nextInt();
        switch (qntPernas){
            case 1:
                System.out.println("Saci");
                break;
            case 2: 
                System.out.println("Bípede");
                break;
            case 3:
                System.out.println("Tripé");
            case 4:
                System.out.println("Qadrúpede");
                break;
            case 6, 8:
                System.out.println("Aranha");
                break;
            default:
                System.out.println("ET");
                break;
        }
    }
}
