package conta;


public class ContaCorrenteEspecial {

    private Long numero;
    private String titular;
    private float saldo;
    private float limite;

    public ContaCorrenteEspecial(){}
    
    public ContaCorrenteEspecial(Long numero, String titular, float saldo, float limite){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;   
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    
    
    
    
    
    
}
