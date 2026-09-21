/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.ecommerce;

/**
 *
 * @author alan
 */
public class ItemVenda {
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public double calcularSubtotal(double preUni, int qntd){
        return preUni*qntd;
    }
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario<0) {
            throw new IllegalArgumentException ("O preco deve ser maior que zero");
        }
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade<=0) {
            throw new IllegalArgumentException ("Deve haver itens disponíveis no estoque");
        }
        this.quantidade = quantidade;
    }
    
    
}
