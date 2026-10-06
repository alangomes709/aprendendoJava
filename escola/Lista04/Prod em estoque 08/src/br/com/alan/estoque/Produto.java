/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.estoque;

import java.util.Objects;

/**
 *
 * @author alan
 */
public class Produto {
    private String codigo, nome;
    private double preco;

    public Produto() {
    }
    

    public Produto(String codigo, String nome, double preco) {
        if (codigo!=null && nome != null && codigo.trim().isEmpty()==false && nome.trim().isEmpty()==false) {
            this.codigo = codigo;
            this.nome = nome;            
        } else {
            throw new IllegalArgumentException("Strings não podem ser nulas ou vazias");
        } if (preco>0) {
            this.preco = preco;
            
        } else{
            throw new IllegalArgumentException("Preco não pode ser negativo ou igual a zero");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }


    
    
}
