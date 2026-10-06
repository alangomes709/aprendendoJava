/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.biblioteca;

/**
 *
 * @author alan
 */
public class Livro {
    private String isbn, titulo, autor;
    private int anoPublicacao;

    public Livro(String isbn, String titulo, String autor, int anoPublicacao) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
    }    
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn!=null && isbn.trim().isEmpty()==false) {
            this.isbn = isbn;            
        } else {
            
            throw new IllegalArgumentException("ISBN não pode ser nulo ou vazio");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && isbn.trim().isEmpty()==false) {
            this.titulo = titulo;
            
        } else {
        throw new IllegalArgumentException("Título não pode ser nulo ou vazio");
            
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor!=null && autor.trim().isEmpty()==false) {
            this.autor = autor;            
        } else {
            
        throw new IllegalArgumentException("Autor não pode ser nulo ou vazio.");
        }
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao<=2026) {
            this.anoPublicacao = anoPublicacao;            
        } else {
        throw new IllegalArgumentException("Ano de publicação deve ser igual ou menor que o ano atual.");
            
        }
    }
    
    
}
