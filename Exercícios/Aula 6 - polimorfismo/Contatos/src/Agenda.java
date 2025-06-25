/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauan.simoes_unesp
 */
public class Agenda {   // lista de pessoas
    
    private String proprietario;
    private Pessoa pessoas[];
    private int max;
    private int cont;
    
    public Agenda (String proprietario, int max){
        this.proprietario = proprietario;
        this.max = max;
        this.pessoas = new Pessoa[max];
        this.cont = 0;
    }
    
    public void addPessoa(Pessoa p){
        
        if (cont < max){
            pessoas[cont] = p;
            cont++;
        }
        else {
            System.out.println("Estouro da agenda");
        }   
    }
    
    public Pessoa buscarPessoa(String nome){  
        for (int i = 0; i < cont; i++){
            if (pessoas[i].getNome().equals(nome)){
                return pessoas[i];
                
            }
        }
        System.out.println("Pessoa nao encontrada");
        
        
        return null;
        
    }
    
    public void addContato(String nome, Contato c){ 
        
        Pessoa p = buscarPessoa(nome);
        
        if (p != null){
            p.adicionarContato(c);
        }
        
        
    }
    
    
    public void exibirTodasPessoas(){ 
        
        if (cont > 0){
            
            for (int i = 0; i < cont; i++){
                System.out.println("Nome: " + pessoas[i].getNome());
                System.out.println("(Contato)");
                pessoas[i].exibirContatos();
                
                System.out.println("////");
            }
            
        }
        else {
            System.out.println("Nao ha pessoas nesta agenda");
        }
    }
 
    
    
    public void exibirContatosPessoa(String nome){
        
        Pessoa pRet = buscarPessoa(nome);
        
        if (pRet != null){
            pRet.exibirContatos();
        }
        
        
    }
    
    public void exibirPessoasComEmail(){
        
        boolean tem = false;
        
        for (int i = 0; i < cont; i++)
        {
            if (pessoas[i].possuiEmail()){
                System.out.println("Nome: "+ pessoas[i].getNome());
                tem = true;
            }
        }
        
        if (tem == false){
            System.out.println("Nao ha pessoa com contato do tipo email email");
        }
        
    }
    
    public void recuperarPessoaPorEmail(String email){
        
        boolean pessoasComEmail = false;
        
        
        for (int i = 0; i < cont; i++)
        {
            if (pessoas[i].buscarEmail(email)){
                System.out.println("Nome: " + pessoas[i].getNome());
                pessoasComEmail = true;
            }
            
            
        }
        
        if (pessoasComEmail == false){
            System.out.println("Nao ha pessoas com este email de contato!");
        }
        
    }
    
    public void recuperarPessoaPorTelefone (String telefone)
    {
        boolean pessoasComTelefone = false;
        
        
        for (int i = 0; i < cont; i++)
        {
            if (pessoas[i].buscarTelefone(telefone)){
                System.out.println("Nome: " + pessoas[i].getNome());
                pessoasComTelefone = true;
            }
            
            
        }
        
        if (pessoasComTelefone == false){
            System.out.println("Nao ha pessoas com este telefone de contato!");
        }
        
        
        
    }
    
    
}
