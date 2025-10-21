package ReflectoresYgenericos.src.main.java.actividad2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        try {

            Class<?> personaClass = Persona.class;

            Constructor<?> constructor = personaClass.getDeclaredConstructor(String.class, int.class);
            System.out.println(constructor);

            Object persona = constructor.newInstance("Belen",22);

            Field field = personaClass.getDeclaredField("nombre");
            field.setAccessible(true);
            field.set(persona, "Santiago");

            Method methodMostrarInfo = personaClass.getMethod("mostrarInfo");
            methodMostrarInfo.invoke(persona);

            Method methodSaludar = personaClass.getMethod("saludar");
            methodSaludar.setAccessible(true);

            String saludo = (String) methodSaludar.invoke(persona);
            System.out.println(saludo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
