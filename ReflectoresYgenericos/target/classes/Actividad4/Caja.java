//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package ReflectoresYgenericos.target.classes.Actividad4;

import java.util.List;

public class Caja<T> {
    private List<T> lista;

    public List<T> getLista() {
        return this.lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public void imprimirLista() {
        for(T elemento : this.lista) {
            System.out.println(elemento);
        }

    }

    public String toString() {
        return "Caja{lista=" + this.lista + "}";
    }
}
