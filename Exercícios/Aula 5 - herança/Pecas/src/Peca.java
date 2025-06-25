
public class Peca {

    protected String nome;
    protected float custo;
    protected float lucro;

    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public Peca(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    
    public float calcularPreco(){   
        return custo + lucro;   
    }
    
    public void exibir(){
        System.out.println("Nome: " + getNome() + " Custo: " + 
                getCusto() + " Lucro: " + getLucro());
    
    
    }
    
    
}
