package Tp1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    List<Estudiante> estudiantes = new ArrayList();
    Estudiante e1 = new Estudiante("Belen", 22, "Ingenieria en sistemas");
    Estudiante e2 = new Estudiante("Matias", 25, "Medicina");
    Estudiante e3 = new Estudiante("Guillermo", 19, "Programacion");
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        System.out.println(estudiantes);
    }
}