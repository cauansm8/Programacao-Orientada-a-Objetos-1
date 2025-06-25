
import java.util.Scanner;


public class Sistema {

    Scanner leitor = new Scanner(System.in);
    
    private int contadorEstadual = 0;
    private int contadorNacional = 0;
    private int contadorImportado = 0;

    private int tamanhoMax = 10;
    
    Estadual conjEstadual[] = new Estadual[tamanhoMax];
    Nacional conjNacional[] = new Nacional[tamanhoMax];
    Importado conjImportado[] = new Importado[tamanhoMax];
    
    
    public void menu()
    {
        System.out.println(
        "1 – Cadastrar Produto Estadual\n" +
        "2 – Cadastrar Produto Nacional\n" +
        "3 – Cadastrar Produto Importado\n" +
        "4 – Exibir Produtos Estaduais\n" +
        "5 – Exibir Produtos Nacionais\n" +
        "6 – Exibir Produtos Importados\n" +
        "7 – Exibir Todos Produtos\n" +
        "9 – SAIR");

        int op = leitor.nextInt();

        escolhas (op);
    }
    
    public void escolhas(int op)
    {
        
        switch(op)
        {
            case 1:
                cadastrarProdEstadual();
                menu();
            break;
            
            case 2:
                cadastrarProdNacional();
                menu();
            break;
            
            case 3:
                cadastrarProdImportado();
                menu();
            break;
            
            case 4:
                exibirProdutosEstaduais();
                menu();
            break;
            
            case 5:
                exibirProdutosNacionais();
                menu();
            break;
            
            case 6:
                exibirProdutosImportados();
                menu();
            break;
            
            case 7:
                exibirTodosProdutos();
                menu();
            break;
            
            case 9:
                System.out.println("FIM DO PROGRAMA");
            break;
            
            default:
                System.out.println("NUMERO INVALIDO");
                menu();
                break;
            

        }        
    }

    private void cadastrarProdEstadual() {
    
        if (contadorEstadual < tamanhoMax)
        {
            conjEstadual[contadorEstadual] = new Estadual();
            
            leitor.nextLine();
            
            System.out.println("Descricao: ");
            conjEstadual[contadorEstadual].setDescricao(leitor.nextLine());
            
            System.out.println("Valor: ");
            conjEstadual[contadorEstadual].setValor(leitor.nextFloat());
            
            contadorEstadual++;
            
            System.out.println("PRODUTO CADASTRADO");
            
            
        } else {
            System.out.println("TAMANHO MAX ATINGIDO PARA PRODUTOS ESTADUAIS!");
        }
    
    
    }

    private void cadastrarProdNacional() {
        if (contadorNacional < tamanhoMax)
        {
            conjNacional[contadorNacional] = new Nacional();
            
            leitor.nextLine();
            
            System.out.println("Descricao: ");
            conjNacional[contadorNacional].setDescricao(leitor.nextLine());
            
            System.out.println("Valor: ");
            conjNacional[contadorNacional].setValor(leitor.nextFloat());
            
            contadorNacional++;
            
            System.out.println("PRODUTO CADASTRADO");
            
            
        } else {
            System.out.println("TAMANHO MAX ATINGIDO PARA PRODUTOS NACIONAIS!");
        }
        
        
    }

    private void cadastrarProdImportado() {
    
        if (contadorImportado < tamanhoMax)
        {
            conjImportado[contadorImportado] = new Importado();
            
            leitor.nextLine();
            
            System.out.println("Descricao: ");
            conjImportado[contadorImportado].setDescricao(leitor.nextLine());
            
            System.out.println("Valor: ");
            conjImportado[contadorImportado].setValor(leitor.nextFloat());
            
            contadorImportado++;
            
            System.out.println("PRODUTO CADASTRADO");
            
            
        } else {
            System.out.println("TAMANHO MAX ATINGIDO PARA PRODUTOS IMPORTADO!");
        }
    
    }

    private void exibirProdutosEstaduais() {
        
        for (int i = 0; i < contadorEstadual; i++){
            if (conjEstadual[i] != null){
                System.out.println("Produto: " + conjEstadual[i].getDescricao());
                System.out.println("Valor: " + conjEstadual[i].getValor());
                System.out.println("Imposto: " + conjEstadual[i].getImposto());
            }
        }
        
        
    }

    private void exibirProdutosNacionais() {
        
        for (int i = 0; i < contadorNacional; i++){
            if (conjNacional[i] != null){
                System.out.println("Produto: " + conjNacional[i].getDescricao());
                System.out.println("Valor: " + conjNacional[i].getValor());
                System.out.println("Imposto: " + conjNacional[i].getImposto());
                System.out.println("Taxa: " + conjNacional[i].getTaxa());
            }
        }
        
        
    }

    private void exibirProdutosImportados() {
        
        for (int i = 0; i < contadorImportado; i++){
            if (conjImportado[i] != null){
                System.out.println("Produto: " + conjImportado[i].getDescricao());
                System.out.println("Valor: " + conjImportado[i].getValor());
                System.out.println("Imposto: " + conjImportado[i].getImposto());
                System.out.println("Taxa: " + conjImportado[i].getTaxa());
                System.out.println("Taxa de Importacao: " + conjImportado[i].getTaxaImportacao());
            }
        }
        
    }

    private void exibirTodosProdutos() {
        
        exibirProdutosEstaduais();
        
        System.out.println("");
        
        exibirProdutosImportados();
        
        System.out.println("");
        
        exibirProdutosNacionais();
        
    }


}


