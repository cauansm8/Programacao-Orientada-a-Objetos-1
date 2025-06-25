/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDeDados;

/**
 *
 * @author Cauan
 */
public abstract class Funcionário {
    
    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;

    public Funcionário(String nome, String nivel) {
        this.codigo = String.valueOf(Constantes.ID);
        this.nome = nome;
        this.salario = Constantes.salarioBase;
        this.nivel = nivel;
    }
    
    public abstract double calcularSalario();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public String exibirInformacoes(){        
        return ("Nome: "+ nome + "\nCódigo: "+ codigo +"\nNível: "+ nivel);
        
    }
}
