/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.uec;

import java.util.Random;

/**
 *
 * @author alan
 */
public class Luta implements LutaInter {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    @Override
    public void marcarLuta(Lutador l1De, Lutador l2Do) {
        if ((l1De !=null && l2Do!=null) && (l1De.getCategoria().equals(l2Do.getCategoria())) && (l1De!=l2Do)) {
            setAprovada(true);
            setDesafiado(l1De);
            setDesafiante(l2Do);
        } else{
            setAprovada(false);
            setDesafiante(null);
            setDesafiado(null);
            throw new IllegalArgumentException("Impossivel marcar luta. Categorias diferentes, ou lutadores iguais");
        }
    }

    @Override
    public void lutar() {
        if (aprovada) {
            getDesafiado().apresentar();
            getDesafiante().apresentar();
            Random ale = new Random();
            int venc = ale.nextInt(3);
            switch (venc) {
                case 0:
                    System.out.println("Empatou!");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("Vencedor: "+getDesafiado().getNome());
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("Vencedor" + getDesafiante().getNome());
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                    break;
            }
        } else {
            throw new IllegalArgumentException ("Luta não pode acontecer");
        }
        
    }
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        if (desafiado!=null) {
            this.desafiado = desafiado;            
        } else {
            throw new IllegalArgumentException("Desafiado não poded ser nulo");
        }
        
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        if (desafiante!=null) {
            this.desafiante = desafiante;            
        } else{
            throw new IllegalArgumentException("Desafiante não pode ser nulo");
        }
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
    
    
}
