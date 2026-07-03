/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoresaritmeticos;

/**
 *
 * @author alan
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        System.out.println("OPERACOES BASICAS");
        //operacoes básicas
        int a = 3, b = 7;
        int c = a+b;
        System.out.println("Soma: "+c);
        
        int d = 5, e = 8;
        int f = d-8;
        System.out.println("Subtracao: "+f);
        
        float numerador = 33f;
        float denominador = 3f;
        float quosciente = numerador/denominador;
        float resto = numerador%denominador;
        System.out.println("Divisão: "+quosciente +"  Resto: "+resto);
        
        float fatorA = 65.3f;
        float fatorB = 2.3f;
        float produto = fatorA*fatorB;
        System.out.println("Produto: "+produto);
        
        System.out.println("INCREMENTO E DECREMENTO EM DIFERENTES POSICOES");
        //incremento antes e depois
        System.out.println("incremento");
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);
        System.out.println(numero);
        
        
        int numeroA = 5;
        int valorA = 5 + numeroA++;
        System.out.println(valorA);
        System.out.println(numeroA);
        
        System.out.println("decremento");//decremento antes e depois
        
        int hamburguer = 5;
        int queijo = 5 + --hamburguer;
        System.out.println(queijo);
        System.out.println(hamburguer);
        
        int hamburguerA = 5;
        int queijoA = 5 + hamburguerA--;
        System.out.println(queijoA);
        System.out.println(hamburguerA);
        
        System.out.println("OPERADORES DE ATRIBUICAO");
        int opa=34;
        opa+=5;
        System.out.println(opa);
        // *= /= -= %=
        
        System.out.println("CLASSE MATH");
        System.out.println("--------Básico");
        
        int raiz = (int)Math.sqrt(25);
        System.out.println("Raiz quadrada de 25: " + raiz);
        double raizCubica = Math.cbrt(37);
        System.out.println("Raiz Cubica de 37: " + raizCubica);
        int potencia = (int) Math.pow(2,4);
        System.out.println("Potencia 2^4: " + potencia);
        double pi = Math.PI;
        System.out.println("PI: " + pi);
        
        System.out.println("--------Arredondamentos");
        
        int value = Math.abs(-345);
        System.out.println("Valor absoluto de -345: " + value);
        float arredondamentoParaBaixo = (float)Math.floor(34.8f);
        System.out.println("Arredondamento para baixo 34.8: " + arredondamentoParaBaixo);
        float arredondamentoParaCima = (float) Math.ceil(34.8f);
        System.out.println("Arredondamento para cima 34.8: " + arredondamentoParaCima);
        float arredondamentoAutomatico = (float) Math.round(34.8);
        System.out.println("Arredondamento automático 34.8: "+arredondamentoAutomatico);
        
        System.out.println("----------Valores aleatorios");
        double ale0a1= Math.random();
        System.out.println("Numero entre 0 e 1: " + ale0a1);
        double ale45a89 = 45 + Math.random() * (89-45);
        System.out.println("Numero entre 45 e 89: "+ ale45a89);
        
        
    }
}
