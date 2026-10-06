/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qeustao06;

import br.com.alan.setor_rh.Diretor;
import br.com.alan.setor_rh.Funcionario;
import br.com.alan.setor_rh.Gerente;

/**
 *
 * @author alan
 */
public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("MAno", "12345678912", 2000);
        Gerente ger = new Gerente("Contabilidade", "Jaques", "12345678912", 2468.43);
        Diretor dir = new Diretor(32, "Hamilton", "12345678912", 4000);
        System.out.println(func.calcularSalarioFinal());
        System.out.println(ger.calcularSalarioFinal());
        System.out.println(dir.calcularSalarioFinal());        
    }
}
