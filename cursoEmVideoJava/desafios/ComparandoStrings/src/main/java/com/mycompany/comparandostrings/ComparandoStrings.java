/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparandostrings;

/**
 *
 * @author alan
 */
public class ComparandoStrings {

    public static void main(String[] args) {
        String nome1 = "Alan";
        String nome2 = "Alan";
        String nome3 = new String("Alan");
        
        String res1;
        String res2;
        String res3;
        res1=(nome1==nome2)?"igual":"Diferente";
        res2=(nome1==nome3)?"igual":"Diferente";
        res3=(nome2.equals(nome3))?"igual":"Diferente";
        System.out.println("Res1: " + res1);
        System.out.println("Res2: " + res2);
        System.out.println("Res3: " + res3);
        
        
    }
}
