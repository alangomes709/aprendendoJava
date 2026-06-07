/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automacaoresidencial;

/**
 *
 * @author todyn
 */
public class AutomacaoResidencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventilador.status();
        Ventilador.ligar();
        Ventilador.status();
        Ventilador.desligar();
        Ventilador.status();
    }
    
}
