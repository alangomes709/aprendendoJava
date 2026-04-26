package sequencial;

import java.util.Scanner;

public class q11_quadrados {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite numA");
        int numA =ler.nextInt();
        System.out.println("Digite numB");
        int numB =ler.nextInt();
        System.out.println("Soma dos quadrados: " + ((Math.pow(numA, 2))+(Math.pow(numB, 2))));
    }
}
