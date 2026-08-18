/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setor.rh;

/**
 *
 * @author todyn
 */
public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto=0.7;
    
    public double calcularSalario(double salario, double imposto){
        return this.salarioBruto*this.imposto;
    }
    public double aumentarSalario(double salario, double percentual){
        return this.salarioBruto+=this.salarioBruto*(percentual/100);
    }
    

}
