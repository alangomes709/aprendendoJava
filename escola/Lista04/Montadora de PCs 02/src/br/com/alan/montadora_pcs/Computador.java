/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.montadora_pcs;

/**
 *
 * @author alan
 */
public class Computador {
    private String numSerie;
    private Processador processador;

    public Computador(String numSerie, String marcaCpu, String modeloCpu, double clock) {
        setProcessador(processador = new Processador(marcaCpu, modeloCpu, clock));
        setNumSerie(numSerie);        
    }
    
    public void getFichaTecnica(){
        System.out.println("Número de série: " + getNumSerie());
        processador.getDescricao();
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
    if (numSerie!=null && numSerie.trim().isEmpty()) {
        this.numSerie = numSerie;
    }
    throw new IllegalArgumentException("Num de série não pode ser nula ou vazia!");
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
    if (processador!=null) {
        this.processador = processador;            
    }
    throw new IllegalArgumentException("Processador não pode ser nulo");
    }
    
    
}
