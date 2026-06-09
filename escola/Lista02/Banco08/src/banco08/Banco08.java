/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco08;

/**
 *
 * @author todyn
 */
public class Banco08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancaria cA = new ContaBancaria(5, "João");
        ContaBancaria cB = new ContaBancaria(8, "Maria", 345.8);
        System.out.println("Conta A");
        cA.status();
        cA.saldo=cA.depositar(55.4);
        cA.status();
        cA.saldo=cA.sacar(32);
        cA.status();
        
        System.out.println("Conta B");
        cB.status();
        cB.saldo=cB.depositar(55.4);
        cB.status();
        cB.saldo=cB.sacar(32);
        cB.status();
        
        
        
    }
    
}
