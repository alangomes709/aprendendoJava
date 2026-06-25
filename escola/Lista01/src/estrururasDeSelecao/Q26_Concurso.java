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
public class Q26_Concurso {
    public static void main(String[] args) {        
        String nome;
        double notaPort, notaMat, notaConGer;        
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        nome=ler.nextLine();
        System.out.println("Nota Port:");
        notaPort=Double.parseDouble(ler.nextLine());
        System.out.println("Nota Mat: ");
        notaMat=Double.parseDouble(ler.nextLine());
        System.out.println("Nota Conh Gerais: ");
        notaConGer=Double.parseDouble(ler.nextLine());
        double media=(notaPort+notaMat+notaConGer)/3; 
        
        if ((notaPort >5) && (notaMat>5) && (notaConGer >5)){
                System.out.println(media);
                if (media>=7) {
                System.out.println("Aprovado");                    
                }
        }else{
            System.out.println("Reprovado");
            System.out.println(media);
        }
    }
}
