package colecciones.tp1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){

        Alumno a1 = new Alumno("Sebastian", 8.5);
        Alumno a2 = new Alumno("Tobias", 6);
        Alumno a3 = new Alumno("Jere", 9);

        List <Alumno> alumnos = new ArrayList<>();

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);

        for (Alumno alumno : alumnos){
            System.out.println(alumno);
        }
    }
}