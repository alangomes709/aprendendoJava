/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datacentertemp13;

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
        Termostato t = new Termostato(25, 36);
        t.alterarTemperatura(32);
        t.alterarTemperatura(43);
    }
    
}
