/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sgfrotas;

import java.util.Scanner;

/**
 *
 * @author todyn
 */
public class SGFrotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o modelo do veículo");
            Carros.modelo = ler.nextLine();
            System.out.println("Digite a marca: ");
            Carros.marca = ler.nextLine();
            System.out.println("Digite o ano: ");
            Carros.ano = Integer.parseInt(ler.nextLine());
            Carros.exibirDados(Carros.modelo, Carros.marca, Carros.ano);
            //resolver problema do enter
        } 
       
        
    }
    
}
