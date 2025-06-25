
package com.mycompany.relembrando;


public class Pessoa implements MetodosGerais{
    
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
    public float calcularIMC(){
        return peso/(altura * altura);
    }
    
    public boolean maior(){
        if (idade >= 18) return true;
        else return false;
    }

    @Override
    public void acordar() {
            System.out.println("A pessoa " + this.nome + " acordou");
    }

    @Override
    public void dormir() {
            System.out.println("A pessoa " + this.nome + " dormiu");
    }

    @Override
    public void comer() {
            System.out.println("A pessoa " + this.nome + " esta comendo");
    }
    
}
