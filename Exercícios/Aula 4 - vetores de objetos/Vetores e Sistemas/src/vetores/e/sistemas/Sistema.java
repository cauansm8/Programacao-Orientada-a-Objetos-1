
package vetores.e.sistemas;

import java.util.Scanner;


public class Sistema {
    
    Scanner leitor = new Scanner (System.in);
    
    public int tamanhoMax = 10;
    public int contadorAlunos = 0;
    
    AlunoAcademia[] conjuntoAlunos = new AlunoAcademia[tamanhoMax];
    
    public void executarMenu()
    {
        System.out.println("MENU INICIAL");
        System.out.println("1 - CADASTRAR ALUNO");
        System.out.println("2 - LISTAR ALUNO");
        System.out.println("3 - RELATORIO GERAL");
        System.out.println("4 - SAIR DO PROGRAMA");
        System.out.println("ESCOLHA!!!");
        
        int escolha = leitor.nextInt(); 
        
        menu(escolha);
        
    }
    
    private void menu(int escolha)
    {
        switch (escolha)
        {
            case 1: 
                cadastrarAluno();
                break;
            
            case 2:
                listarAlunos();
                break;
            
            case 3:
                relatorioGeral();
                break;
                
            case 4:
                System.out.println("FIM DO PROGRAMA");
                break;
                
            default:
                System.out.println("ESCOLHA INVALIDA");
                executarMenu();
                break;
        }
        
        
        
    }
    
    
    private void listarAlunos()
    {
        System.out.println("\n\nALUNOS: ");
        for (int i = 0; i < contadorAlunos; i++)
        {
            System.out.println(conjuntoAlunos[i].getNome());
        }
        
        System.out.println("\n\n");
        
        executarMenu();
        
    }

    private void cadastrarAluno() {
        
        if (contadorAlunos < tamanhoMax)
        {
         
        conjuntoAlunos[contadorAlunos] = new AlunoAcademia();
            
            
        System.out.print("ID: ");
        int id = leitor.nextInt();
        conjuntoAlunos[contadorAlunos].setIdentificador(id);  
        
        leitor.nextLine();
        
        
        System.out.print("Nome: ");
        
        String nome = leitor.nextLine();
        conjuntoAlunos[contadorAlunos].setNome(nome); 
                
        
        System.out.print("Idade: ");
        int idade =leitor.nextInt();
        conjuntoAlunos[contadorAlunos].setIdade(idade);
        
        System.out.print("Peso: ");
        float peso =leitor.nextFloat();
        conjuntoAlunos[contadorAlunos].setPeso(peso);
        
        System.out.print("Altura: ");
        float altura =leitor.nextFloat();
        conjuntoAlunos[contadorAlunos].setAltura(altura);
            
            System.out.println("FIM DO CADASTRO\n\n");
        
        }
        else {
            System.out.println("TAMANHO MAX ATINGIDO");
        }
        contadorAlunos++;
        executarMenu();
        
    }

    

    private void relatorioGeral() {
        
        System.out.println("\n\nRelatorio Geral: ");
        for (int i = 0; i < contadorAlunos; i++)
        {
            System.out.println("\nAluno " + conjuntoAlunos[i].getIdentificador());
            System.out.println("Nome: " + conjuntoAlunos[i].getNome());
            System.out.println("Idade: " + conjuntoAlunos[i].getIdade());
            System.out.println("Peso: " + conjuntoAlunos[i].getPeso());
            System.out.println("Altura: " + conjuntoAlunos[i].getAltura() + "\n");
        
        }
        
    }
}
