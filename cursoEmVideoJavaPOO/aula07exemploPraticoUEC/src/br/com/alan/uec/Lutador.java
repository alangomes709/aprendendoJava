/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.uec;

/**
 *
 * @author alan
 */
public class Lutador {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private String nacionalidade;

    public Lutador(String nome, int idade, double peso, double altura, int vitorias, int derrotas, int empates, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        setPeso(peso);
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.nacionalidade = nacionalidade;
    }

    

    
    
    public void apresentar(){
        System.out.println("Nome: "+getNome());
        System.out.println("Altura: "+getAltura());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Nacionalidade: "+getNacionalidade());
    }
    
    public void status(){
        System.out.println("Nacionalidade: "+getNacionalidade());
        System.out.println("Nome: "+getNome());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Categoria: "+getCategoria());
    }
    
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(double peso) {
        if (peso<52.2) {
            this.categoria = "Invalido";
            
        } else if (peso<70.3) {
            this.categoria = "Leve";
        } else if (peso<=83.9) {
            this.categoria = "Médio";
        } else if (peso<=120.2) {
            this.categoria = "Pesado";
        } else  {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    
            
}
