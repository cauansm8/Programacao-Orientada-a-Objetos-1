/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauan.simoes_unesp
 */
import java.util.ArrayList;


import java.util.Scanner;

public class Universidade {
    
    private int tamanhoMax = 5;
    
    private int contadorNomes = 0;
    private int contadorDepartamentos = 0;
    
    Departamento [] conjDepartamentos = new Departamento[tamanhoMax];
    
    ArrayList <String> conjNomes = new ArrayList() ;
        
    
    Scanner leitor = new Scanner (System.in);    
    
    public void menu(){

        System.out.println("MENU DE OPÇÕES\n" +
        "1 – Cadastrar Departamento\n" +
        "2 – Cadastrar Funcionário Técnico\n" +
        "3 – Cadastrar Funcionário Docente\n" +
        "4 – Buscar Departamento por Codigo\n" +
        "5 – Buscar Funcionário por Nome\n" +
        "6 – Listar Departamentos com Funcionários com Faixa Salarial Específica\n" +
        "7 – Listar Funcionários com Faixa Salarial Específica\n" +
        "8 – Listar todos Funcionários da Universidade\n" +
        "9 – Listar todos Departamentos da Universidade\n" +
        "10 – Listar todos Departamentos da Universidade e seus Respectivos Funcionários\n" +
        "11 – Listar todos Funcionários Docente\n" +
        "12 – Listar todos Funcionários Técnico\n" +
        "0 – Sair");
        
        
    
        int op = leitor.nextInt();
        
        leitor.nextLine();
        
        escolhas(op);
    }

    private void escolhas(int op)
    {
        switch (op)
        {
            case 1:
                cadastrarDepartamento();
                menu();
                break;
                
            case 2:
                cadastrarFuncionarioTecnico();
                menu();
                break;
                
            case 3:
                cadastrarFuncionarioDocente();
                menu();
                break;
                
            case 4:
                buscarDepPorCod();
                menu();
                break;
                
            case 5:
                buscarFunPorNome();
                menu();
                break;
                
            case 6:
                listarDepartamentosComFuncionáriosComFaixaSalarialEspecífica();
                menu();
                break;
                
            case 7:
                listarFuncionáriosComFaixaSalarialEspecífica();
                menu();
                break;
                
                
            case 8:
                listarTodosFuncionáriosDaUniversidade();
                menu();
                break;
                
            case 9:
                listarTodosDepartamentosDaUniversidade();
                menu();
                break;
                
            case 10:
                listarTodosDepartamentosDaUniversidadeESeusRespectivosFuncionários();
                menu();
                break;
                
            case 11:
                listarTodosFuncionáriosDocente();
                menu();
                break;
                
            case 12:
                listarTodosFuncionáriosTécnico();
                menu();
                break;
                
            case 0:
                System.out.println("FIM DO PROGRAMA\n");
                break;
            
            default:
                System.out.println("OPCAO INVALIDA");
                break;

        }
        
        
    }

    private void cadastrarDepartamento() {
        
        System.out.println("Informe o codigo do departamento: ");
        int cod = leitor.nextInt();
        
        if (contadorDepartamentos < tamanhoMax){
            
            conjDepartamentos[contadorDepartamentos] = new Departamento(cod);
        
            System.out.println("DEPARTAMENTO CRIADO\n");
        
            contadorDepartamentos++;
        }
        
        else {
            System.out.println("TAMANHO MAX ATINGIDO PARA DEPARTAMENTOS");
        }
        
        
    }

    private void cadastrarFuncionarioTecnico() {
        
        System.out.println("Informe o codigo do departamento: ");
        int cod = leitor.nextInt();
        
        leitor.nextLine();
        
        System.out.println("Nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Salario: ");
        float salario = leitor.nextFloat();
        
        System.out.println("Nivel: ");
        int nivel = leitor.nextInt();
        
        FunTecnico funcT = new FunTecnico(cod, nome, salario, nivel);
        
        int conf = 0;
        
        for (int i = 0; i < contadorDepartamentos; i++){
        
            if (conjDepartamentos[i].getCodigo() == cod && conjDepartamentos[i] != null){
                conjDepartamentos[i].setConjFuncTecnicos(funcT);
                System.out.println("\nFuncionario cadastrado\n");
                conf = 1;
            }
            
        }
        if (conf == 0){
            System.out.println("\nNAO FOI ENCONTRADO UM DEPARTAMENTO COM ESSE COD\n");
        }

        conjNomes.add(nome);
        
        contadorNomes++;
        
        
    }

    private void cadastrarFuncionarioDocente() {
        
        System.out.println("Informe o codigo do departamento: ");
        int cod = leitor.nextInt();
        
        leitor.nextLine();
        
        System.out.println("Nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Salario: ");
        float salario = leitor.nextFloat();
        
        leitor.nextLine();
        
        System.out.println("Titulacao: ");
        String titulacao = leitor.nextLine();
        
        FunDocente funcD = new FunDocente(titulacao, cod, nome, salario);
        
        int conf = 0;
        
        for (int i = 0; i < contadorDepartamentos; i++){
            if (conjDepartamentos[i].getCodigo() == cod && conjDepartamentos[i] != null){
                conjDepartamentos[i].setConjFunDocentes(funcD);
                System.out.println("\nFuncionario cadastrado\n");
                conf = 1;
            }
        }
    
        if (conf == 0){
            System.out.println("\nNAO FOI ENCONTRADO UM DEPARTAMENTO COM ESSE COD\n");
        }
        
        conjNomes.add(nome);
        
        contadorNomes++;
        
    }

    private void buscarDepPorCod() {
   
        System.out.println("Informe o codigo: ");
        int cod = leitor.nextInt();
        
        int verif = 0;
        
        for (int i = 0; i < contadorDepartamentos; i++){
            
            if (cod == conjDepartamentos[i].getCodigo()){
                System.out.println("Departamento existente\n");
                verif = 1;
            }
            
        }
    
        if (verif == 0){
            System.out.println("Departamento inexistente\n");
        }
        
    }

    private void buscarFunPorNome() {
   
        
        System.out.println("Informe o nome: ");
        String nome = leitor.nextLine();
    
            
        if (conjNomes.contains(nome)){
                System.out.println("Nome encontrado\n");
        }
            
        else {
            System.out.println("Nome não encontrado\n");
        }
        
    }

    private void listarDepartamentosComFuncionáriosComFaixaSalarialEspecífica() {
        
        System.out.println("Informe uma faixa salaria inicial: ");
        float salario1 = leitor.nextFloat();
        
        System.out.println("Informe uma faixa salaria final: ");
        float salario2 = leitor.nextFloat();
        
        int verif = 0;
        
        for (int i = 0; i < contadorDepartamentos; i++){
            
            if (conjDepartamentos[i].getSalario() >= salario1 && conjDepartamentos[i].getSalario() <= salario2){
                System.out.println("Departamento " + i + " esta na faixa salarial - Salario total do dep: " + conjDepartamentos[i].getSalario());
                verif = 1;
            }
        }
        
        if (verif == 0){
            System.out.println("Nao ha departamentos com essa faixa salarial");
        }
        
    }

    private void listarFuncionáriosComFaixaSalarialEspecífica() {
    
        System.out.println("Informe uma faixa salaria inicial: ");
        float salario1 = leitor.nextFloat();
        
        System.out.println("Informe uma faixa salaria final: ");
        float salario2 = leitor.nextFloat();
        
     
        for (int i = 0; i < contadorDepartamentos; i++){
            conjDepartamentos[i].listarFuncNaFaixaSalarial(salario1, salario2);
        }   
    }

    private void listarTodosFuncionáriosDaUniversidade() {
        
        if (conjNomes.size() == 0){
            System.out.println("Nao ha funcionarios\n");
        }
        
        for (int i = 0; i < conjNomes.size(); i++){
            System.out.println(conjNomes.get(i));
        }

    }

    private void listarTodosDepartamentosDaUniversidade() {
    
        if (contadorDepartamentos == 0){
            System.out.println("Nao ha departamentos\n");
        }
        
        for (int i = 0; i < tamanhoMax; i++){
            if (conjDepartamentos[i] != null){
                System.out.println("Departamento " + conjDepartamentos[i].getCodigo());
            }
        }
    }

    private void listarTodosDepartamentosDaUniversidadeESeusRespectivosFuncionários() {
    
        if (contadorDepartamentos == 0){
            System.out.println("Nao ha departamentos\n");
        }
        
        for (int i = 0; i < tamanhoMax; i++){
            
            if (conjDepartamentos[i] != null){
                System.out.println("Departamento " + conjDepartamentos[i].getCodigo());
                conjDepartamentos[i].listarFuncDocentes();
                conjDepartamentos[i].listarFuncTecnicos();
            }
            
        }
        
    
    }

    private void listarTodosFuncionáriosDocente() {
    
        if (contadorDepartamentos == 0){
            System.out.println("Nao ha departamentos\n");
        }
    
        for (int i = 0; i < tamanhoMax; i++){
            if (conjDepartamentos[i] != null){
                System.out.println("Departamento: " + conjDepartamentos[i].getCodigo());
                conjDepartamentos[i].listarFuncDocentes();
            }
        }
    
    }

    private void listarTodosFuncionáriosTécnico() {
    
        if (contadorDepartamentos == 0){
            System.out.println("Nao ha departamentos\n");
        }
    
        for (int i = 0; i < tamanhoMax; i++){
            if (conjDepartamentos[i] != null){
                System.out.println("Departamento: " + conjDepartamentos[i].getCodigo());
                conjDepartamentos[i].listarFuncTecnicos();
            }
        }
    
    
    }
    
    
    
    
    
    
}


