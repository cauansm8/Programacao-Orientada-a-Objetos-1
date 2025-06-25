/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauan.simoes_unesp
 */
public abstract class Contato {
    
    protected String tipo;
    
    public Contato (String tipo){
        this.tipo = tipo;
    }
    
    public abstract String exibir();
    
}
