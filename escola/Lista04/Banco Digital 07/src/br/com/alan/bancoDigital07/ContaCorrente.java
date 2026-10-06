/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.bancoDigital07;

/**
 *
 * @author alan
 */
public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(double limiteChequeEspecial) {
        setLimiteChequeEspecial(limiteChequeEspecial);
    }

    public ContaCorrente(double limiteChequeEspecial, String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        setLimiteChequeEspecial(limiteChequeEspecial);
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        if (limiteChequeEspecial>0 && limiteChequeEspecial<500) {
        this.limiteChequeEspecial = limiteChequeEspecial;
            
        } else{
            throw new IllegalArgumentException("O limite é de 500");
        }
    }
    
    
    
    @Override
    public void Sacar(double valor){
        setSaldo(((getLimiteChequeEspecial()+getSaldo())-valor)-2);
    }
    

    
    
    
}
