package estrururasDeSelecao;

import java.util.Scanner;

public class q14_parImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite num: ");
        int num = ler.nextInt();
        if(num%2==0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
    }
}
