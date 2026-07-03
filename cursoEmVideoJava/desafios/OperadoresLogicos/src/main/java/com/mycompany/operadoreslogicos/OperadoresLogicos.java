/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoreslogicos;

/**
 *
 * @author alan
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        int x = 34;
        int y = 65;
        int z = 9;
        String opEE;
        String opOU;
        String opExclusivo;
        String opNao;
        //testes na tabela verdade
        opEE = (z<y && x<y)?"Ambas verdadeiras":"Uma delas ou as duas estão em desacordo";
        System.out.println(opEE);
        opOU = (z>y || x<y)?"Ambas verdadeiras ou uma delas é falsa":"Ambas são falsas";
        System.out.println(opOU);
        opExclusivo = (x>y ^ x<z)?"Uma delas e verdadeira":"Ambas verdadeiras ou falsas";
        System.out.println(opExclusivo);
        opNao = (x>y && !(z<x)) ? "Sim":"Nao";
        System.out.println(opNao);
    }
}
