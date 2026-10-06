/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.setor_rh;

/**
 *
 * @author alan
 */
public class Diretor extends Funcionario{
    private int quantidadeAcoes;

    public Diretor(int quantidadeAcoes) {
        setQuantidadeAcoes(quantidadeAcoes);
    }

    public Diretor(int quantidadeAcoes, String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
        setQuantidadeAcoes(quantidadeAcoes);
    }
    
    @Override
    public double calcularSalarioFinal(){
        return (super.calcularSalarioFinal()*1.20)+(quantidadeAcoes*50);
    }

    public int getQuantidadeAcoes() {
        return quantidadeAcoes;
    }

    public void setQuantidadeAcoes(int quantidadeAcoes) {
        if (quantidadeAcoes>0) {
            this.quantidadeAcoes = quantidadeAcoes;            
        } else{
            throw new IllegalArgumentException("Acoes não podem ser negativas");
        }
    }
    
    
    
    
}
