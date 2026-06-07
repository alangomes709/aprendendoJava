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
    public static double cotacaoDolar=5.17;
    public static double qntDolar;
    
    public static double calcularValorEmReais(double qntDolar){
        return (qntDolar*cotacaoDolar)*0.94;
        
    }
}
