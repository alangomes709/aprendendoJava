package estrururasDeSelecao;

import java.util.Scanner;

public class Q21_passouDeAno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("N1");
        double n1 = ler.nextDouble();
        System.out.println("N2");
        double n2 = ler.nextDouble();
        System.out.println("N3");
        double n3 = ler.nextDouble();
        double mediaAri = ((n1+n2+n3)/3);
        if (mediaAri<7 && mediaAri>=3) {
            System.out.println("Prova final");
        } else if(mediaAri<3){
            System.out.println("Reprovado");
        } else if(mediaAri>=7){
            System.out.println("Aprovado");
        }
    }
}
