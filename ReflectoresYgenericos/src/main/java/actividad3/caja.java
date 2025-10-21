package ReflectoresYgenericos.src.main.java.actividad3;

public class caja <T>{

    private T contenido;

    public caja(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "contenito=" + contenido +
                '}';
    }
}