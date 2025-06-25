
package com.mycompany.relembrando;


public class Veiculo {
    
    private String marca;
    private String modelo;
    private int ano;
    private boolean disponivel;
    private Integer integer;
            
            
    public void alugar(){
        if (disponivel == true){
            System.out.println("O carro ja esta disponivel");
        }
        else{
            this.disponivel = true;
        }
    }
    
    public void devolver(){
        if (disponivel == false){
            System.out.println("O carro nao esta disponivel");
        }
        else{
            this.disponivel = false;
        }
    }

    @Override
    public String toString() {
        return "Veiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", disponivel=" + disponivel + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    
}
