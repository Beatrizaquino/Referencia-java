public class Fila {
    
  private ListaLigada lista;

  //metodo construtor
  //assim listaLigada sera instanciada
  public Fila(){
    this.lista = new ListaLigada();
  }

  public void enquere( String novoValor){
        this.lista.add(novoValor);
  }

  public void dequeue(){
        this.lista.remove(this.get());
  }

  public String get() {
    return this.lista.getPrimeiro().getValor();
  }

public void add(String string) {
}
    
}
