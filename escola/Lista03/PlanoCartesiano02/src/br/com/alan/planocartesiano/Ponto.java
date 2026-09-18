/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.planocartesiano;

/**
 *
 * @author alan
 */
public class Ponto {
    private double x, y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void move(double dx, double dy){
        if (dx==0 && dy ==0) {
            throw new IllegalArgumentException("Para mover o ponto, é necessário que pelo menos uma coordenada seja diferente de zero."); //não sei se é realmente aplicável
        }
        setX(getX()+dx);
        setY(getY()+dy);
    }
    
    public boolean compara(Ponto a, Ponto b){        
        return (a.getX()==b.getX())&&(a.getY()==b.getY());
    }
    
    public void mostra(){
        System.out.println("Coordenadas: \n X = "+getX()+" Y = "+getY());
    }
    
    public double distancia(Ponto a, Ponto b){
        return Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
}
