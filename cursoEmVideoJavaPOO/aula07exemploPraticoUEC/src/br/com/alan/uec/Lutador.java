/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.uec;

/**
 *
 * @author alan
 */
public class Lutador implements LutadorInter {
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
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setAltura(altura);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        this.setNacionalidade(nacionalidade);
    }
    
    //MÉTODOS FUNCIONALIDADES
    
    @Override
    public void apresentar(){
//        System.out.println("Apresentação: (finge q tem uma frase bonitinha)");
//        System.out.println("Nome: "+getNome());
//        System.out.println("Altura: "+getAltura());
//        System.out.println("Ganhou: "+getVitorias());
//        System.out.println("Categoria: "+getCategoria());
//        System.out.println("Perdeu: "+getDerrotas());
//        System.out.println("Origem: "+getNacionalidade());        
//        System.out.println("Empatou"+getEmpates());
        System.out.println("\n🎙️Lutando...");
        System.out.println("Com " + getAltura() + "m de altura e representando " + getNacionalidade() + "!");
        System.out.println("Competindo pela categoria " + getCategoria() + "...");
        System.out.println("Com um cartel de " + getVitorias() + " vitórias, " + getDerrotas() + " derrotas e " + getEmpates() + " empates...");
        System.out.println("SENHORAS E SENHORES... " + getNome() + "!\"\n");
    }
    
    @Override
    public void status(){
        System.out.println("Nome: "+getNome());
        System.out.println("Peso: "+getPeso());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());        
        System.out.println("Categoria: "+getCategoria());
    }
    
    @Override
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    @Override
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    @Override
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    //MÉTODOS ESPECIAIS
    
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

    private void setCategoria(double peso) {
        if (peso<52.2) {
            this.categoria = "Invalido";           
        } else if (this.peso<=70.3) {
            this.categoria = "Leve";
        } else if (this.peso<=83.9) {
            this.categoria = "Médio";
        } else if (this.peso<=120.2) {
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
