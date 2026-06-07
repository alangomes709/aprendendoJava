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
    public static double base;
    public static double altura;
    
    public static double calcularArea(double base, double altura){
        return base*altura;
    }
    public static double calcularPerimetro(double base, double altura){
        return 2*(base + altura);
        
    }
}
