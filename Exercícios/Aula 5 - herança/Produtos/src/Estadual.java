
public class Estadual extends Produto{
    
    public Estadual(){
        this.imposto = 10f;
    }

    public Estadual(String descricao, float valor, float imposto) {
        super(descricao, valor, 10f);
    }
    
    
    
}
