/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datacentertemp13;

/**
 *
 * @author alan
 */
public class Termostato {
    public double temperaturaAtual, limiteSeguranca;

    public Termostato(double temperaturaInicial, double limite) {
        this.temperaturaAtual = temperaturaInicial;
        this.limiteSeguranca = limite;
    }
    
    public void alterarTemperatura(double novaTemp){
        if (novaTemp>limiteSeguranca) {
            System.out.println("ALARME!! /:");
        }
    }
    
}
