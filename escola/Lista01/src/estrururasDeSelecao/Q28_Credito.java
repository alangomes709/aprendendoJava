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
public class Q28_Credito {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);
        double saldoMedio=Double.parseDouble(ler.nextLine());
        if (saldoMedio>0 && saldoMedio<=200) {
            saldoMedio=+0;
        } else if (saldoMedio>200 && saldoMedio<=400) {
            saldoMedio=+saldoMedio*0.8;
            
        } else if (saldoMedio>400 && saldoMedio<=600) {
            saldoMedio=+saldoMedio*0.7;
            
        } else{
            saldoMedio=+saldoMedio*0.6;
            
        }
        //corrigir
        System.out.println("Saldo Final: "+saldoMedio);
        
        
    }
}
