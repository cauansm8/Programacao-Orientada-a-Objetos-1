/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDeDados;

/**
 *
 * @author Cauan
 */
public class Tecnico extends Funcionário{

    private String funcao;

    public Tecnico(String funcao, String nome, String nivel) {
        super(nome, nivel);
        this.funcao = funcao;
    }
    
    @Override
    public double calcularSalario() {
        if ("T1".equals(this.nivel)){
            return this.salario * 1 + this.salario * 0.1;
        }
        
        return this.salario * 1.2;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    @Override
    public String exibirInformacoes(){
        return super.exibirInformacoes()  + "\nFunção: " + funcao + "\n";
    }
    
}
