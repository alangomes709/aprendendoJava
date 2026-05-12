package estrururasDeSelecao;

import java.util.Scanner;

public class Q28_creditoBancario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite saldo medio do ultimo ano");
        double saldoMedio = ler.nextDouble();
        double valorCredito=1;
        if (saldoMedio>0 && saldoMedio<=200) {
            System.out.println("Saldo medio: "+ saldoMedio);
            System.out.println("Valor do crédito: 0");
        }
    }
    
}
