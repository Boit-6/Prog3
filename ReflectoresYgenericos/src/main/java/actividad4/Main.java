package ReflectoresYgenericos.src.main.java.actividad4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = List.of("Hola", "Mundo", "Generics");
        List<Integer> lista2 = List.of(1, 2, 3, 4, 5);
        List<Double> lista3 = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

        Caja<String> caja = new Caja<>();
        caja.setLista(lista);
        caja.imprimirLista();
        Caja<Integer> caja2 = new Caja<>();
        caja2.setLista(lista2);
        caja2.imprimirLista();
        Caja<Double> caja3 = new Caja<>();
        caja3.setLista(lista3);
        caja3.imprimirLista();
    }
}