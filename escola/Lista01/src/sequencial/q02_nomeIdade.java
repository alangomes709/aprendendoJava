package sequencial;

import java.util.Scanner;

public class q02_nomeIdade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite o ano de nascimento: ");
        int anoDeNascimento = ler.nextInt();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + (2026-anoDeNascimento));
    }
}
