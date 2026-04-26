package estrururasDeSelecao;
import java.util.Scanner;
public class Q18_FM {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("F ou M");
        char sexo = ler.next().charAt(0);
        if(sexo=='F'){
            System.out.println("Feminino");
        } else if (sexo=='M') {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo invalido");
        }
    }
    
}
