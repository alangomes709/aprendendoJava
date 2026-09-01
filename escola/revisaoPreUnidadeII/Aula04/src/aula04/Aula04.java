    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

/**
 *
 * @author alan
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Utilizando get e set diretamente
//        System.out.println("//// C1");
//        Caneta c1 = new Caneta();
//        c1.setModelo("Compactor");
//        // c1.modelo = "compactor";ok
//        c1.setPonta(0.4f);
//        // c1.ponta = 0.4f; acesso privado
//        c1.status();
//        
//        System.out.println("//// C2");
//        
//        Caneta c2 = new Caneta();
//        c2.setModelo("Cristal");
//        c2.setPonta(0.7f);
//        System.out.println("Tenho uma caneta BIC do modelo "+c2.getModelo()+"e ponta "+c2.getPonta());
        
        //Utilizando construtor
        
        Caneta c3 = new Caneta("Canetchovisk", "Roxo", 0.5f);
        c3.status();
        Caneta c4 = new Caneta("JoaoCAneta", "Azul", 0.1f);
        c4.status();
    }
    
}
