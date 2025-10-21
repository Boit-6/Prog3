//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package ReflectoresYgenericos.target.classes.Actividad3;

public class Caja<T> {
    private T contenido;

    public Caja(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return this.contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public String toString() {
        return "Caja{contenito=" + this.contenido + "}";
    }
}
