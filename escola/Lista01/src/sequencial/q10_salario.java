package sequencial;

import java.util.Scanner;

public class q10_salario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite Horas trabnalhadas no mês: ");
        double ht = ler.nextDouble();
        System.out.println("Digite o valor da hora trabalhada:");
        double vh = ler.nextDouble();
        System.out.println("Digite o percentual de desconto: ");
        double pd = ler.nextDouble();
        double sb=ht*vh;
        double td=((pd/100)*sb);
        double sl=sb-td;
        System.out.println("Salário bruto: "+(sb));
        System.out.println("Total do desconto: "+(td));
        System.out.println("Salário líquido: "+(sl));
    }
}
