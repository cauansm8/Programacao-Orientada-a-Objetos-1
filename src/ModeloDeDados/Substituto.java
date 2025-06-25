/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDeDados;

/**
 *
 * @author Cauan
 */
public class Substituto extends Docente{

    private int cargaHoraria;

    public Substituto(int cargaHoraria, String nome, String nivel, String titulacao) {
        super(nome, nivel, titulacao);
        this.cargaHoraria = cargaHoraria;
    }
    /*
    S1 - 5%
    S2 - 10%
    */
    
    
    @Override
    public double calcularSalario() {
        if ("S1".equals(this.nivel)){
            return this.salario * 1.05;
        }
        
        return this.salario * 1 + this.salario * 0.1;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String exibirInformacoes(){
        return super.exibirInformacoes() +  "\nTitulação: " + titulacao + "\nCarga horária: " + cargaHoraria + "\n";
    }
    
}
