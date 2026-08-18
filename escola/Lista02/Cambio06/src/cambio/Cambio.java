/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambio;
import java.util.Scanner;
/**
 *
 * @author todyn
 */
public class Cambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ConversorMoedas c = new ConversorMoedas();
        c.qntDolar = ler.nextDouble();
        System.out.println("Você pagará: "+ String.format("%.2f", c.calcularValorEmReais(c.qntDolar)));
    }
    
}
