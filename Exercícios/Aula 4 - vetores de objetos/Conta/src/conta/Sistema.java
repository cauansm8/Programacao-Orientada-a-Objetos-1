package conta;


import java.util.Scanner;

public class Sistema {
    
    private int contador = 0;
    private int tamanhoMax = 10;
    ContaCorrenteEspecial[] conjContas = new ContaCorrenteEspecial[tamanhoMax];
    
    
    private int escolha;
    Scanner leitor = new Scanner(System.in);
    
    public void menu()
    {
        
        System.out.println("1 - CADASTRAR NOVA CONTA");
        System.out.println("2 - SAQUE");
        System.out.println("3 - DEPOSITO");
        System.out.println("4 - LISTAR CONTAS (posicao do vetor e nome dos clientes)");
        System.out.println("5 - RELATORIO GERAL (todas as contas)");
        System.out.println("6 - RELATORIO DE CONTAS CUJO SALDO ESTA ABAIXO DE ZERO");
        System.out.println("7 - RELATORIO DE CONTAS DE UM DETERMINADO");
        System.out.println("9 - SAIR");
        
        escolha = leitor.nextInt();
        
        leitor.nextLine();
        
        escolha(escolha);
        
    }
    
    public void escolha(int escolha)
    {
        switch(escolha)
        {
            case 1:
                cadastrarConta();
                break;
            
            case 2:
                saque();
                break;
                
            case 3:
                deposito();
                break;
            
            case 4:
                listarContas();
                break;
                
            case 5:
                relatorioGeral();
                break;
                
            case 6:
                relatorioGeralContasSujas();
                break;
            
            case 7:
                relatorioGeralClienteX();
                break;
                
            case 9:
                System.out.println("\n\nFIM DO PROGRAMA\n\n");
                break;
                
            default:
                System.out.println("\n\nNUMERO FORA DE ESCALA\n\n");
                menu();
                break;
        }
        
        
        
        
        
    }

    private void cadastrarConta() {
        
        if (contador < tamanhoMax)
        {
            conjContas[contador] = new ContaCorrenteEspecial();
            
            System.out.println("Numero: ");
            conjContas[contador].setNumero(leitor.nextLong());
            
            leitor.nextLine();
            
            System.out.println("Titular: ");
            conjContas[contador].setTitular(leitor.nextLine());
            
            System.out.println("Saldo: ");
            conjContas[contador].setSaldo(leitor.nextFloat());
            
            System.out.println("Limite: ");
            conjContas[contador].setLimite(leitor.nextFloat());
            
            System.out.println("\nFIM DO CADASTRO\n\n");
            
            contador++;
            
        }
        else {
            System.out.println("\n\nATINGIMOS O LIMITE DE CONTAS!!\n\n");
        }
        
        
        menu();
        
        
    }

    private void saque() {
        
        System.out.println("INFORME O NUMERO DO CLIENTE: ");
        Long cliente = leitor.nextLong();
        
        int i = 0, pos = -1;
        
        while (i < contador)
        {
            if (conjContas[i].getNumero() == cliente){
                pos = i;
                break;
            } 
            i++;
        }
        
        if (pos != -1){
            leitor.nextLine();
            System.out.println("INFORME O VALOR DO DEPOSITO: ");
            float saque = leitor.nextFloat();
            
            if (saque <= 0){
                System.out.println("VALOR INVALIDO\n\n");
                menu();
            }
            
            if (saque <= conjContas[pos].getSaldo() + conjContas[pos].getLimite())
            {
                conjContas[pos].setSaldo (conjContas[pos].getSaldo() - saque);
                System.out.println("SAQUE FEITO\n\n");
            }
            else {
                System.out.println("SAQUE NAO FEITO - VALOR ESTOURA O LIMITE!!!\n\n");
            }
            
        }
        else {
            System.out.println("CONTA NAO ENCONTRADA!!\n\n");
        }
        
        menu();
        
    }

    private void deposito() {
        
        System.out.println("INFORME O NUMERO DO CLIENTE: ");
        Long cliente = leitor.nextLong();
        
        int i = 0, pos = -1;
        
        while (i < contador)
        {
            if (conjContas[i].getNumero() == cliente){
                pos = i;
                break;
            }
            i++;
        }
        
        if (pos != -1)
        {
        leitor.nextLine();
        
        System.out.println("INFORME O VALOR A SER DEPOSITADO: ");
        float valor = leitor.nextFloat();
        
        conjContas[pos].setSaldo(conjContas[pos].getSaldo() + valor);
            System.out.println("FIM DO DEPOSITO!!\n\n");
        }
        else {
            System.out.println("CONTA NAO ENCONRTRADA\n\n");
        }
        
        
        menu();
        
    }

    private void listarContas() {
        
        int i = 0;
        System.out.println("\n\nTITULARES E POSICAO DO VETOR:");
        while (i < contador)
        {
            System.out.println("TITULAR: " + conjContas[i].getTitular() + " | POSICAO: " + i);
            i++;
        }
        
        System.out.println("\nFIM DA LISTAGEM DE CONTAS\n\n");
        
        menu();
        
    }

    private void relatorioGeral() {
    
        int i = 0;
        
            System.out.println("\n\nRELATORIO GERAL: ");
        
        while (i < contador)
        {
            
            
            System.out.println("Numero: " + conjContas[i].getNumero());
            
            System.out.println("Titular: " + conjContas[i].getTitular());
            
            System.out.println("Saldo: " + conjContas[i].getSaldo());
            
            System.out.println("Limite: " + conjContas[i].getLimite() + "\n");
            
            i++;
        }
    
        System.out.println("\nFIM DO RELATORIO GERAL\n\n");
        
        menu();
    }

    private void relatorioGeralContasSujas() {
        
        int i = 0;
        
        while (i < contador)
        {
            if (conjContas[i].getSaldo() < 0)
            {
                System.out.println("\nA conta: " + conjContas[i].getNumero()+ " do(a) "
                        + conjContas[i].getTitular() + " esta suja");
            }
            i++;
        }
        
        if (i == 0){
            System.out.println("NAO HA CONTAS SUJAS!!\n\n");
        } else{
            System.out.println("FIM DA LISTAGEM DE CONTAS SUJAS\n\n");
        }
        
        menu();
        
    }

    private void relatorioGeralClienteX() {
        
        System.out.println("INFORME O NUMERO DO CLIENTE: ");
        int cliente = leitor.nextInt();
        
        leitor.nextLine();
        
        int i = 0;
        int pos = -1;
        while (i < contador)
        {
            if (conjContas[i].getNumero() == cliente) {
                pos = i;
                break;
            }
            
            i++;
            
              
        }
        
        if (pos != -1)
        {
            System.out.println("Numero: " + conjContas[pos].getNumero());
            
            System.out.println("Titular: " + conjContas[pos].getTitular());
            
            System.out.println("Saldo: " + conjContas[pos].getSaldo());
            
            System.out.println("Limite: " + conjContas[pos].getLimite() + "\n");
        
            System.out.println("FIM DO RELATORIO ESPECIFICO\n\n");
            
        }
        else {
            System.out.println("NUMERO DE CONTA NAO ENCONTRADO!!!\n\n");
        }
            
            
            menu();
        
    }
    
}
