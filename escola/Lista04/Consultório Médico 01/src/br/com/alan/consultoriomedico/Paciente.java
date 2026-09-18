/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.consultoriomedico;

/**
 *
 * @author alan
 */
public class Paciente {
    private String nome;
    private String cpf;
    private int idade;
    
    public Paciente(String nome, int idade, String cpf){        
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==null){
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf==null || cpf.length()!=11 || cpf.contains(".") || cpf.contains("-")){
            throw new IllegalArgumentException("O CPF precisa estar completo (sem pontos ou hífen)");            
        }
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade<0) {
            throw new IllegalArgumentException("A idade precisa ser maior que zero.");
        }
        this.idade = idade;
    }
    
    
}
