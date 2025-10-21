//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package ReflectoresYgenericos.target.classes.Actividad3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaDeString = new Caja("Hola Mundo");
        Caja<Integer> cajaDeInteger = new Caja(1235);
        System.out.println("Caja de String: " + cajaDeString);
        System.out.println("Caja de Integer: " + cajaDeInteger);
        List lista = new ArrayList();
        lista.add("Hola");
        lista.add(123);
        System.out.println("Lista: " + lista);
    }
}
