/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combustivel15;

/**
 *
 * @author alan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BombaCombustivel b = new BombaCombustivel("Gasolina Aditivada", 6.1, 500);
        b.abastecerPorValor(405);
        b.abastecerPorLitro(180);
        System.out.println("Quantidade disponivel na bomba: "+ String.format("%.2f", b.quantidadeDisponivelNoTanque)+"L");
    }
    
}
