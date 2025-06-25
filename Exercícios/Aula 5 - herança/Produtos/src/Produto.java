
public abstract class Produto {

    protected String descricao;
    protected float valor;
    protected float imposto;

    public Produto(){
        
    }

    public Produto(String descricao, float valor, float imposto) {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    
    
    
}
