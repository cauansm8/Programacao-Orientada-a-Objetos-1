/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cauan.simoes_unesp
 */
public class Departamento {
    
    private int tamanhoMax = 5;
    private int codigo;
    
    private float salario = 0;
  
    
    private int contadorFunTec = 0;
    private int contadorFunDoc = 0;
    
    
    
    public FunTecnico [] conjFunTecnicos = new FunTecnico[tamanhoMax];
    public FunDocente [] conjFunDocentes = new FunDocente[tamanhoMax];

    
    
    public Departamento(int codigo) {
        this.codigo = codigo;
    }

    public float getSalario(){
        return salario;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setConjFuncTecnicos(FunTecnico funTecnico) {
        this.conjFunTecnicos[contadorFunTec] = funTecnico;
       
        salario += funTecnico.getSalario();
        contadorFunTec++;
        
    }

    public void setConjFunDocentes(FunDocente funDocente) {
        this.conjFunDocentes[contadorFunDoc] = funDocente;
        
        salario += funDocente.getSalario();
        contadorFunDoc++;
    }

    public void listarFuncDocentes(){
        for (int i = 0; i < contadorFunDoc; i++){
            System.out.println("NOME: " + conjFunDocentes[i].getNome());
        }
    }

    public void listarFuncTecnicos(){
        for (int i = 0; i < contadorFunTec; i++){
            System.out.println("NOME: "+conjFunTecnicos[i].getNome());
        }
    }

    public void listarFuncNaFaixaSalarial(float salario1, float salario2){
        for (int i = 0; i < contadorFunDoc; i++){
            if (conjFunDocentes[i].getSalario() >= salario1 && conjFunDocentes[i].getSalario() <= salario2){
                System.out.println("Funcionario: " + conjFunDocentes[i].getNome() + " " + conjFunDocentes[i].getSalario());
            }
        }
        
        for (int i = 0; i < contadorFunTec; i++){
            if (conjFunTecnicos[i].getSalario() >= salario1 && conjFunTecnicos[i].getSalario() <= salario2){
                System.out.println("Funcionario: " + conjFunTecnicos[i].getNome() + " " + conjFunTecnicos[i].getSalario());
            }
        }
    }



    
}
