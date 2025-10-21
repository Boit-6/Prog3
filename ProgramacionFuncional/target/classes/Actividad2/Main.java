
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ProgramacionFuncional.target.classes.Actividad2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", 8, "Matemáticas");
        Alumno alumno2 = new Alumno("María", 6, "Historia");
        Alumno alumno3 = new Alumno("Luis", 7, "Matemáticas");
        Alumno alumno4 = new Alumno("Ana", 9, "Historia");
        Alumno alumno5 = new Alumno("Pedro", 5, "Matemáticas");
        List<Alumno> alumnos = List.of(alumno1, alumno2, alumno3, alumno4, alumno5);
        System.out.println(alumnos);
        List<String> alumnosAprobados = (List)alumnos.stream().filter((alumno) -> alumno.getNota() >= 7).map((alumno) -> alumno.getNombre().toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(alumnosAprobados);
        OptionalDouble promedio = alumnos.stream().mapToDouble(Alumno::getNota).average();
        if (promedio.isPresent()) {
            System.out.println("El promedio de las notas es: " + promedio.getAsDouble());
        }

        Map<String, List<Alumno>> alumnosPorCurso = (Map)alumnos.stream().collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println(alumnosPorCurso);
        List<Alumno> mejoresPromedios = (List)alumnos.stream().sorted(Comparator.comparingDouble(Alumno::getNota).reversed()).limit(3L).collect(Collectors.toList());
        System.out.println(mejoresPromedios);
    }
}

