/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.contagem;

/**
 *
 * @author alan
 */
public class Contador {
    private int cont;

    public Contador(){
        this.cont = 0;
    }
    public void zerar(){
        setCont(0);
    }
    
    public void incrementar(){
        setCont(getCont()+1);
    }
    
    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont<0) {
           throw new IllegalArgumentException("Impossivel realizar ação o numero é menor que zero");
        }
        this.cont = cont;
    }
    
    
}
