/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06encapsulamentopratica;

/**
 *
 * @author alan
 */
public class Aula06encapsulamentoPratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        ControleRemoto c = new ControleRemoto();
        try{
            c.ligar();
            c.abrirMenu();
            c.maisVolume();
            c.abrirMenu();
            c.maisVolume();
            c.maisVolume();
            c.maisVolume();
            c.maisVolume();
            c.maisVolume();
            c.maisVolume();
            c.maisVolume();
            c.maisVolume();
            c.maisVolume();
            c.maisVolume();
            c.abrirMenu();
            c.menosVolume();
            c.abrirMenu();
            
        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
