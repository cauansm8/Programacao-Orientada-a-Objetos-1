/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDeDados;

import javax.swing.JOptionPane;

/**
 *
 * @author Cauan
 */
public class Departamento {
    
    private String codigo;
    private String nome;
    public Funcionário funcs[];
    private int contador;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcs = new Funcionário[Constantes.tamanhoMaxFuncionarioPorDepartamento];
        contador = 0;
    }

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

    public Funcionário[] getFuncs() {
        return funcs;
    }

    public void setFuncs(Funcionário[] funcs) {
        this.funcs = funcs;
    }

    public int getContador(){
        return contador;
    }
    
    public void addFuncionario(Funcionário func){
        
        if (this.contador < Constantes.tamanhoMaxFuncionarioPorDepartamento){
            
            if (func instanceof Tecnico){
                funcs[contador] = new Tecnico(
                        ((Tecnico) func).getFuncao(), 
                        ((Tecnico) func).getNome(), 
                        ((Tecnico) func).getNivel());
            }
            else if (func instanceof Efetivo){
                funcs[contador] = new Efetivo(
                        ((Efetivo) func).getNome(), 
                        ((Efetivo) func).getNivel(), 
                        ((Efetivo) func).getArea(),
                        ((Efetivo) func).getTitulacao());
            }
            
            else if (func instanceof Substituto){
                funcs[contador] = new Substituto(
                        ((Substituto) func).getCargaHoraria(), 
                        ((Substituto) func).getNome(), 
                        ((Substituto) func).getNivel(),
                        ((Substituto) func).getTitulacao());
            }
            
            Constantes.ID++;
            contador++;
        }
        else {
            JOptionPane.showMessageDialog(null, "SEM ESPACO");
        }
        
    }
    
    public double calcularSalarioDeTodosFuncionarios(){
        double soma = 0;
        
        for (int i = 0; i < contador; i++){
            soma += funcs[i].calcularSalario();
        }
        
        return soma;
    }
    
    
    
}
