/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cauan
 */
public class Pilha extends ED{
    
    int elementos[];
    int max;
    int contador = -1; // vai servir para apontar o topo
    
    public Pilha(int max){
        elementos = new int[max];
        this.max = max;
    }
    
    @Override
    public void adicionar(int elemento){
        
        if (contador < max - 1){
            contador++;
            
            elementos[contador] = elemento;
        }
        
    }
    
    @Override
    public int remover(){
        
        int retorno = -99999;
        
        if (contador > -1){
            retorno = elementos[contador];
            
            contador--;
        }
        
        if (retorno == -99999){
            System.out.println("Pilha vazia");
        }
        
        return retorno;   
    }
    
    
    public void apontarTopo(){
        if (contador != -1){
            System.out.println("Elemento do topo: " + elementos[contador]);
        }
        else {
            System.out.println("Nao ha elementos");
        }
    }
    
}
