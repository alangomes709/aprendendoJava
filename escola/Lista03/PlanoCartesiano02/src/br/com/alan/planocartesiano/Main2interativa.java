/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.planocartesiano;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Main2interativa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Ponto p = new Ponto();
        System.out.println("Digite X");
        p.setX(ler.nextDouble());
        System.out.println("Digite Y");
        p.setY(ler.nextDouble());
        p.mostra();       
        
        //n sei como um try catch se aplica aqui
        
            try{
                System.out.println("Digite as coordenadas para mover o ponto: ");
                p.move(ler.nextDouble(), ler.nextDouble());
                p.mostra();
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }                    
    }
}
