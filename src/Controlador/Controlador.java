/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import ModeloDeDados.Departamento;
import ModeloDeDados.Funcionário;
import ModeloDeDados.Universidade;

/**
 *
 * @author Cauan
 */
public class Controlador {
    
    private Universidade universidade = new Universidade("UNESP");
    
    public int verificarSeExisteDepartamento(String dep){
        return universidade.verificarSeExisteDepartamento(dep);
    }
    
    
    public void AdicionarFuncionario(Funcionário func, String codigo)
    {
        universidade.AdicionarFuncionario(func, codigo);
    }
    
    public void AdicionarDepartamento(Departamento dep){
        universidade.AdicionarDepartamento(dep);
    }
    
    public String Geral(){
        String relatorio = universidade.Geral(); 
        return relatorio;
    }
    
    
    public String ResumoDosDepartamentos(){
        String relatorio = universidade.ResumoDosDepartamentos();
        return relatorio;
    }
    
    public String ResumoDosDepartamentosComGastoEmFaixaEspecífica(double faixaInicial, double faixaFinal){
        String relatorio = universidade.ResumoDosDepartamentosComGastoEmFaixaEspecífica(faixaInicial, faixaFinal);
        return relatorio;
    }
    
    public String FuncionáriosComSalárioEmFaixaEspecífica(double salarioInicial, double salarioFinal){
        String relatorio = universidade.FuncionáriosComSalárioEmFaixaEspecífica(salarioInicial, salarioFinal);
    
        return relatorio;
    }
    
    public String ExibirTodosOsFuncionários(){
        String relatorio = universidade.ExibirTodosOsFuncionários();
        
        return relatorio;
    }
    
    public String ExibirTodosOsTécnicos(){
       String relatorio = universidade.ExibirTodosOsTécnicos();
       return relatorio;
    }
    
    public String ExibirTodosOsDocentes(){
        String relatorio = universidade.ExibirTodosOsDocentes();
        return relatorio;
    }
    
    public String ExibirTodosOsDocentesEfetivos(){
        String relatorio = universidade.ExibirTodosOsDocentesEfetivos();
        return relatorio;
    }
    
    public String ExibirTodosOsDocentesSubstitutos(){
        String relatorio = universidade.ExibirTodosOsDocentesSubstitutos();
        return relatorio;
    }
    
    public String ExibirInformaçõesDeUmDepartamento(String codigo){
        String relatorio = universidade.ExibirInformaçõesDeUmDepartamento(codigo);
        return relatorio;
    }
    
    public String BuscarUmFuncionáriosPeloCódigo(String codigo){
        String relatorio = universidade.BuscarUmFuncionáriosPeloCódigo(codigo);
        return relatorio;
    }
    public String BuscarUmFuncionáriosPeloNome(String nome){
        String relatorio = universidade.BuscarUmFuncionáriosPeloNome(nome);
        return relatorio;
    }
    
    
    
    
}
