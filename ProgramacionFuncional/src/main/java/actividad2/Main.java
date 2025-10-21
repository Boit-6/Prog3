package ProgramacionFuncional.src.main.java.actividad2;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Martin", 7, "Quimica");
        Alumno alumno2 = new Alumno("Felipe", 4, "Matematicas");
        Alumno alumno3 = new Alumno("Emma", 10, "Matemáticas");
        Alumno alumno4 = new Alumno("Lucia", 8, "Geografia");
        Alumno alumno5 = new Alumno("Agustin", 10, "Quimica");

        List<Alumno> alumnos = List.of(alumno1, alumno2, alumno3, alumno4, alumno5);
        System.out.println(alumnos);

        List<String> alumnosAprobados = alumnos.stream()
                .filter(alumno -> alumno.getNota() >= 7)
                .map(alumno -> alumno.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(alumnosAprobados);

        OptionalDouble promedio = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average();
        if (promedio.isPresent()){
            System.out.println("El promedio de las notas es: " + promedio.getAsDouble());
        }

        Map<String, List<Alumno>> alumnosPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println(alumnosPorCurso);

        List<Alumno> mejoresPromedios = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(mejoresPromedios);
    }
}