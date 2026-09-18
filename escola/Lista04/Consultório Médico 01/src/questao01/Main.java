/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;


import br.com.alan.consultoriomedico.Paciente;
import br.com.alan.consultoriomedico.Consulta;
/**
 *
 * @author alan
 */
public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("João Aldo", 43, "11122233344");
        Paciente p2 = new Paciente("José", 65,"55566677788");
        try{
            Consulta c1 = new Consulta("23/04/27", p1);
            Consulta c2 = new Consulta("12/12/23", p2);
            c1.exibirResumoConsulta();
            c2.exibirResumoConsulta();
        } catch(IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage());
        }
        
        
        
    }
    
}
