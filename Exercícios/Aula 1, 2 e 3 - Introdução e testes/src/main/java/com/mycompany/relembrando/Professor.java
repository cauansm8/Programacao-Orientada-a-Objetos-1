
package com.mycompany.relembrando;


public class Professor extends Pessoa{
    private String curso;
    private int RA;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    @Override
    public String toString() {
        return "Professor{" + "curso=" + curso + ", RA=" + RA + '}';
    }
    
    
    
}
