/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package placardigital;

/**
 *
 * @author todyn
 */
public class Placar {
    public static String timeCasa;
    public static String timeVisitante;
    public static int pontosCasa;
    public static int pontosVisitante;
    
    public static void marcarPontoCasa(int qntPontos){
       pontosCasa+=qntPontos;
    }
    public static void marcarPontoVisitante(int qntPontos){
        pontosVisitante+=qntPontos;
    }
    public static void exibirPlacar(){
        System.out.printf("%s - %d X %d - %s", timeCasa, pontosCasa, pontosVisitante, timeVisitante);
    }

    
}
