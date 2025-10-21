//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package ReflectoresYgenericos.target.classes.Actividad2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> personaClass = Persona.class;
            Constructor<?> constructor = personaClass.getDeclaredConstructor(String.class, Integer.TYPE);
            System.out.println(constructor);
            Object persona = constructor.newInstance("Pedro", 22);
            Field field = personaClass.getDeclaredField("nombre");
            field.setAccessible(true);
            field.set(persona, "Ricardo");
            Method methodMostrarInfo = personaClass.getMethod("mostrarInfo");
            methodMostrarInfo.invoke(persona);
            Method methodSaludar = personaClass.getMethod("saludar");
            methodSaludar.setAccessible(true);
            String saludo = (String)methodSaludar.invoke(persona);
            System.out.println(saludo);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
