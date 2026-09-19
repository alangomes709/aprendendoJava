/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;
import br.com.alan.uec.Lutador;
/**
 *
 * @author alan
 */
public class Main {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Frankly", 31, 68.9, 1.75, 11, 2, 1, "França");
        l[1] = new Lutador("Micon", 29, 100.9, 1.95, 13, 5, 3, "Holanda");
        l[2]= new Lutador("Washington", 29, 60.0, 1.68, 2, 1, 6, "EUA");
        l[3] = new Lutador("Leny", 34, 70.0, 1.79, 8, 0, 2, "Canadá");
        l[4] = new Lutador("Manito", 33, 65.0, 1.70, 5, 3, 1, "México");
        l[5] = new Lutador("AKSJdn", 22, 65.0, 1.71, 3, 1, 3, "Alemanha");
        l[2].status();
        
    }
}
