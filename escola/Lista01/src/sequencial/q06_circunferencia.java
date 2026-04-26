package sequencial;

import java.util.Scanner;

public class q06_circunferencia {
    public static final double PI=3.14159;
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o raio: ");
        double raio = ler.nextDouble();
        System.out.println("A circunferencia tem comprimento: "+(PI*raio*2));
        
    }
}
