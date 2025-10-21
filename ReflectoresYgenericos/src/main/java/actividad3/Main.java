package ReflectoresYgenericos.src.main.java.actividad3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        caja<String> cajaDeString = new caja<>("Hola Mundo");
        caja<Integer> cajaDeInteger = new caja<>(1235);

        System.out.println("Caja de String: " + cajaDeString);
        System.out.println("Caja de Integer: " + cajaDeInteger);

        List lista = new ArrayList<>();
        lista.add("Hola");
        lista.add(123);
        System.out.println("Lista: " + lista);

    }
}