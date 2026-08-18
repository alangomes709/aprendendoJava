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
        Funcionario f= new Funcionario();
        f.nome = "Fulano da Silva";
        f.salarioBruto = 2468.78;
        System.out.println("Salario líquido: "+ f.calcularSalario(f.salarioBruto, f.imposto));
        System.out.println("Salário com imposto "+ f.aumentarSalario(f.salarioBruto, 15));
        System.out.println("Novo Salário líquido "+ f.calcularSalario(f.salarioBruto, f.imposto));
    }
    
}
