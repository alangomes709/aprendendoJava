/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cambio;

/**
 *
 * @author todyn
 */
public class ConversorMoedas {
    public double cotacaoDolar=5.22;
    public double qntDolar;
    
    public double calcularValorEmReais(double qntDolar){
        return (this.qntDolar*cotacaoDolar)*0.94;
        
    }
}
