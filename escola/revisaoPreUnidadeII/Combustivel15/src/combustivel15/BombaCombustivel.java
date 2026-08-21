/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combustivel15;

/**
 *
 * @author alan
 */
public class BombaCombustivel {
    public String tipoCombustivel;
    public double valorLitro, quantidadeDisponivelNoTanque;

    public BombaCombustivel(String tipo, double valor, double quantidadeInicial) {
        this.tipoCombustivel = tipo;
        this.valorLitro = valor;
        this.quantidadeDisponivelNoTanque = quantidadeInicial;        
    }
    
    public void abastecerPorValor(double valorPago){
        double qntLitrosColocados=(valorPago/this.valorLitro);
        if (qntLitrosColocados>quantidadeDisponivelNoTanque) {
            System.out.println("Impossivel abastecer. Acabou o combustivel no tanque!");
        } else{
            quantidadeDisponivelNoTanque-=qntLitrosColocados;
        }
    }
    public void abastecerPorLitro(double qtnLitros){
        double qntLitrosColocados=(qtnLitros*this.valorLitro);
        if (qntLitrosColocados>quantidadeDisponivelNoTanque) {
            System.out.println("Impossivel abastecer. Acabou o combustivel no tanque!");
        } else{
            quantidadeDisponivelNoTanque-=qntLitrosColocados;
        }
    }
}
        
