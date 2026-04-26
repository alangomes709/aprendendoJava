package sequencial;
import java.util.Scanner;
public class q08_nomeSobrenome {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = ler.nextLine();
        System.out.println("Sobrenome: ");
        String sobrenome = ler.nextLine();
        System.out.println(nome + " " + sobrenome);
//        System.out.printf("%s %s%n" ,nome, sobrenome);
        
    }
}
