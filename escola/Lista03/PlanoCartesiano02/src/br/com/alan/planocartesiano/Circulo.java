/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.planocartesiano;

/**
 *
 * @author alan
 */
public class Circulo {
    private double r; //raio
    private Ponto p; //centro
    
    public Circulo(){
        this.r = 0;
        this.p.setX(0);
        this.p.setY(0);
    }
    
    public Circulo(double raio){
        this.r = raio;
        this.p.setX(0);
        this.p.setY(0);
    }
    
    public Circulo(double raio, Ponto p){
        this.r = raio;
        this.p = p;
    }

    public void inflar(){
        setR(getR()-1);
    }
    
    public void desinflar(){
        setR(getR()+1);
    }
    
    public void move(){
        p.setX(0);
        p.setY(0);
    }
    
    public void move(double x, double y){
        p.setX(x);
        p.setY(y);
    }
    
    public void move(Ponto b){
        p.setX(b.getX());
        p.setY(b.getY());   
    }
    
    public double area(){
        return 3.14*Math.pow(r, 2);
    }
    
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Ponto getP() {
        return p;
    }

    public void setP(Ponto p) {
        this.p = p;
    }
    
    
}
