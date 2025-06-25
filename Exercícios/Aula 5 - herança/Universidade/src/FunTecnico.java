/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauan.simoes_unesp
 */
public class FunTecnico extends Funcionario{

    private int nivel;
    
    
    public FunTecnico(int codigo, String nome, float salario, int nivel) {
        super(codigo, nome, salario);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
}
