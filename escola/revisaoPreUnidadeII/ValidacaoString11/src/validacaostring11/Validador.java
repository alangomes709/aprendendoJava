/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacaostring11;

/**
 *
 * @author alan
 */
public class Validador {
    static boolean a,b;
    public static boolean validarSenha(String senha) {
        return a = senha.length()>=8;
    }
    
    public static boolean validarEmail(String email){
        return b =email.contains("@");
    }
    
    public static void exibir(boolean senha, boolean email){
        if ((email==true)&&(senha==true)) {
            System.out.println("Email e senha aprovados");
        }
    }
    
    
}
