package sequencial;

import java.util.Scanner;

public class q13_triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a base: ");
        double base = ler.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = ler.nextDouble();
        System.out.println("Área = "+ ((base*altura)/2));
    }
}

