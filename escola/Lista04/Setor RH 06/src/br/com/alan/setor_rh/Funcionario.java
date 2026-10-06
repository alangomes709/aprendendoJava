/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.setor_rh;

/**
 *
 * @author alan
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario() {
    }
    
    public Funcionario(String nome, String cpf, double salarioBase) {
        setNome(nome);
        setCpf(cpf);
        setSalarioBase(salarioBase);
    }

    public double calcularSalarioFinal() {
        return this.salarioBase*1.05;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome!=null && nome.trim().isEmpty()==false) {
            this.nome = nome;            
        } else{
            throw new IllegalArgumentException("Nome não pode ser nulo ou estar vazio");
        }
    }   

    public String getCpf() {        
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf!=null && cpf.trim().isEmpty()==false && cpf.length()!=11) {
            throw new IllegalArgumentException("CPF deve ter somente 11 caracteres, não deve ser nulo, nem vazio.");
        }
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
}
