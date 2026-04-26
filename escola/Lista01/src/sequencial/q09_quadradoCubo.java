package sequencial;
import java.util.Scanner;
public class q09_quadradoCubo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite num: ");
        int num = ler.nextInt();
        System.out.println("Quadrado: "+ (num*num));
        System.out.println("Cubo: "+(num*num*num));
    }
    
}
