package sequencial;

import java.util.Scanner;

public class q04_antecSuce {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite num inteiro: ");
        int num = ler.nextInt();
        System.out.println("Antecessor: "+(num-1));
        System.out.println("Sucessor: " + (num+1));
    }
          
}
