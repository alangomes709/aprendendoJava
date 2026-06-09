/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca09;

/**
 *
 * @author todyn
 */
public class Livro {
    public String titulo;
    public String autor;
    public int totalPaginas;
    public int paginasLidas;

    public Livro(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginasLidas = 0;
    }
    
    public void registrarLeitura(int qnt){
        int aux=paginasLidas+qnt;
        if (totalPaginas<aux) {
            System.out.println("Num paginas lidas não pode ser maior q o total de paginas");
        } else{
            
        paginasLidas+=qnt;
        }
        
    }
    
    public double calcularPercentualLeitura(int paginasLidas){
        return (100*paginasLidas)/totalPaginas;
                        
                        
    }
    public void status(){
        System.out.println("Paginas Lidas: "+paginasLidas);
        System.out.println("Total Paginas: "+totalPaginas);
        System.out.println("Percentual: " +calcularPercentualLeitura(paginasLidas));
    }
    
    
    
    
}
