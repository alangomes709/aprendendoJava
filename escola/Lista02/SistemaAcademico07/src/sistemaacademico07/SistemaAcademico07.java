/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademico07;

/**
 *
 * @author todyn
 */
public class SistemaAcademico07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno("joao", 45);
        a1.nota1 = 5.5;
        a1.nota2 = 6.6;
        a1.media = a1.obterMedia(a1.nota1, a1.nota2);
        a1.aprovacao = a1.verificarAprovacao(a1.media);
        a1.status();
    }
    
}   
