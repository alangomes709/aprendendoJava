package sequencial;

import java.util.Scanner;

public class q01_leituraSoma {
    public static void main(String[] args){
        int numA=0, numB=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número A");
        numA = ler.nextInt();
        System.out.println("Digite o número B");
        numB = ler.nextInt();
        System.out.println("Soma: "+(numA+numB));
        System.out.println("subtração: "+ (numA-numB));
        System.out.println("Multiplicação: " + (numA*numB));
        double numC = Double.valueOf(numA);
        double numD = Double.valueOf(numB);
        System.out.println("Divisão: " + (numC/numD));
    }
}
