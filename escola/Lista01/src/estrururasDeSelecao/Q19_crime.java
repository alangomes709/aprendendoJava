package estrururasDeSelecao;

import java.util.Scanner;


public class Q19_crime {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont=0;
        char resp;
        System.out.println("Telefonou pra vítima?");
        resp=ler.next().charAt(0);
        if(resp=='s'){
            cont++;
        }
        System.out.println("Esteve no local do crime?");
        resp=ler.next().charAt(0);
        if(resp=='s'){
            cont++;
        }
        System.out.println("Mora perto da vítima?");
        resp=ler.next().charAt(0);
        if(resp=='s'){
            cont++;
        }
        System.out.println("Devia para a vítimaa?");
        resp=ler.next().charAt(0);
        if(resp=='s'){
            cont++;
        }
        System.out.println("Já trabalhou para a vítima?");
        resp=ler.next().charAt(0);
        if(resp=='s'){
            cont++;
        }
        
        if(cont==2){
            System.out.println("Suspeito");
        } else if(cont>=3 && cont<=4){
            System.out.println("Cúmplice");
        } else if(cont==5){
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
        
    }
}
