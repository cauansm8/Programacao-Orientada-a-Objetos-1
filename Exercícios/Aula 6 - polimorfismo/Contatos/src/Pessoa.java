
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauan.simoes_unesp
 */
public class Pessoa {
    
    private Contato contatos[];
    private String nome;
    private int max;
    private int cont = 0;
    
    
    
    public Pessoa(String nome, int max){
        this.nome = nome;
        this.max = max;
        contatos = new Contato[max];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    
    
    public void adicionarContato(Contato c){
        
        if (cont < max){
            
            if (c instanceof Email){
                contatos[cont] = new Email(c.exibir());
            }
            else {
                contatos[cont] = new Telefone(c.exibir());
            }
            
            cont++;
        }
        else {
            System.out.println("Impossivel adicionar mais contatos");
        }
    }
    
    public Contato[] getContatos(){
        
        if (cont > 0){
            System.out.println("(Contatos)");
            for (int i = 0; i < cont; i++){
                System.out.println(contatos[i].exibir());
            }
        }
        
        return contatos;
    }
    
    public Contato[] getContatos(String tipo){
        
        Contato[] contatoAux;
        
        if ("Email".equals(tipo)){
            contatoAux = new Email[cont];
        }
        else {
            contatoAux = new Telefone[cont];
        }
        
        int contadorAux = 0;
        
        
        
        
        for (int i = 0; i < cont; i++){
                
            if (contatos[i] instanceof Email && tipo == "Email"){
                contatoAux[contadorAux] = new Email (contatos[i].exibir());
                contadorAux++;
            }
            if (contatos[i] instanceof Telefone && tipo == "Telefone"){
                contatoAux[contadorAux] = new Telefone (contatos[i].exibir());
                contadorAux++;
            }    
                
            
        }
        
        
        
        if (contadorAux > 0){
            int i = 0;
            System.out.println("(Contatos do tipo " + tipo + ")");
            while (contatoAux[i] != null){
                System.out.println(contatoAux[i].exibir());
                i++;
            }
        }
        
        return contatoAux;
    }
    
    public boolean possuiEmail(){
        
        for (int i = 0; i < cont; i++){
            
            if (contatos[i] instanceof Email){
                return true;
            }
            
        }
        
        return false;
    }
    
    public boolean possuiTelefone(){
        
        for (int i = 0; i < cont; i++){
            if (contatos[i] instanceof Telefone){
                return true;
            }
        }
        return false;
    }
    
    public void exibirContatos(){
        
        System.out.println("Contatos de: " + nome);
        System.out.println("Max: " + max);
        
        if (cont != 0){
            System.out.println("(Contatos)");
            for (int i = 0; i < cont; i++){
                System.out.println("Contato " + (i+1) + ": " + contatos[i].exibir());
            }
       
        }
        else {
            System.out.println("Nao ha contatos!");
        }
    }
    
    public boolean buscarEmail (String email)
    {
        for (int i = 0; i < cont; i++)
        {
            if (contatos[i].exibir().equals(email))
            {
                return true;
            }
            
            
        }
        
        return false; 
    }
    
    
    public boolean buscarTelefone (String telefone)
    {
        for (int i = 0; i < cont; i++)
        {
            if (contatos[i].exibir().equals(telefone))
            {
                return true;
            }
            
            
        }
        
        return false; 
    }
    
    
}
