/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco08;

/**
 *
 * @author todyn
 */
public class ContaBancaria {
    public int numeroConta;
    public String titular;
    public double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public ContaBancaria(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = depositoInicial;
    }
    
    public double depositar(double valorDeposito){
        return saldo+valorDeposito;
    }
    
    public double sacar(double valorSaque){
        return saldo-valorSaque;
    }
    
    public void status(){
        System.out.println("NConta: "+ numeroConta);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
    }
    
    
    
}
