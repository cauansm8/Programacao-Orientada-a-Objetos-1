/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDeDados;

/**
 *
 * @author Cauan
 */
public class Efetivo extends Docente{

    private String area;        /// bio, his, humanas, saude
    
    
    /*
    D1 - 5%     - graduação
    D2 - 10%    - mestrado e doutorado
    D3 - 20%    - livre-docência e titular
    */
    
    public Efetivo(String nome, String nivel, String area, String titulacao) {
        super(nome, nivel, titulacao);
        this.area = area;
    }
    
    
    @Override
    public double calcularSalario() {
        if ("D1".equals(this.nivel)){
            return this.salario * 1.05;
        }
        else if ("D2".equals(this.nivel)){
            return this.salario * 1 + this.salario * 0.1;
        }
        
        return this.salario * 1.2;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    @Override
    public String exibirInformacoes(){
        return  super.exibirInformacoes() + "\nTitulação: "+ titulacao + "\nÁrea: "+ area + "\n";

    }
    
}
