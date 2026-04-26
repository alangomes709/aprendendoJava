package sequencial;

import java.util.Scanner;

public class q05_horaMin {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a hora: ");
        int hora = ler.nextInt();
        System.out.println("Agora, minutos: ");
        int minutos = ler.nextInt();
        minutos+=(hora * 60);
        System.out.println("Minutos totais: " + minutos);
        
    }
}
