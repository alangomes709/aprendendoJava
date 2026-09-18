/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.alan.planocartesiano;

/**
 *
 * @author alan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(3, 8);
        
        Ponto p3 = new Ponto(7,9);
        
        Reta r1 = new Reta(2, 23);
        Reta r2 = new Reta(p1, p2);
        
        System.out.println("Pertence: "+r1.pertence(p3));
        System.out.println("R1");
        r1.mostra();
        System.out.println("R2");
        r2.mostra();
        
        //FALTA TESTAR O CIRCULO
        //deve ta certo
        
        
        p1.setX(2);
        p1.setY(5);
        System.out.println("P1");
        p1.mostra();
        System.out.println("P2");
        p2.mostra();
        p2.move(5, 9);
        System.out.println("P1");
        p1.mostra();
        System.out.println("P2");
        p2.mostra();
        System.out.println(p1.compara(p1, p2));
        
        System.out.println("Distancia "+p1.distancia(p1, p2));
        
    }
    
}
