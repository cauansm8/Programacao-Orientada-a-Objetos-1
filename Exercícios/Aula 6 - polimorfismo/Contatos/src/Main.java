/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauan.simoes_unesp
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Cauan", 3);
        Email e1 = new Email("cauan@");
        Email e2 = new Email("cauan2@");
        Telefone t2 = new Telefone ("19");
        p.adicionarContato(e1);
        p.adicionarContato(e2);
        p.adicionarContato(t2);
        
        
        Pessoa p2 = new Pessoa ("Pessoa2", 2);
        Email e3 = new Email ("emailP2");
        p2.adicionarContato(e3);
        p2.adicionarContato(t2);
        
        Agenda agenda = new Agenda ("Dono", 2);
        agenda.addPessoa(p);
        agenda.addPessoa(p2);

        
        agenda.recuperarPessoaPorTelefone("19");
    }
    
}
