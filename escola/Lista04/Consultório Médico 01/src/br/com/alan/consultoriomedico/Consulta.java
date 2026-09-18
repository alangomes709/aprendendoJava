/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alan.consultoriomedico;

/**
 *
 * @author alan
 */
public class Consulta {
    private String data;
    private String historicoSintomas;
    private Paciente paciente;

    public Consulta (String data, Paciente paciente) {
        setData(data);  
        setPaciente(paciente);                
    }

    
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (data==null || data.length()!=8 ||data.contains("/")==false) {
            throw new IllegalArgumentException("A data não pode ser vazia e deve estar no formato: dd/mm/aa.");
        }
        this.data = data;
    }

    public String getHistoricoSintomas() {
        return historicoSintomas;
    }

    public void setHistoricoSintomas(String historicoSintomas) {
        if (historicoSintomas==null) {
            throw new IllegalArgumentException("O histórico não pode estar vazio.");            
        }
        this.historicoSintomas = historicoSintomas;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        if (paciente == null) {
            throw new IllegalArgumentException("O paciente não pode ser nulo.");
        }
        this.paciente = paciente;
    }
    
    public void exibirResumoConsulta(){
        System.out.println("Nome do paciente: "+getPaciente().getNome());
        System.out.println("CPF: "+getPaciente().getCpf());
        System.out.println("Data: "+getData());
        System.out.println("Sintomas: "+getHistoricoSintomas());
    }
    
}
