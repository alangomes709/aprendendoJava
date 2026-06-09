/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico07;

/**
 *
 * @author todyn
 */
public class Aluno {
    public String nome;
    public int matricula;
    public double nota1;
    public double nota2;
    public double media;
    public boolean aprovacao;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }
    
    public double obterMedia(double n1, double n2){
        return (n1+n2)/2;
    }
    public boolean verificarAprovacao(double media){
        if (media>=7) {
            return true;
        } else{
            return false;
        }
    }
    
    public void status(){
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Media: "+ media);
        System.out.println("Aprovacao: "+aprovacao);
    }
    
    
}
