/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoNas = ler.nextInt();
        int idade=2026-anoNas;
        if (idade>=18) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }
        
    }
    
}
