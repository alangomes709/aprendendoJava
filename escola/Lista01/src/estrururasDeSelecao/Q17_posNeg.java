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
public class Q17_posNeg {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite Num");
        int num=ler.nextInt();
        if(num==0){
            System.out.println("Neutro");
        }else if(num>0){
            System.out.println("Positivo");
        } else{
            System.out.println("Negativo");
        }
    }
}
