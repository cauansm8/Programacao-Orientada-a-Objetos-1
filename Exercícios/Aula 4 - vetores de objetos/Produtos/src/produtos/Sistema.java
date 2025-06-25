
package produtos;

import java.util.Scanner;


public class Sistema {
    
    Scanner leitor = new Scanner (System.in);
    
    private int contadorEstadual = 0;
    private int contadorNacional = 0;
    private int contadorImportado = 0;
    
    private int tamanhoMaxVetor = 5;
    
    Estadual conjEstadual[] = new Estadual [tamanhoMaxVetor];
    Nacional conjNacional[] = new Nacional [tamanhoMaxVetor];
    Importado conjImportado[] = new Importado [tamanhoMaxVetor];
    
    
    
    
    public void menu()
    {
        System.out.println("\nMENU:");
        System.out.println("1- CADASTRAR PRODUTO ESTADUAL");
        System.out.println("2- CADASTRAR PRODUTO NACIONAIS");
        System.out.println("3- CADASTRAR PRODUTO IMPORTADOS");
        System.out.println("4 - EXIBIR PRODUTOS ESTADUAIS");
        System.out.println("5 - EXIBIR PRODUTOS NACIONAIS");
        System.out.println("6 - EXIBIR PRODUTOS IMPORTADOS");
        System.out.println("7 - EXIBIR TODOS OS PRODUTOS");
        System.out.println("9 - SAIR");
        
        int op = leitor.nextInt();
        
        escolhas(op);
    }
    
    private void escolhas(int op)
    {
        switch (op)
        {
            case 1:
                cadEstadual();
                menu();
                break;
                
            case 2:
                cadNacional();
                menu();
                break;
                
            case 3:
                cadImportado();
                menu();
                break;
            
            case 4:
                listarEstaduais();
                menu();
                break;
                
            case 5:
                listarNacionais();
                menu();
                break;
                
            case 6:
                listarImportado();
                menu();
                break;   
             
            case 7:
                listarTudo();
                menu();
                break;
                
            case 9:
                System.out.println("\nFIM DO PROGRAMA\n\n");
                break;
                
            default:
                System.out.println("\nINFORME UM NUMERO VALIDO\n\n");
                menu();
                break;
            
        }
      
    }

    private void cadEstadual() {
        
        conjEstadual[contadorEstadual] = new Estadual();
        
        System.out.println("DESCRICAO: ");
        leitor.nextLine();
        
        conjEstadual[contadorEstadual].setDescricao(leitor.nextLine());
        
        System.out.println("VALOR:");
        
        conjEstadual[contadorEstadual].setValor(leitor.nextFloat());
        
        contadorEstadual++;
        
        System.out.println("\nPRODUTO ESTADUAL CADASTRADO COM SUCESSO\n\n");
        
    
    }

    private void cadNacional() {
        
        conjNacional[contadorNacional] = new Nacional();
        leitor.nextLine();
        
        System.out.println("DESCRICAO: ");
        conjNacional[contadorNacional].setDescricao(leitor.nextLine());
    
        
        System.out.println("VALOR:");
        conjNacional[contadorNacional].setValor(leitor.nextFloat());
     
        contadorNacional++;
        
        System.out.println("\nPRODUTO NACIONAL CADASTRADO COM SUCESSO\n\n");
        
        
    }

    private void cadImportado() {
    
        conjImportado[contadorImportado] = new Importado();
        leitor.nextLine();
        
        System.out.println("DESCRICAO: ");
        conjImportado[contadorImportado].setDescricao(leitor.nextLine());
    
        System.out.println("VALOR:");
        conjImportado[contadorImportado].setValor(leitor.nextFloat());
        
        contadorImportado++;
        
        System.out.println("\nPRODUTO IMPORTADO CADASTRADO COM SUCESSO\n\n");
        
    }

    private void listarEstaduais() {
    
        int i = 0;
        
        while (i < contadorEstadual)
        {
            System.out.println("PRODUTO " + (i+1));
            
            System.out.println("DESCRICAO: " + conjEstadual[i].getDescricao());
            
            System.out.println("VALOR INCIAL: " + conjEstadual[i].getValor());
            
            System.out.println("IMPOSTO: " + conjEstadual[i].getImposto());
            
            System.out.println("VALOR FINAL: " + conjEstadual[i].getValorFinal());
            
            System.out.println("\n\n");
            
            i++;
            
            
        }
    }

    private void listarNacionais() {
    
    int i = 0;
        
        while (i < contadorNacional)
        {
            System.out.println("PRODUTO " + (i+1));
            
            System.out.println("DESCRICAO: " + conjNacional[i].getDescricao());
            
            System.out.println("VALOR INCIAL: " + conjNacional[i].getValor());
            
            System.out.println("IMPOSTO: " + conjNacional[i].getImposto());
            
            System.out.println("TAXA: " + conjNacional[i].getTaxa());
            
            System.out.println("VALOR FINAL: " + conjNacional[i].getValorFinal());
            
            System.out.println("\n\n");
            
            i++;
        }
    
    }

    private void listarImportado() {
        
    int i = 0;
        
        while (i < contadorImportado)
        {
            System.out.println("PRODUTO " + (i+1));
            
            System.out.println("DESCRICAO: " + conjImportado[i].getDescricao());
            
            System.out.println("VALOR INCIAL: " + conjImportado[i].getValor());
            
            System.out.println("IMPOSTO: " + conjImportado[i].getImposto());
            
            System.out.println("TAXA: " + conjImportado[i].getTaxa());
            
            System.out.println("TAXA DE IMPORTACAO: " + conjImportado[i].getTaxaImportacao());
            
            System.out.println("VALOR FINAL: " + conjImportado[i].getValorFinal());
            
            System.out.println("\n\n");
            
            i++;
        }
    
    
    }

    private void listarTudo() {
    
        System.out.println("PRODUTOS ESTADUAIS:\n");
        listarEstaduais();
        System.out.println("PRODUTOS NACIONAIS:\n");
        listarNacionais();
        System.out.println("PRODUTOS IMPORTADOS:\n");
        listarImportado();
        
        System.out.println("FIM DA LISTAGEM\n");
    }
    
    
    
}
