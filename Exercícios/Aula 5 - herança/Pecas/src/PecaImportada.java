
public class PecaImportada extends Peca{
    
    private float taxaImportacao;
    private float taxaFrete;

    public PecaImportada(float taxaImportacao, float taxaFrete, String nome, float custo, float lucro) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    public PecaImportada(){
        
    }
    
    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public float getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(float taxaFrete) {
        this.taxaFrete = taxaFrete;
    }
    
    @Override
    public float calcularPreco(){
        return custo + lucro + taxaFrete + taxaImportacao;
    }
    
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("Taxa de importacao: " + getTaxaImportacao() + 
                " Frete: " + getTaxaFrete());
    }
    
}
