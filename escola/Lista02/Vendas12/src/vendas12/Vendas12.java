/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vendas12;

/**
 *
 * @author alan
 */
public class Vendas12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ItemCarrinho i1 = new ItemCarrinho("Teclado", 268.8, 2);
        ItemCarrinho i2 = new ItemCarrinho("Mouse", 150.8, 1);
        ItemCarrinho i3 = new ItemCarrinho("MousePad", 45.5, 3);
        double total=(i1.calcularSubtotal(i1.precoUnitario, i1.quantidade)) +
                (i2.calcularSubtotal(i2.precoUnitario, i2.quantidade))+
                        (i3.calcularSubtotal(i3.precoUnitario, i3.quantidade));
        System.out.println("Total: " + String.format("%.2f", total));
    }
    
}
