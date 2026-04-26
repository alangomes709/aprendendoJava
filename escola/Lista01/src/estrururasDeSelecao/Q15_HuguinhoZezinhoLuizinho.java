package estrururasDeSelecao;

import java.util.Scanner;

public class Q15_HuguinhoZezinhoLuizinho {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Idade de Huguinho: ");
        int huguinho = ler.nextInt();
        System.out.println("Idade de Zezinho: ");
        int zezinho = ler.nextInt();
        System.out.println("Idade de Luizinho: ");
        int luizinho = ler.nextInt();
        if(huguinho<zezinho && huguinho<luizinho){
            System.out.println("Huguinho é caçula");
        } else if(zezinho<huguinho && zezinho<luizinho){
            System.out.println("Zezinho é caçula");
        }else {
            System.out.println("Luizinho é caçula");
        }
    }
}
