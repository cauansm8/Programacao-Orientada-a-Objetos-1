/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArmazenamentoDeDados;

import ModeloDeDados.Constantes;
import ModeloDeDados.Departamento;
import ModeloDeDados.Docente;
import ModeloDeDados.Efetivo;
import ModeloDeDados.Funcionário;
import ModeloDeDados.Substituto;
import ModeloDeDados.Tecnico;
import javax.swing.JOptionPane;

/**
 *
 * @author Cauan
 */
public class DataBase {
    
    private Departamento departamentos[];
    private int contador;

    public DataBase(){
        this.contador = 0;
        departamentos = new Departamento[Constantes.tamanhoMaxDeDepartamentosNaUniversidade];
    }
    
    
    public void AdicionarFuncionario(Funcionário func, String codigo)
    {
        for (int i = 0; i < contador; i++)
        {
         if (departamentos[i].getCodigo().equals(codigo)){
             departamentos[i].addFuncionario(func);
         }
        }
    }
    
    public void AdicionarDepartamento(Departamento dep){
        if (this.contador < Constantes.tamanhoMaxDeDepartamentosNaUniversidade){
            
            departamentos[contador] = new Departamento(dep.getNome());
            departamentos[contador].setCodigo(String.valueOf(Constantes.codDEP));
            Constantes.codDEP++;
            
            contador++;
        }
        else {
            JOptionPane.showMessageDialog(null, "SEM ESPACO");
        }
    }
    
    public String Geral(){
        
        boolean encontrado = false;
        
        
        String relatorio = ""; 
        
        for (int i = 0; i < contador; i++)
        {
            relatorio += "\nNome do departamento: ";
            relatorio += departamentos[i].getNome();
            encontrado = true;
            
            relatorio += "\n";
            
            relatorio += "Código do departamento: ";
            relatorio += departamentos[i].getCodigo();
            
            relatorio += "\n";
            
            
            if (departamentos[i].getContador() > 0){
                relatorio += "Gasto total com funcionários: ";
                relatorio += departamentos[i].calcularSalarioDeTodosFuncionarios();
                
                relatorio += "\n";
                
                for (int j = 0; j < departamentos[i].getContador(); j++){
                    relatorio += departamentos[i].funcs[j].exibirInformacoes();
                    
                    relatorio += "\n";
                }                
            }
            
        }
        
        if (encontrado == false){
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum departamento");
        }
        
        
        return relatorio;
    }
    
    
    public String ResumoDosDepartamentos(){
        
        String relatorio = "";
        
        boolean encontrado = false;
        
        for (int i = 0; i < contador; i++)
        {
            encontrado = true;
            
            relatorio += "\nNome do departamento: ";
            relatorio += departamentos[i].getNome();
            
            relatorio += "\n";
            
            relatorio += "Quantidade de funcionários: ";
            relatorio += departamentos[i].getContador();
            
            relatorio += "\n";
            relatorio += "Gasto total com funcionários: ";
            relatorio += departamentos[i].calcularSalarioDeTodosFuncionarios();
            
            relatorio += "\n\n";
        }
        
        if (encontrado == false){
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum departamento");
        }
        
        
        return relatorio;
    }
    
    public String ResumoDosDepartamentosComGastoEmFaixaEspecífica(double faixaInicial, double faixaFinal){
        
        String relatorio = "";
        
        boolean encontrado = false;
        
        for (int i = 0; i < contador; i++)
        {
            double gasto = departamentos[i].calcularSalarioDeTodosFuncionarios();
            
            if (gasto >= faixaInicial && gasto <= faixaFinal){
                relatorio += "\nO departamento "; 
                relatorio += departamentos[i].getNome() + " tem gastos nessa faixa específica";
                
                relatorio += "\n";
                
                relatorio += "Gasto do departamento: " + gasto;
                
                relatorio += "\n";
                
                relatorio += "Quantidade de funcionários: " + departamentos[i].getContador();
                
                
                relatorio += "\n";
                encontrado = true;
            }   
        }
        if (encontrado == false){
            JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum departamento com gastos nessa faixa");
        }
        
        
        return relatorio;
    }
    
    public String FuncionáriosComSalárioEmFaixaEspecífica(double salarioInicial, double salarioFinal){
        
        boolean encontrado = false;
        
        String relatorio = "";
        
        for (int i = 0; i < contador; i++)  // for para andar pelos departamentos
        {
            for (int j = 0; j < departamentos[i].getContador(); j++)    // for para andar pelos funcionários
            {
                double salario = departamentos[i].funcs[j].calcularSalario();
                
                if (salario >= salarioInicial && salario <= salarioFinal){
                    relatorio += "\n" +  departamentos[i].funcs[j].exibirInformacoes();
                    relatorio += "Salario: " + salario;
                    encontrado = true;
                    relatorio += "\n";
                }
            }
        }
        
        if (encontrado == false){
            JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum funcionário com gastos nessa faixa");
        }
        
        
        return relatorio;
    }
    
    public String ExibirTodosOsFuncionários(){
        String relatorio = "";
        
        boolean encontrado = false;
        
        for (int i = 0; i < contador; i++)  // for para andar pelos departamentos
        {
            relatorio += "\nDepartamento " + departamentos[i].getNome() + " - "; 
            relatorio += departamentos[i].getCodigo() + ":";
            for (int j = 0; j < departamentos[i].getContador(); j++)    // for para andar pelos funcionários
            {
                relatorio += "\n";
                relatorio += departamentos[i].funcs[j].exibirInformacoes();
                relatorio += "\n";
                
                encontrado = true;
            }
            
        }
        
        if (encontrado == false){
            JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum funcionário");
        }
        
        return relatorio;
    }
    
    public String ExibirTodosOsTécnicos(){
        
        String relatorio = "";
        boolean encontrado = false;
        
        for (int i = 0; i < contador; i++)  // for para andar pelos departamentos
        {
            for (int j = 0; j < departamentos[i].getContador(); j++)    // for para andar pelos funcionários
            {
                if (departamentos[i].funcs[j] instanceof Tecnico){
                    relatorio += "\n" + departamentos[i].funcs[j].exibirInformacoes();
                    encontrado = true;
                    
                }
            }
        }
        
        
        if (encontrado == false){
            JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum funcionário técnico");
        }
        
        return relatorio;
    }
    
    public String ExibirTodosOsDocentes(){
        
        String relatorio = "";
        boolean encontrado = false;
        
        
        for (int i = 0; i < contador; i++)  // for para andar pelos departamentos
        {
            for (int j = 0; j < departamentos[i].getContador(); j++)    // for para andar pelos funcionários
            {
                if (departamentos[i].funcs[j] instanceof Docente){
                    relatorio += "\n" + departamentos[i].funcs[j].exibirInformacoes();
                    encontrado = true;
                }
            }
        }
        
        if (encontrado == false){
            JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum funcionário docente");
        }
        
        return relatorio;
    }
    
    public String ExibirTodosOsDocentesEfetivos(){
        
        String relatorio = "";
        boolean encontrado = false;
        
        
        for (int i = 0; i < contador; i++)  // for para andar pelos departamentos
        {
            for (int j = 0; j < departamentos[i].getContador(); j++)    // for para andar pelos funcionários
            {
                if (departamentos[i].funcs[j] instanceof Efetivo){
                    relatorio += "\n" + departamentos[i].funcs[j].exibirInformacoes();
                    encontrado = true;
                }
            }
        }
    
        if (encontrado == false){
            JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum funcionário docente efetivo");
        }
        
        return relatorio;
    }
    
    public String ExibirTodosOsDocentesSubstitutos(){
        
        String relatorio = "";
        boolean encontrado = false;
        
        
        for (int i = 0; i < contador; i++)  // for para andar pelos departamentos
        {
            for (int j = 0; j < departamentos[i].getContador(); j++)    // for para andar pelos funcionários
            {
                if (departamentos[i].funcs[j] instanceof Substituto){
                    relatorio += "\n" + departamentos[i].funcs[j].exibirInformacoes();
                    encontrado = true;
                    
                }
            }
        }
        
        if (encontrado == false){
            JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum funcionário docente substituto");
        }
        
        
        return relatorio;
    }
    
    public String ExibirInformaçõesDeUmDepartamento(String codigo){
        
        boolean encontrado = false;
        String relatorio = "";
        
        for (int i = 0; i < contador; i++)
        {
            if (departamentos[i].getCodigo().equals(codigo)){
                
                relatorio += "\nNome do departamento: " + departamentos[i].getNome();
                
                relatorio += "\nCódigo do departamento: " + departamentos[i].getCodigo();
                
                if (departamentos[i].getContador() > 0){
                    
                    relatorio += "\nFuncionários:";
                    
                    for (int j = 0; j < departamentos[i].getContador(); j++){
                        
                        relatorio += "\nNome: " + departamentos[i].funcs[j].getNome();
                        
                    }
                
                    relatorio += "\nGasto total: " + departamentos[i].calcularSalarioDeTodosFuncionarios();
                    
                }
                
                encontrado = true;
                
            }
        }
        
        if (encontrado == false){
            JOptionPane.showMessageDialog(null, "Não foi encontrado o departamento com esse código");
        }
        
        
        return relatorio;
    }
    
    public String BuscarUmFuncionáriosPeloCódigo(String codigo){
        
        boolean encontrado = false;
        String relatorio = "";
        
        for (int i = 0; i < contador; i++){
            for (int j = 0; j < departamentos[i].getContador(); j++){
            
            if (departamentos[i].funcs[j].getCodigo().equals(codigo)){
                
                relatorio += "\nInformações:\n";
                relatorio += departamentos[i].funcs[j].exibirInformacoes();
                encontrado = true;
                }
            }
        }
        
        if (encontrado == false){
            JOptionPane.showMessageDialog(null, "Não foi encontrado funcionário com esse código");
        }
        
        return relatorio;
        
    }
    public String BuscarUmFuncionáriosPeloNome(String nome){
        
        boolean encontrado = false;
        String relatorio = "";
        
        for (int i = 0; i < contador; i++){
            for (int j = 0; j < departamentos[i].getContador(); j++){
            
            if (departamentos[i].funcs[j].getNome().equals(nome)){
                
                relatorio += "\nInformações:\n";
                relatorio += departamentos[i].funcs[j].exibirInformacoes();
                encontrado = true;
                }
            }
        }
        
        if (encontrado == false){
            JOptionPane.showMessageDialog(null, "Não foi encontrado funcionário com esse nome");
        }
        
        return relatorio;
    }

    public int verificarSeExisteDepartamento(String dep) {
        
        for (int i = 0; i < contador; i++)
        {
            if (departamentos[i].getCodigo().equals(dep)){
                return 1;
            }    
        }
        
        return 0;
        
    }
    
    
}
