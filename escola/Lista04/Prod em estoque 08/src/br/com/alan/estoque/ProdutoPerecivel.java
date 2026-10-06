/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.estoque;

/**
 *
 * @author alan
 */
public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String dataValidade) {
        if (dataValidade!=null && dataValidade.trim().isEmpty()==false) {
        this.dataValidade = dataValidade;
            
        } else{
            throw new IllegalArgumentException("Data não pode ser nulo ou vazio");
        }        
    }

    public ProdutoPerecivel(String dataValidade, String codigo, String nome, double preco) {
        super(codigo, nome, preco);
        if (dataValidade!=null && dataValidade.trim().isEmpty()==false) {
        this.dataValidade = dataValidade;
            
        } else{
            throw new IllegalArgumentException("Data não pode ser nulo ou vazio");
        }
    }
    

    @Override
    public String toString() {
        return  "Produto{" + "codigo=" + getCodigo() + ", nome=" + getNome() + ", preco=" + getPreco() + "ProdutoPerecivel{" + "dataValidade=" + dataValidade + '}';
    }
    
        
        
    
    
}
