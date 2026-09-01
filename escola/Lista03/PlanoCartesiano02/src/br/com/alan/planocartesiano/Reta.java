/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.planocartesiano;

/**
 *
 * @author alan
 */
public class Reta {
    private double a, b;

    public Reta() {    
        this.a = 0;
        this.b = 0;        
    }
    
    public Reta(double a, double b){
        this.a=a;
        this.b=b;        
    }
    
    public Reta(Ponto p1, Ponto p2){
        this.a = (p2.getY()-p1.getY()/(p2.getX()-p1.getY()));
        this.b = (p2.getY()-(this.a * p2.getX()));
    }
    
    
    public boolean pertence(Ponto p){
        return ((getA()*p.getX())+getB())==p.getY();
    }
    
    public void mostra(){
        System.out.println("y = "+getA()+"x + "+getB());
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
}
