public class PrincipalFila {
    public static void main(String[] args){
        Fila fila = new Fila();

        fila.add("Maria");
        fila.add("Lulu");
        fila.add("Marcia");
        fila.add("Carlinhos");

        System.out.println("Primiero da fila" + fila.get());
    }
}
