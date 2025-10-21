package toString.Tp2;

import toString.Tp1.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> listaDeEstudiante = new ArrayList();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListaDeEstudiante() {
        return this.listaDeEstudiante;
    }

    public void setListaDeEstudiante(List<Estudiante> listaDeEstudiante) {
        this.listaDeEstudiante = listaDeEstudiante;
    }

    public String toString() {
        return "Curso{\nnombre ='" + this.nombre + "'\nlistaDeEstudiante = \n" + this.listaDeEstudiante + "}";
    }
}