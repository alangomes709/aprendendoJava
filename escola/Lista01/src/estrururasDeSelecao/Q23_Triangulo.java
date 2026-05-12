package estrururasDeSelecao;

import java.util.Scanner;

public class Q23_Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int l1,l2,l3;
        System.out.println("L1");
        l1=ler.nextInt();
        System.out.println("L2");
        l2=ler.nextInt();
        System.out.println("L3");
        l3=ler.nextInt();
        if (l1!=l2 && l2!=l3 && l3!=l1) {
            System.out.println("Escaleno");
        } else if (l1==l2 && l1==l3) {
            System.out.println("Equilátero");
        } else {
            System.out.println("Isóceles");
        }
    }
}
