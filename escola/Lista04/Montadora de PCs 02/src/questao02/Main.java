/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;
import br.com.alan.montadora_pcs.Computador;
/**
 *
 * @author alan
 */
public class Main {
    public static void main(String[] args) {
        Computador c1 = new Computador("00001", "Intel", "Core Ultra 7 255", 4.0);
        Computador c2 = new Computador("00002", "AMD", "Ryzen 5 5700x3D", 4.3);
        
        c1.getFichaTecnica();
        c2.getFichaTecnica();
    }
}
