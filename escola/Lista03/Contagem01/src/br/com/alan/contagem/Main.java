/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.alan.contagem;

/**
 *
 * @author alan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Contador c = new Contador();
            System.out.println(c.getCont());        
            c.incrementar();
            c.incrementar();
            c.setCont(4);
            c.incrementar();     
            c.incrementar();     
            
            System.out.println(c.getCont());            
//            c.zerar();
            c.setCont(-7);
            System.out.println(c.getCont());
            c.incrementar();
            System.out.println(c.getCont());
            
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
}
