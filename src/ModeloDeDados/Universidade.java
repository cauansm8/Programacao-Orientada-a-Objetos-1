/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDeDados;

import ArmazenamentoDeDados.DataBase;
import javax.swing.JOptionPane;
/**
 *
 * @author Cauan
 */
public class Universidade {
    
    private String nome;
    private static DataBase db = new DataBase();

    public Universidade(String nome) {
        this.nome = nome;
    }
    
    public void AdicionarFuncionario(Funcionário func, String codigo)
    {
        db.AdicionarFuncionario(func, codigo);
    }
    
    public void AdicionarDepartamento(Departamento dep){
        db.AdicionarDepartamento(dep);
    }
    
    public String Geral(){
        String relatorio = db.Geral();
        return relatorio;
    }
    
    
    public String ResumoDosDepartamentos(){
        String relatorio = db.ResumoDosDepartamentos();
        return relatorio;
    }
    
    public String ResumoDosDepartamentosComGastoEmFaixaEspecífica(double faixaInicial, double faixaFinal){
        String relatorio = db.ResumoDosDepartamentosComGastoEmFaixaEspecífica(faixaInicial, faixaFinal);
        return relatorio;
    }
    
    public String FuncionáriosComSalárioEmFaixaEspecífica(double salarioInicial, double salarioFinal){
        String relatorio = db.FuncionáriosComSalárioEmFaixaEspecífica(salarioInicial, salarioFinal);
        return relatorio;
    }
    
    public String ExibirTodosOsFuncionários(){
        String relatorio = db.ExibirTodosOsFuncionários();
        
        return relatorio;
    }
    
    public String ExibirTodosOsTécnicos(){
        String relatorio =  db.ExibirTodosOsTécnicos();
        return relatorio;
    }
    
    public String ExibirTodosOsDocentes(){
        String relatorio = db.ExibirTodosOsDocentes();
        return relatorio;
    }
    
    public String ExibirTodosOsDocentesEfetivos(){
        String relatorio = db.ExibirTodosOsDocentesEfetivos();
        return relatorio;
    }
    
    public String ExibirTodosOsDocentesSubstitutos(){
        String relatorio = db.ExibirTodosOsDocentesSubstitutos();
        return relatorio;
    }
    
    public String ExibirInformaçõesDeUmDepartamento(String codigo){
        String relatorio = db.ExibirInformaçõesDeUmDepartamento(codigo);
        return relatorio;
    }
    
    public String BuscarUmFuncionáriosPeloCódigo(String codigo){
        String relatorio = db.BuscarUmFuncionáriosPeloCódigo(codigo);
        return relatorio;
    }
    public String BuscarUmFuncionáriosPeloNome(String nome){
        String relatorio = db.BuscarUmFuncionáriosPeloNome(nome);
        return relatorio;
    }

    public int verificarSeExisteDepartamento(String dep) {
        return db.verificarSeExisteDepartamento(dep);
    }
}
