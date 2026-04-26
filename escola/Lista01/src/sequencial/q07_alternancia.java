package sequencial;

import java.util.Scanner;

public class q07_alternancia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite numA");
        int numA = ler.nextInt();
        System.out.println("Digite numB");
        int numB = ler.nextInt();
        int aux=0;
        aux = numA;
        numA=numB;
        numB=aux;
        System.out.println("numA: " + numA);
        System.out.println("numB: " + numB);
        
    }
}
