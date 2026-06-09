/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meteorologia10;

/**
 *
 * @author todyn
 */
public class ConversorTemperatura {
    public static double convFarenToCelsius(double f){
        return (f-32)*(5/9);
    }
    public static double convCelsiusToFaren(double c){
        return ((c*9/5)+32);
    }
    
}
