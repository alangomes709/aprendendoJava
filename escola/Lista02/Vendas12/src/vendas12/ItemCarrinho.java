/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas12;

/**
 *
 * @author alan
 */
public class ItemCarrinho {
    public String nomeProduto;
    public double precoUnitario;
    public int quantidade;

    public ItemCarrinho(String nome, double preco, int qnt) {
        this.nomeProduto = nome;
        this.precoUnitario = preco;
        this.quantidade = qnt;
    }
    
    public double calcularSubtotal(double preco, int qnt){
        return preco*qnt;
    }
    
}
