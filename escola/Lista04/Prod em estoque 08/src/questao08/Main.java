/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao08;

import br.com.alan.estoque.Produto;
import br.com.alan.estoque.ProdutoPerecivel;

/**
 *
 * @author alan
 */
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("5151", "Carne Hamburguer", 78);
        Produto p2 = new Produto("5151", "Arroz", 32);
        ProdutoPerecivel pp1 = new ProdutoPerecivel("23/10/2025", "346", "Batata", 59);
        
        
         System.out.println(pp1.toString());
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        
    }
    
}
