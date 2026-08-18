/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometrico;

/**
 *
 * @author todyn
 */
public class Retangulo {
    public double base;
    public double altura;
    
    public double calcularArea(double base, double altura){
        return this.base*this.altura;
    }
    public double calcularPerimetro(double base, double altura){
        return 2*(this.base + this.altura);
        
    }
}
