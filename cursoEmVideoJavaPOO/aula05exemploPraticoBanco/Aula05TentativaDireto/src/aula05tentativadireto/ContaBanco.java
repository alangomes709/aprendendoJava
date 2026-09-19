/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05tentativadireto;

/**
 *
 * @author alan
 */
public class ContaBanco {
    private double saldo;
    private String nomeCliente;
    public int numConta;
    protected String tipo;
    private boolean status; 

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    
    
    public void abrirConta(String tipo){        
        setTipo(tipo);
        if (tipo.equals("CC")) {
            setSaldo(50);
            System.out.println("Conta aberta com sucesso");
        } else if (tipo.equals("CP")) {
            setSaldo(150);
            System.out.println("Conta aberta com sucesso");
        } else{
            System.out.println("Solicite um tipo de conta válido: CC ou CP");
        }
        setStatus(true);
    }
    public void fecharConta(){
        if (getSaldo()==0) {
            setSaldo(0);
            setStatus(true);
        } else {
            System.out.println("Impossivel fechar conta. Para isso é necessário que a conta esteja zerada. Com dívida ou sem.");
        }
    }
    
    public void depositar(double valor){
        if (isStatus()) {
            setSaldo(getSaldo()+valor);
        } else{
            System.out.println("Impossivel depositar. Conta fechada.");
        }
        
    }
    
    public void sacar(double valor){
        if (isStatus()) {
            System.out.println("Conta fechada. Impossível prosseguir.");    
        } else if (valor>getSaldo()) {
                System.out.println("O valor solicitado é maior do que o disponível. Impossível prosseguir.");
        } else {            
            setSaldo(getSaldo()-valor);
        }
        
    }
    
    public void pagarMensal(String tipoConta){
        if (tipoConta.equals("CC")) {
            setSaldo(getSaldo()-12);
        } else if (tipoConta.equals("CP")) {
            setSaldo(getSaldo()-20);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    

    
    
}
