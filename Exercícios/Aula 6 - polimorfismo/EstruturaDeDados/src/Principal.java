/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cauan
 */
public class Principal {
    
    public static void main(String[] args) {

        Fila f = new Fila (3);
        
        
        f.adicionar(3);
        f.adicionar(4);
        f.adicionar(5);
        
        
        int removido = f.remover();
        f.remover();
        f.remover();
        f.remover();
        
        f.imprimirFila();
    }
    
    
}
