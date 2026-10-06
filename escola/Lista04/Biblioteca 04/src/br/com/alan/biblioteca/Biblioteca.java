/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author alan
 */
public class Biblioteca {
    private String nome;
    private ArrayList<Livro> acervo;

    public Biblioteca(String nome) {
        setNome(nome);
        this.acervo = new ArrayList<Livro>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome!=null && nome.trim().isEmpty()==false) {
            this.nome = nome;            
        } else {            
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
    }

    public ArrayList<Livro> getAcervo() {
        return acervo;
    }
    
    public void cadastrarLivro(Livro livro){
        if (livro != null) {
            for(Livro a: acervo){
                if (a.getIsbn().equals(livro.getIsbn())) {
                    throw new IllegalArgumentException("O ISBN não pode se repetir");
                }
            }
            this.acervo.add(livro);            
        } else {
            throw new IllegalArgumentException("Livro não pode ser nulo");
        }
    }
    
    public ArrayList<Livro> buscarPorTitulo(String termo){
        ArrayList<Livro> busca = new ArrayList<>();
        for(Livro a: acervo){
            if (a.getTitulo().contains(termo)) {
                busca.add(a);
            }
        }
        return busca;
    }
    public int getQuantidadeTotal(){
        return acervo.size();
    }
}
