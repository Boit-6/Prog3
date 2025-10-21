package ReflectoresYgenericos.src.main.java.actividad4;


import java.util.List;

public class Caja <T>{

    private List<T> lista;

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public void imprimirLista() {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    @Override
    public String toString() {
        return "Caja{" +
                "lista=" + lista +
                '}';
    }
}