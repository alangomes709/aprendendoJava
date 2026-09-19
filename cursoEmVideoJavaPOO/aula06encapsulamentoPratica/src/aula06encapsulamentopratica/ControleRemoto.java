/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06encapsulamentopratica;

/**
 *
 * @author alan
 */
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    
    
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        if (this.volume>=0 && this.volume <=100) {
            this.volume = volume;            
        } else {throw new IllegalArgumentException ("O volume precisa estar entre 0 e 100");}
        //poderia fazer setVolume(100), só pra jogar o erro
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("Ligado? "+this.isLigado());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i < this.getVolume(); i+=10) {
                System.out.print("|");
            }
            System.out.print("\n");
            System.out.println("Tocando? "+this.isTocando());            
        } else { throw new IllegalArgumentException ("A tv precisa estar ligada.");}
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("Fechando menu...");
            
        } else {throw new IllegalArgumentException("A tv precisa estar ligada"); }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume()+5);
        } else {throw new IllegalArgumentException("A tv precisa estar ligada"); }
        
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume()-5);
        } else {throw new IllegalArgumentException("A tv precisa estar ligada"); }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume()>0) {
            this.setVolume(0);
        } else {throw new IllegalArgumentException("A tv precisa estar ligada. O volume precisa ser maior que 0."); }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume()==0) {
            this.setVolume(5);
        } else {throw new IllegalArgumentException("A tv precisa estar ligada. O volume precisa ser igual 0"); }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando()) ) {
            this.setTocando(true);
        } else {throw new IllegalArgumentException("A tv precisa estar ligada e pausada."); }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else { throw new IllegalArgumentException ("A tv precisa estar ligada e tocando.");}
    }
}
