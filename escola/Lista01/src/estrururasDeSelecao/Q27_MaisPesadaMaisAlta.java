/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrururasDeSelecao;

import java.util.Scanner;
/**
 *
 * @author alan
 */

class Pessoa{
    String nome;
    double peso;
    double altura;
}
public class Q27_MaisPesadaMaisAlta {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        Scanner ler = new Scanner(System.in);
        
        p1.nome = ler.nextLine();
        p1.altura = Double.parseDouble(ler.nextLine());
        p1.peso = Double.parseDouble(ler.nextLine());
        
        p2.nome = ler.nextLine();
        p2.altura=Double.parseDouble(ler.nextLine());
        p2.peso=Double.parseDouble(ler.nextLine());
        if (p1.altura>p2.altura) {
            System.out.println(p1.nome+" é mais alto(a)");
        } else
            System.out.println(p2.nome+" é mais alto(a)");
        
        if (p1.peso>p2.peso) {
            System.out.println(p1.nome+"é mais pesado(a)");
        }
        else
            System.out.println(p2.nome+"é mais pesado(a)");
            
    }
    
}
