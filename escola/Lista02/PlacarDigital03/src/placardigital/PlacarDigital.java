/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package placardigital;

/**
 *
 * @author todyn
 */
public class PlacarDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Placar p = new Placar();
        p.timeVisitante = "IFBA";
        p.timeCasa = "FAI";
        p.marcarPontoCasa(2);
        p.marcarPontoVisitante(3);
        p.exibirPlacar();
        System.out.println(" ");
        p.marcarPontoCasa(2);
        p.marcarPontoVisitante(3);
        p.exibirPlacar();
        
        }  
    }
    

