package colecciones.tp3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void  main(String[]args){

        HashMap<String, Curso> cursos = new HashMap<>();

        Curso c1 = new Curso("Quimica", "Lautaro Martinez");
        Curso c2 = new Curso("Fisica", "Ricardo Ford");
        Curso c3 = new Curso("Matematica", "Cristian Mut");

        cursos.put("Quimica", c1);
        cursos.put("Matematica", c3);
        cursos.put("Fisica", c2);

        for (Map.Entry<String, Curso> entry : cursos.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}