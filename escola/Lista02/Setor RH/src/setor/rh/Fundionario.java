/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setor.rh;

/**
 *
 * @author todyn
 */
public class Fundionario {
    public static String nome;
    public static double salarioBruto;
    public static double imposto=0.3;
    
    public static double calcularSalario(double salario, double imposto){
        return salarioBruto*imposto;
    }
    public static double aumentarSalario(double salario, double percentual){
        return salarioBruto+=salarioBruto*(percentual/100);
    }
}
