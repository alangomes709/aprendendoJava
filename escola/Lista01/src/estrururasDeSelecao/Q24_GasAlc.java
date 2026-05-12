package estrururasDeSelecao;

import java.util.Scanner;

public class Q24_GasAlc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Gasolina - G RS: 8| Alcool - A RS: 6");
        char opcao = ler.next().charAt(0);
        if (opcao!='G'&& opcao!='A') {
            System.out.println("Insira uma opcao valida");
            return;
        }
        System.out.println("Quant de litros");
        double quantLitros = ler.nextDouble();
        double valorFinal=0;
        switch(opcao){
            case 'G':
                if (quantLitros<20) {
                    valorFinal=quantLitros*8*0.96;
                } else if (quantLitros>20) {
                    valorFinal=quantLitros*8*0.94;
                }
                break;
            case 'A':
                if (quantLitros<20) {
                    valorFinal=quantLitros*6*0.97;
                } else if (quantLitros>20) {
                    valorFinal=quantLitros*6*0.95;
                }
                break;
            default:
                System.out.println("Insira uma opcao valida");
                break;
        }
        System.out.println("Valor final: " + valorFinal);
    }
}
