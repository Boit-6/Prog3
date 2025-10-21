package toString.Tp4;

import toString.Tp3.Producto;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[]args){

        Producto p1 = new Producto(1, "Iphone 17", 1000000);
        Producto p2 = new Producto(2, "Monitor", 190000);
        Producto p3 = new Producto(1, "PC", 30000);
        Producto p4 = new Producto(3, "AirFrier", 200000);
        Producto p5 = new Producto(2, "Reloj digital", 70000);
        Set<Producto> productos = new HashSet<>();

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        for (Producto producto : productos){
            System.out.println(producto);
        }
    }
}