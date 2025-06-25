
import java.util.Scanner;


public class Sistema {
    
    private int tamanhoMax = 10; 
    Aluno[] conjAlunos = new Aluno[tamanhoMax];
    private int contador = 0;
    
    Scanner leitor = new Scanner(System.in);
    
    public void executar()
    {
        
        
        System.out.println("\n\nESCOLHAS DO MENU");
        System.out.println("1 - Arquivar aluno");
        System.out.println("2 - Exibir alunos");
        System.out.println("3 - Sair");
        
        int op = leitor.nextInt(); leitor.nextLine();
        
        operacoes(op);
        
    }
    
    private void operacoes(int op)
    {
        
            switch (op)
            {
            case 1:
                if (contador < tamanhoMax)
                {
                    System.out.print("Nome: ");
                    String nome = leitor.nextLine(); 
                    
                    System.out.print("\nRA: ");
                    String ra = leitor.nextLine();
                    
                    System.out.print("\nPROVA: ");
                    float prova = leitor.nextFloat(); leitor.nextLine();
                    
                    
                    conjAlunos[contador] = new Aluno (nome, ra, prova);
                    contador++;
                    executar();
                }
                break;
                
            case 2:
                for (int i = 0; i < contador; i++)
                {   
                    System.out.println("\nIMPRIMINDO ALUNO --------------------");
                    System.out.println("ALUNO " + i+1);
                    System.out.println("NOME: " + conjAlunos[i].getNome());
                    System.out.println("RA: " + conjAlunos[i].getRA());
                    System.out.println("NOTA: " + conjAlunos[i].getT1());
                    System.out.println(conjAlunos[i].aprovado());
                    System.out.println("\nRETORNANDO AO MENU ---------------- \n");
                    
                    
                }
                executar();
                break;
                
            default:
                System.out.println("OPCAO NAO EXISTENTE");
                    executar();
                break;
            }   
        
        
        
        
    }
    
}
