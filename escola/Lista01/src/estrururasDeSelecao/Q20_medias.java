package estrururasDeSelecao;
import java.util.Scanner;
public class Q20_medias {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("1-aritimética | 2 - ponderada");
        int opcao = ler.nextInt();
        double n1=0,n2=0,n3=0;
        if(opcao==1){
            System.out.println("N1");
            n1 = ler.nextDouble();
            System.out.println("N2");
            n2 = ler.nextDouble();
            System.out.println("N3");
            n3 = ler.nextDouble();
            double aritmetica = ((n1+n2+n3)/3);
            System.out.println("Aritmetica: "+ aritmetica);
        } else if(opcao==2){
            System.out.println("N1");
            n1 = ler.nextDouble();
            System.out.println("N2");
            n2 = ler.nextDouble();
            System.out.println("N3");
            n3 = ler.nextDouble();
            double ponderada = (((n1*3)+(n2*3)+(n3*4))/10);
            System.out.println("Ponderada: "+ ponderada);
        } else {
            System.out.println("Insira uma opção válida");
        }
    }
}
