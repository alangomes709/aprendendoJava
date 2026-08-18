/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasDeRepeticao;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Q35 {
    public static void main(String[] args) {
//        Scanner ler = new Scanner(System.in);
//        int algo = ler.nextInt();
//        for (int i = 0; i < algo + 1; i++) {
//            System.out.print(i+" ");
//        }

//        Scanner ler = new Scanner(System.in);
//        int v[]={3,5,2,15,7,10,9,1,2,8};
//        int aux=0;
//        
//        for (int i = 0; i < v.length; i++) {
//            if(v[i]%5==0){
//                aux+=v[i];
//            }
//        }
//        System.out.println("Media"+(aux/10));
//        



//PARA CADA OU FOR EACH ONE
        Scanner ler = new Scanner(System.in);
        int v[]={3,5,2,15,7,10,9,1,2,8};
         for(int valor: v){
            System.out.print(valor + " ");
        }        
        System.out.println("O numero 15 está na posição: " + Arrays.binarySearch(v, 15));
        Arrays.sort(v);
        for(int valor: v){
            System.out.print(valor + " ");
        }
        
        System.out.println("Busca");
        System.out.println("O numero 15 está na posição: " + Arrays.binarySearch(v, 15));


    }
}
