
package com.mycompany.relembrando;


public class TV {
    
    private int volume;
    private int canal;
    private boolean ligado;
    
    public TV(){
        this.volume = 0;
        this.canal = 0;
        this.ligado = false;
    }
    
    public void aumentarCanal(){
        this.canal++;
    }
    
    public void diminuirCanal(){
        this.canal--;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
    
    public void alterarVolume(int volume){
        this.volume = volume;
    }
    
    public void selecionarCanal(int canal){
        this.canal = canal;
    }
    
    public void ligarTV(){
        this.ligado = true;
    }

    @Override
    public String toString() {
        return "TV{" + "volume=" + volume + ", canal=" + canal + ", ligado=" + ligado + '}';
    }
    
    
}
