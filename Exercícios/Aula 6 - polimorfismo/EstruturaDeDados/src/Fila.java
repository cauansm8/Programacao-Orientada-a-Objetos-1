/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cauan
 */
public class Fila extends ED{
    
    private int elementos[];
    private int max;
    private int inicio;
    private int fim;
    private int qnt;
    
    public Fila(int max){
        inicio = 0;
        fim = 0;
        this.max = max;
        qnt = 0;
        elementos = new int [max];
    }
    
    @Override
    public void adicionar(int elemento){
        if (qnt < max) {

            elementos[fim] = elemento;

            fim = (fim + 1) % max;

            qnt++;

        }
    }
    
    @Override
    public int remover (){
     
        int remover = -9999;
        
        if (qnt > 0){
            
            remover = elementos[inicio];
            
            inicio = (inicio + 1) % max;
            
            qnt--;
            
        }
        
        if (remover == -9999){
            System.out.println("Nao ha elementos");
        }
        
        return remover;
        
    }
    
    public void imprimirFila(){
        
        int i = 0;
        int j = inicio;
        
        while (i < qnt)
        {
            
            
            System.out.println(elementos[j]);
            j = (j + 1) % max;
            
            i++;
        }
    }
    
    
}
