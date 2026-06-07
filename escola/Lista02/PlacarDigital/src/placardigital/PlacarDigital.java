/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package placardigital;

import java.util.Scanner;

/**
 *
 * @author todyn
 */
public class PlacarDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome do time visitante: ");
        Placar.timeCasa=ler.nextLine();
        System.out.print("Nome do time casa: ");
        Placar.timeCasa=ler.nextLine();
        for (int i = 0; i < 2; i++) {
            System.out.println("Informe os pontos para adicionar ao time Visitante:");
            Placar.marcarPontoVisitante(Integer.parseInt(ler.nextLine()));
            System.out.println("Informe os pontos para adicionar ao time de casa:");
            Placar.marcarPontoCasa(Integer.parseInt(ler.nextLine()));
            Placar.exibirPlacar();
        }  
    }
    
}
