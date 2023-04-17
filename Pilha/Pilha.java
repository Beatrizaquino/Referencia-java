package Pilha;

public class Pilha {

    public Object[] pilha;
    public int posicao;

    public Pilha() {
        this.posicao = -1;
        this.pilha = new Object[100];
    }

    public boolean vazia() {
        if (this.posicao == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        if (this.vazia()) {
            return 0;
        }
        return this.posicao + 1;
    }


    public Object desempilhar() {
        //pop
        if (vazia()) {
            return null;
        }
        return this.pilha[this.posicao--];
    }

    public void empilhar(Object valor) {
        if (this.posicao < this.pilha.length - 1) {
            this.pilha[++posicao] = valor;
        }
    }

    public static void main(String args[]) {
        Pilha p = new Pilha();
        p.empilhar("Cachaça ");
        p.empilhar("Cerveja ");
        p.empilhar("Energético");
        p.empilhar("Rum");
        p.empilhar(15);
                while (p.vazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}