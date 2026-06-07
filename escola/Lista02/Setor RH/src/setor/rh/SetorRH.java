/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setor.rh;

import java.util.Scanner;
/**
 *
 * @author todyn
 */
public class SetorRH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        Fundionario.nome = ler.nextLine();
        System.out.println("Digite Salario: ");
        Fundionario.salarioBruto = Integer.parseInt(ler.nextLine());
        System.out.printf("Salario pos impostos: %.2f", Fundionario.calcularSalario(Fundionario.salarioBruto, Fundionario.imposto));
        System.out.println("Digite a percentagem do aumento");
        double percentagem = ler.nextDouble();
        System.out.printf("Salario pos aumento(sem impostos): %.2f",Fundionario.aumentarSalario(Fundionario.salarioBruto, percentagem));
    }
    
}
