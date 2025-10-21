package toString.Tp3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[]args){

        Producto p1 = new Producto(1, "Iphone 17", 1000000);
        Producto p2 = new Producto(2, "Monitor", 190000);
        Producto p3 = new Producto(1, "PC", 30000);
        List <Producto> productos = new ArrayList<>();

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        if (!productos.contains(p1)){
            productos.add(p1);
        }
        if (!productos.contains(p2)){
            productos.add(p2);
        }
        if (!productos.contains(p3)){
            productos.add(p3);
        }
        for (Producto producto : productos){
            System.out.println(producto);
        }
    }
}
