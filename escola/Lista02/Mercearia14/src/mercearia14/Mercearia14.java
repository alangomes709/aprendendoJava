/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercearia14;

/**
 *
 * @author alan
 */
public class Mercearia14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto estoque[] = new Produto[3];
        estoque[0] = new Produto("Bolacha", 6.4, 38);
        estoque[1] = new Produto("Refrigerante", 10, 32);
        estoque[2] = new Produto("Café", 16, 57);
        double total=0;
        for(int i=0; i<3; i++){
            total=+estoque[i].estoque*estoque[i].preco;
        }
        System.out.println("Patrimonio total da loja: "+total);
    }
    
}
