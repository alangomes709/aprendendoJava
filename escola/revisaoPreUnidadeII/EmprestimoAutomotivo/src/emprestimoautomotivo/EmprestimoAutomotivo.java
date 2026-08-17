/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emprestimoautomotivo;

import java.util.Scanner;

/**
 *
 * @author alan
 */
public class EmprestimoAutomotivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        boolean cnh;
        float rendaMensal;
        float valorVeiculo;
        float valorEntrada;
        int qntParcelas;
        
        float valorFinan;
        float valorParcela;
        
        System.out.println("Insira os dados requisitados abaixo:");
        System.out.print("Nome:");
        nome = ler.nextLine();
        System.out.print("Idade:");
        idade = ler.nextInt();
        //da pra melhorar isso aqui
        System.out.print("CNH válida? (S/N):");
        char cnhResp = ler.next().charAt(0);
        if (cnhResp=='S') {
            cnh=true;
        } else {
            cnh=false;
        }      
        
        if ((cnh==false)&&(idade<18)) {
            System.out.println("Você não pode realizar um empréstimo conosco.");
            System.exit(0);
        }
        
        System.out.print("Renda mensal:");
        rendaMensal = ler.nextFloat();        
        System.out.print("Valor do veículo:");
        valorVeiculo = ler.nextFloat();
        System.out.print("Valor da entrada:");
        valorEntrada = ler.nextFloat();
        System.out.print("Quantidade de parcelas desejadas:");
        qntParcelas = ler.nextInt();
        
        float auxValMinEnt = (float) (valorVeiculo*0.2);
//        System.out.println(auxValMinEnt);
        if (valorEntrada>=auxValMinEnt) {
            System.out.println("Entrada Aprovada");
        } else {
            System.out.println("Sua entrada não é suficente.");    
            System.exit(0);
            //adicionar opção para alterar proposta
        }
        
        //parcela
        valorFinan=valorVeiculo-valorEntrada;
        valorFinan+=(valorFinan*0.15);
//        System.out.println("Valor Financiamento com juros: "+valorFinan);
        valorParcela=(valorFinan/qntParcelas);
        if (!(valorParcela<=(rendaMensal*0.3))) {
            System.out.println("Emprestimo negado por renda incompatível");
            System.exit(0);
        } else{
            System.out.println("Proceesso concluído. Parabéns pela conquista.");
            System.out.println("Nome do cliente: "+ nome);
        }
//        System.out.println("Valor de cada parcela: "+ valorParcela);
        
            
        
        
        
        
                      
    }
    
    
}
