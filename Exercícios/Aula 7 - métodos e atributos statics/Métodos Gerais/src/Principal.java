

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauan.simoes_unesp
 */
public class Principal {
 
    public static void main(String[] args) {
        
        float [] vetor = new float[3];
        
        vetor[0] = 2.3f;
        vetor[1] = 6.4f;
        vetor[2] = 1.9f;
        
        System.out.println(Utilidade.media(vetor));
        System.out.println(Utilidade.soma(vetor));
        System.out.println(Utilidade.maior(vetor));
        System.out.println(Utilidade.menor(vetor));
        System.out.println(Utilidade.max(1, 3));
        
    }
    
}
