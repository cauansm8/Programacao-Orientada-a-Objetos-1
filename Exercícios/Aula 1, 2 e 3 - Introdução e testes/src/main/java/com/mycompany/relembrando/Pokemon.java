
package com.mycompany.relembrando;


public class Pokemon {
    
    public String nome;
    public int hp;
    public String ataque;
    public boolean vivo;
        
        
    public Pokemon () {
        this.vivo = false;
        this.hp = 0;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nome=" + nome + ", hp=" + hp + ", ataque=" + ataque + ", vivo=" + vivo + '}';
    }
        
        
    public void atacar(){
        System.out.println("O pokemon " + this.nome + " esta atacando com " + this.ataque);
    }
    
    public void defender(){
        System.out.println("O pokemon " + this.nome + " se esquivou do ataque");
    }
        
    public void reviver(){
        this.vivo = true;
        this.hp++;
    }
        
        
}
