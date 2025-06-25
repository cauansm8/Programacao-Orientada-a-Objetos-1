
public class Nacional extends Produto{
    
    private float taxa;
    
    public Nacional(){
        this.taxa = 5f;
        this.imposto = 10f;
    }

    public Nacional(float taxa, String descricao, float valor, float imposto) {
        super(descricao, valor, 10f);
        this.taxa = 5f;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
}
