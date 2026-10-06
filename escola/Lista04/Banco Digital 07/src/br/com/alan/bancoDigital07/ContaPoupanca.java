 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.bancoDigital07;

/**
 *
 * @author alan
 */
public class ContaPoupanca extends ContaBancaria{
    double taxaRendimento;

    public ContaPoupanca(double taxaRendimento) {
        setTaxaRendimento(taxaRendimento);
    }

    public ContaPoupanca(double taxaRendimento, String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        setTaxaRendimento(taxaRendimento);
    }
    
    public void aplicarRendimento(){
        setSaldo(getSaldo()+getTaxaRendimento());
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        if (taxaRendimento<0) {
            throw new IllegalArgumentException("taxa não pode ser negativ");
        }
        this.taxaRendimento = taxaRendimento;
    }
    
    
    
}
