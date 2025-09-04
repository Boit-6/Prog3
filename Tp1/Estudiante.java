package Tp1;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String toString() {
        String var10000 = this.getNombre();
        return "Tp1.Estudiante{ nombre = " + var10000 + ", edad = " + this.getEdad() + ", carrera = " + this.getCarrera() + "}\n";
    }
}
