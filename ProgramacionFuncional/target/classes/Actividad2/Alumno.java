//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ProgramacionFuncional.target.classes.Actividad2;


public class Alumno {
    private String nombre;
    private int nota;
    private String curso;

    public Alumno(String nombre, int nota, String curso) {
        this.nombre = nombre;
        this.nota = nota;
        this.curso = curso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return this.nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return "Alumno{nombre='" + this.nombre + "', nota=" + this.nota + ", curso='" + this.curso + "'}";
    }
}
