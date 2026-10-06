/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.bancoDigital07;

/**
 *
 * @author alan
 */
public class ContaBancaria {
    private String numeroConta, titular;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldo);
    }
    
    
    
    public void Depositar(double valor){
        setSaldo(getSaldo()+valor);
    }

    public void Sacar(double valor){
        if ((getSaldo()-valor)<getSaldo()) {
            throw new IllegalArgumentException("Saldo a ser sacado não está disponível na conta");
        }
        setSaldo(getSaldo()-valor);
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta!=null && numeroConta.trim().isEmpty()==false) {
            this.numeroConta = numeroConta;            
        } else {
            throw new IllegalArgumentException("Numero comta não deve ser nulo ou vazio");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular!=null && titular.trim().isEmpty()==false) {
            this.titular = titular;            
        } else {
            throw new IllegalArgumentException("titular não deve ser nulo ou vazio");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo>0) {
            this.saldo = saldo;
            
        } else {
            throw new IllegalArgumentException("Saldo não pode ser menor q zero");
        }
    }
    
    
}
