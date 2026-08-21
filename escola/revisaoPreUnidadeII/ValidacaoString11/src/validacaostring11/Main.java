/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacaostring11;

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
        boolean b =Validador.validarEmail("alangamesejogos@email.com.br");
        boolean a =Validador.validarSenha("Hamburguer78");
        Validador.exibir(a, b);
    }
    
}
