
public class Main {

    public static void main(String[] args) {
        
        Peca p1 = new Peca("Radio", 19.3f, 20.9f);
        
        
        System.out.println("PECA BR: " + p1.calcularPreco());
        
        p1.exibir();
        
        PecaImportada p2 = new PecaImportada(30.1f, 28.5f, "Cambio", 32.0f, 25.2f);
        
        System.out.println("PECA IMPORTADA: " + p2.calcularPreco());
        
        p2.exibir();
        
    }

    
}
