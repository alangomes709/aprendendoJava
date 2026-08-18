/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova.unidade.pkg01;


/**
 * // NOTA: 9,5.   Faltou a verificação na cura das equipes
 * @author curso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon[] equipe = new Pokemon[3];
        
        equipe[0]=new Pokemon("Pikachu", "Eletrico", 15, 80);
        equipe[1]=new Pokemon("Charmander", "Fogo", 12, 75);
        equipe[2]=new Pokemon("Squirtle", "Agua", 14, 90);
        
        exibirEquipe(equipe);
        equipe[0].recerberDano(30);
        equipe[2].recerberDano(100);
        System.out.println("/////////////////////////");
        exibirEquipe(equipe);
        curarEquipe(equipe);
        System.out.println("/////////////////////////");
        exibirEquipe(equipe);
        
        
        
    }
    
    public static void exibirEquipe(Pokemon[] equipe){
            for (int i = 0; i < equipe.length; i++) {
                if ((equipe[i]!=null)) {
                    equipe[i].exibirFicha();                    
                }
            }
        }
        
    public static void curarEquipe(Pokemon[] equipe){
        for (int i = 0; i < equipe.length; i++) {
            //faltou verificação aqui
            equipe[i].recuperarTotal();
        }
    }
        

    
    
}
