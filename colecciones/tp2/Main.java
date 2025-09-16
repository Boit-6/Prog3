package colecciones.tp2;

import java.util.HashSet;

public class Main {
    public static void main(String[]args){

        Producto p1 = new Producto(1, "Auriculares");
        Producto p2 = new Producto(2, "Cámara de Seguridad");
        Producto p3 = new Producto(3, "Lampara de sal");
        Producto p4 = new Producto(1, "Auriculares");
        Producto p5 = new Producto(2, "Cámara de Seguridad");

        HashSet<Producto> hashSet = new HashSet<>();

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);
        hashSet.add(p5);

        for (Producto producto : hashSet){
            System.out.println(producto);
        }
    }
}