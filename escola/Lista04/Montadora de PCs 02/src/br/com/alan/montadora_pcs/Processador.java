/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.montadora_pcs;

/**
 *
 * @author alan
 */
public class Processador {
    private String marca, modelo;
    private double clockGhz;

    public Processador(String marca, String modelo, double clockGhz) {
        setMarca(marca);
        setModelo(modelo);
        setClockGhz(clockGhz);
    }        
    
    public void getDescricao(){
        System.out.println(getMarca()+" "+getModelo()+" "+getClockGhz());
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca!=null && marca.trim().isEmpty()==false) {
            this.marca = marca;
        }
        throw new IllegalArgumentException("A marca não pode ser nula ou vazia");
    }

    public String getModelo() {        
        return modelo;
    }

    public void setModelo(String modelo) {
    if (modelo!=null && modelo.trim().isEmpty()==false) {
        this.modelo = modelo;
    }
    throw new IllegalArgumentException("O modelo não pode ser nulo ou vazio");
    }

    public double getClockGhz() {
        return clockGhz;
    }

    public void setClockGhz(double clockGhz) {
    if (clockGhz<=0) {
        this.clockGhz = clockGhz;
    }
    throw new IllegalArgumentException("Clock não pode ser negativo");
    }
    
    
}
