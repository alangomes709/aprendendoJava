/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao03;

import br.com.alan.ecommerce.CarrinhoCompras;
import br.com.alan.ecommerce.ItemVenda;

/**
 *
 * @author alan
 */
public class Main {
    public static void main(String[] args) {
        CarrinhoCompras c1 = new CarrinhoCompras("algo");
        ItemVenda i1 = new ItemVenda();
        ItemVenda i2 = new ItemVenda();
        ItemVenda i3 = new ItemVenda();
        i1.setDescricao("aRROZ");
        i1.setPrecoUnitario(6);
        i1.setQuantidade(78);
        i2.setDescricao("Carne pct 1kg");
        i2.setPrecoUnitario(45);
        i2.setQuantidade(23);
        try{
            i3.setDescricao("Controle remoto");
            i3.setPrecoUnitario(76);
            i3.setQuantidade(-4);
            c1.adicionarItem(i1);
            c1.adicionarItem(i2);
            c1.adicionarItem(i3);            
        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }        
        c1.exibirCupomFiscal();
    }
}
