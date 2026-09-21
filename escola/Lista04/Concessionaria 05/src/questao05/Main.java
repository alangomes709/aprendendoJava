/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao05;
import br.com.alan.concessionaria.Carro;
import br.com.alan.concessionaria.Moto;
/**
 *
 * @author alan
 */
public class Main {
    public static void main(String[] args) {
        Moto m = new Moto(50, "Honda", "Titan", 2023, 30000);
        Carro c = new Carro(7, "VW", "Parati", 2000, 240000);
        System.out.println(c.obterFicha());
        System.out.println(m.obterFicha());
        
    }
}
