/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasDeRepeticao;

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

        Scanner ler = new Scanner(System.in);
        int v[]={3,5,2,15,7,10,9,1,2,8};
        int aux=0;
        
        for (int i = 0; i < 10; i++) {
            if(v[i]%5==0){
                aux+=v[i];
            }
        }
        System.out.println("Media"+(aux/10));
        
    }
}
