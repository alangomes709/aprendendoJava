/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.ecommerce;
import java.util.ArrayList;
/**
 *
 * @author alan
 */
public class CarrinhoCompras {
    private String cliente;
    private ArrayList<ItemVenda> itens;

    public CarrinhoCompras(String cliente) {
        setCliente(cliente);;
      //arraylist é uma classe e SEMPRE precisa ser criado um objeto(new)!(nesse caso vazio)
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(ItemVenda item) {
        if (item==null) {
            throw new IllegalArgumentException("item não pode ser vazio");
        }
        itens.add(item);
    }
    
    public double calcularTotal(){
        //falta verificacao
        if (this.itens.isEmpty()) {
            throw new IllegalArgumentException("Itens está vazio.");
        }
        double soma=0;
        for (ItemVenda a:itens){
            soma+=a.calcularSubtotal(a.getPrecoUnitario(), a.getQuantidade());
        }
        return soma;
    }
    
    public void exibirCupomFiscal(){
        if (this.itens.isEmpty()) {
            throw new IllegalArgumentException("Itens está vazio");
        }
        for(ItemVenda a: itens){
            System.out.println("/////////////////////////");
            System.out.println("Descricao: " + a.getDescricao());
            System.out.println("Quantidade "+ a.getQuantidade());
            System.out.println("Pre Unitario: "+a.getPrecoUnitario());
            System.out.println("subtotal "+a.calcularSubtotal(a.getPrecoUnitario(), a.getQuantidade()));
        }
        System.out.println("TOTAL: "+ calcularTotal());
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if (cliente == null || cliente.trim().isEmpty()) {
            throw new IllegalArgumentException("Cliente não pode ser nulo ou vazio");
        }
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
    
    
    
    
}
