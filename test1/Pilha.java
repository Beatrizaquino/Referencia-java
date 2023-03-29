package test1;
public class Pilha {
    
    public Object[] pilha;
    public int posicaoPilha;


    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[50];
    }


    public void empilhar(Object valor) {
        if( this.posicaoPilha < this.pilha.length - 1){
            this.pilha[++posicaoPilha] = valor;
        }
    } 

    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.empilhar("Sorvete de morango");
        p.empilhar("Sorvete de choolate");
        p.empilhar("Sorvete de avelã");
        p.empilhar("Sorvete de baunilha");
        p.empilhar(10);
        System.out.println(p);
}

}