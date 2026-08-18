/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automacaoresidencial;

/**
 *
 * @author todyn
 */
public class Ventilador {
    public boolean ligado; 
    public int velocidade;
    
    public void ligar(){
        ligado = true;
        this.velocidade = 1;
    }
    public void desligar(){
        ligado = false;
        this.velocidade = 0;

    }
    public void status(){
        if (ligado==true) {
            System.out.println("O ventildador está ligado. A velocidade é " + velocidade);
        } else {
            System.out.println("O ventilador está desligado");
        }
    }
}
