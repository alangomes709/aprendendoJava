/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrururasDeSelecao;


import java.util.Scanner;
/**
 *
 * @author alan
 */
public class Q25_NumeroN {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        if (n<=10) {
            System.out.println("F1");
        } else if (n<=100) {
            System.out.println("F2");
        } else {
            System.out.println("F3");
        }
    }
}
