/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDeDados;

/**
 *
 * @author Cauan
 */
public abstract class Docente extends Funcionário{
    
    protected String titulacao;

    public Docente(String nome, String nivel, String titulacao) {
        super(nome, nivel);
        this.titulacao = titulacao;
    }
    
    @Override
    public abstract double calcularSalario();

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
 
    
    
    
}
