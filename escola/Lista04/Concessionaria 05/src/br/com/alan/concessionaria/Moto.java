/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.concessionaria;

/**
 *
 * @author alan
 */
public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(int cilindradas, String marca, String modelo, int anoFabricacao, double precoBase) {
        super(marca, modelo, anoFabricacao, precoBase);
        setCilindradas(cilindradas);
    }
    
    @Override
    public String obterFicha(){
        String ficha = super.obterFicha();
        return ficha + " Cilindradas: " + this.getCilindradas();
    }
    
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        if (cilindradas<=0) {
            throw new IllegalArgumentException("A moto deve andar");
        }
        this.cilindradas = cilindradas;
    }
    
}
