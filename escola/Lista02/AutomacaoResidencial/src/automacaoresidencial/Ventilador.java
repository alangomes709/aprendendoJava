/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automacaoresidencial;

/**
 *
 * @author todyn
 */
public class Ventilador {
    public static boolean ligado; 
    public static int velocidade;
    
    public static void ligar(){
        ligado = true;
        velocidade = 1;
    }
    public static void desligar(){
        ligado = false;
        velocidade = 0;

    }
    public static void status(){
        if (ligado==true) {
            System.out.printf("O ventildador está ligado. A velocidade é %d\n", velocidade);
        } else {
            System.out.println("O ventilador está desligado");
        }
    }
}
