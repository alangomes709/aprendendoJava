/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova.unidade.pkg01;

/**
 *
 * @author curso
 */
public class Pokemon {
    public String nome;
    public String tipo;
    public int nivel;
    public int vidaMaxima;
    public int vidaAtual;

    public Pokemon(String nome, String tipo, int nivel, int vidaMaxima) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vidaAtual = vidaMaxima;
        this.vidaMaxima = vidaMaxima;
    }
    
    public void exibirFicha(){
        System.out.println("Nome: "+nome);
        System.out.println("Tipo: "+tipo);
        System.out.println("Nível: "+nivel);
        System.out.println("Vida máxima: "+vidaMaxima);
        System.out.println("Vida atual: "+vidaAtual);
    }
    
    public void recerberDano(int qntDano){
        vidaAtual-=qntDano;
        if (vidaAtual<0) {
            vidaAtual=0;
        }
    }
    
    public void recuperarTotal(){
        vidaAtual=vidaMaxima;
    }
    
    
}
