package Tp2;

import Tp1.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList();
        Estudiante e1 = new Estudiante("Belen", 22, "Ingenieria en sistemas");
        Estudiante e2 = new Estudiante("Matias", 25, "Medicina");
        Estudiante e3 = new Estudiante("Guillermo", 19, "Programacion");
        Curso c1 = new Curso("Farmacologia");
        Curso c2 = new Curso("Contabilidad");
        Curso c3 = new Curso("Legislación");
        c1.getListaDeEstudiante().add(e1);
        c1.getListaDeEstudiante().add(e2);
        c2.getListaDeEstudiante().add(e3);
        c3.getListaDeEstudiante().add(e1);
        c3.getListaDeEstudiante().add(e2);
        c3.getListaDeEstudiante().add(e3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}