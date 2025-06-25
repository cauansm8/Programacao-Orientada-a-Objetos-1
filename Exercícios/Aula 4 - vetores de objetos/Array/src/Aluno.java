public class Aluno {
    
    private String nome;
    private String RA;
    private float t1;

    public Aluno(String nome, String RA, float t1) {
        this.nome = nome;
        this.RA = RA;
        this.t1 = t1;
    }


    
    
    public String aprovado(){
        if (t1 >= 5){
            return "APROVADO";
        }
        else {
            return "REPROVADO";
        }
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public float getT1() {
        return t1;
    }

    public void setT1(float t1) {
        this.t1 = t1;
    }
    
    
    
}
