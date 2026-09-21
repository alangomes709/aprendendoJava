/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.concessionaria;

/**
 *
 * @author alan
 */

//LEMBRAR: a superclasse deve ter um construtor vazio para poder ser herdada
public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public Carro(int quantidadePortas, String marca, String modelo, int anoFabricacao, double precoBase) {
        super(marca, modelo, anoFabricacao, precoBase);
        setQuantidadePortas(quantidadePortas);
    }

    @Override
    public String obterFicha(){
        String ficha = super.obterFicha();
        return ficha + "Portas: "+this.getQuantidadePortas();
    }
    
    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        if (quantidadePortas<=0) {
            throw new IllegalArgumentException("Deve ter porta no carro");
        }
        this.quantidadePortas = quantidadePortas;
    }
    
    
}
