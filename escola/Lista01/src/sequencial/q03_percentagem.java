package sequencial;

import java.util.Scanner;

public class q03_percentagem {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProd = ler.nextDouble();
        System.out.println("Valor final(desconto de 20%): " + (valorProd*0.8));
    }
}
