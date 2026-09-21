/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.concessionaria;

/**
 *
 * @author alan
 */
public class Veiculo {
    private String marca, modelo;
    private int anoFabricacao;
    private double precoBase;
    //LEMBRAR: a superclasse deve ter um construtor vazio para poder ser herdada
    public Veiculo(){
        
    }
    public Veiculo(String marca, String modelo, int anoFabricacao, double precoBase) {
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setPrecoBase(precoBase);
    }
    
    public String obterFicha(){
        String ficha = "Marca: "+this.getMarca() +" Modelo: "+this.getModelo()+" Ano: "+ this.getAnoFabricacao()+" Preco: " + this.getPrecoBase();
        return ficha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca==null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca Não pode ser vazia");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo==null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("modelo Não pode ser vazia");
        }
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao>2026) {
            throw new IllegalArgumentException("O carro não pode ter sido feito no futuro");
        }
        this.anoFabricacao = anoFabricacao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase<=0) {
            throw new IllegalArgumentException("O carro não pode ser de graça ou ter preco negativo");
        }
        this.precoBase = precoBase;
    }
    
    
    
}
