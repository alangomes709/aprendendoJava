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
    public String timeCasa;
    public String timeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    
    public void marcarPontoCasa(int qntPontos){
       pontosCasa+=qntPontos;
    }
    public void marcarPontoVisitante(int qntPontos){
        pontosVisitante+=qntPontos;
    }
    public void exibirPlacar(){
        System.out.printf("%s - %d X %d - %s", timeCasa, pontosCasa, pontosVisitante, timeVisitante);
    }
}
