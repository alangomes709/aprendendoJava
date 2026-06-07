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
        System.out.println("Digite o valor em dorales: ");
        ConversorMoedas.qntDolar = Double.parseDouble(ler.nextLine());
        System.out.printf("Valor em real com imposto: %.2f\n", ConversorMoedas.calcularValorEmReais(ConversorMoedas.qntDolar));
    }
    
}
