package estrururasDeSelecao;

import java.util.Scanner;

public class Q22_Eleicao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Idade");
        int idade = ler.nextInt();
        if ((idade>=16 && idade<18) || idade>65) {
            System.out.println("Facultativo");
        } else if (idade>=18 && idade<65) {
            System.out.println("Obrigatório");
        } else if (idade<16) {
            System.out.println("Não eleitor");
        }
    }
}
