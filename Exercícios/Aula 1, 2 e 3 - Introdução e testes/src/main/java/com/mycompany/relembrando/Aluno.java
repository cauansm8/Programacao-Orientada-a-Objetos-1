
package com.mycompany.relembrando;

public class Aluno {
    
    private int RA;
    private String nome;
    private double notas;
    private int materias;
    
    public void setMaterias(int materias){
        this.materias = materias;
    }
    
    public void setRA(int RA){
        this.RA = RA;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public void setNotas (double notas){
        this.notas = notas;
    }
    
    public int getMaterias(){
        return this.materias;
    }
    
    public int getRA(){
        return this.RA;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getNotas(){
        return this.notas;
    }
    
    public void calcularMedia(){
        double media = notas / materias;
        
        if (media >= 5){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }
    }
}
