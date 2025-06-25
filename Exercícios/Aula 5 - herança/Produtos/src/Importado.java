
public class Importado extends Produto{
    
    private float taxa;
    private float taxaImportacao;
    
    public Importado(){
        imposto = 10f;
        taxa = 5f;
        taxaImportacao = 5f;
    }

    public Importado(float taxa, float taxaImportacao, String descricao, float valor, float imposto) {
        super(descricao, valor, 10f);
        this.taxa = 5f;
        this.taxaImportacao = 5f;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
    
    
    
    
}
