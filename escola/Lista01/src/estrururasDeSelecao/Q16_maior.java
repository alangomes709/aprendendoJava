package estrururasDeSelecao;

import java.util.Scanner;

public class Q16_maior {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira numA");
        int numA = ler.nextInt();
        System.out.println("Insira numB");
        int numB = ler.nextInt();
        if(numA>numB){
            System.out.println("NumA é maior");
        } else {
            System.out.println("NumB é maior");
        }
        
    }
    
}
