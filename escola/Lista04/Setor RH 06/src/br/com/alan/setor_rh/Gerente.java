/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.setor_rh;

/**
 *
 * @author alan
 */
public class Gerente extends Funcionario{
    private String setor;

    public Gerente(String setor) {
        setSetor(setor);
    }

    public Gerente(String setor, String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
        setSetor(setor);
    }

    
    
    @Override
    public double calcularSalarioFinal(){
        return super.calcularSalarioFinal()+1500;
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if (setor!=null && setor.trim().isEmpty()==false) {
            this.setor = setor;            
        } else{
            throw new IllegalArgumentException("Setor não pode ser nulo ou vazio");
        }               
        
    }

}
