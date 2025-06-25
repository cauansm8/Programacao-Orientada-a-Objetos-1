
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauan.simoes_unesp
 */
public class Livro {
    
    
    private int isbn;
    private String titulo;
    private int quantidadeCapitulos;
    private Capitulo[] capitulos;
    
    Scanner leitor = new Scanner(System.in);
    
    public void menu()
    {
        System.out.println("\n1- RELATORIO"
                + "\n2- ADICIONAR CAP"
                + "\n3- SAIR\n");
        
        int op = leitor.nextInt();
        
        opcoes (op);
    }
    
    
    public void opcoes (int op)
    {
        switch (op)
        {
            case 1:
                relatorioLivro();
                menu();
                break;
            
            case 2:
                inserirCapitulo();
                menu();
                break;
                
            case 3:
                break;
                
            default:
                System.out.println("Opcao invalida");
                menu();
                break;
            
        }
        
        
        
        
    }
    
    
    
    
    public Livro(int isbn, String titulo, int quantidadeCapitulos, String editora){
        this.isbn = isbn;
        this.titulo = titulo;
        this.quantidadeCapitulos = quantidadeCapitulos;
        capitulos = new Capitulo[quantidadeCapitulos];
        Constantes.EDITORA = editora;
    }

    public void inserirCapitulo(){
        
        if (Constantes.numeracaoCapitulos < quantidadeCapitulos){
            
                
            capitulos[Constantes.numeracaoCapitulos] = new Capitulo();    
            
            System.out.println("Informe o numero: ");
            int numero = leitor.nextInt();
            
            capitulos[Constantes.numeracaoCapitulos].setNumero(numero);
            
            System.out.println("Informe a quantidade de paginas: ");
            int quantPags = leitor.nextInt();
            
            capitulos[Constantes.numeracaoCapitulos].setQuantidadePaginas(quantPags);
            
            leitor.nextLine();
            
            System.out.println("Informe o nome do capitulo: ");
            String nome = leitor.nextLine();
            
            capitulos[Constantes.numeracaoCapitulos].setTitulo(nome);
            
            
            Constantes.numeracaoCapitulos++;
            
        }
        
        else {
            System.out.println("Quantidade excedida de caps");
        }
    }
    
    public void relatorioLivro(){
        
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Quantidade de caps: " + quantidadeCapitulos);
        
        
        if (Constantes.numeracaoCapitulos != 0){
            System.out.println("\n(Capitulos)");
            for (int i = 0; i < Constantes.numeracaoCapitulos; i++){
                System.out.println("Numero do cap: " + capitulos[i].getNumero());
                System.out.println("Titulo do cap: " + capitulos[i].getTitulo());
                System.out.println("Quantidade de pags do cap: " + capitulos[i].getQuantidadePaginas());
                System.out.println("");
            }
        }
        
        System.out.println("Editora: " + Constantes.EDITORA);
        
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidadeCapitulos() {
        return quantidadeCapitulos;
    }

    public void setQuantidadeCapitulos(int quantidadeCapitulos) {
        this.quantidadeCapitulos = quantidadeCapitulos;
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

    public Scanner getLeitor() {
        return leitor;
    }

    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }
    
    
    

}