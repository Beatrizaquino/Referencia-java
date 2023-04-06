public class Referencia {
    public static class Elo {
        String nome;
        Elo proximo;

        public Elo(String nome){
            this.nome = nome;
            this.proximo = null;
        }
    }

    public static class Corrente {
        Elo primeiro;

        public void adicioanrElo(Elo novo) {
            novo.proximo = primeiro;

            primeiro = novo;
        }

        public void printar(){
            Elo atual = primeiro;

            while(atual !=null) {
                System.out.println(atual.nome);

                atual = atual.proximo;
            }
        }

    }

    public static void main(String[] args) {
        testCorrente();
    }

    public static void testCorrente() {
        
        Corrente corrente = new Corrente();
    
        corrente.adicioanrElo(new Elo("Botato"));
        corrente.adicioanrElo(new Elo("Cenoura"));
        corrente.adicioanrElo(new Elo("Beterraba"));
        corrente.adicioanrElo(new Elo("Mandioca"));

        corrente.printar();
    }

    public static void testAula() {
        Elo primeiro = new Elo("Maria");

        primeiro.proximo = new Elo("João");

        Elo novo = new Elo("João");
        novo.proximo = primeiro;
        primeiro = novo;

        Elo atual = primeiro;
        while(atual != null) {
            System.out.println(atual.nome);

            atual = atual.proximo;
        }
    } 

}


