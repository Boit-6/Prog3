package actividad4;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){

        Producto p1 = new Producto(1, "producto1", 120000);
        Producto p2 = new Producto(2, "producto2", 130000);
        Producto p3 = new Producto(3, "producto3", 10000);
        Producto p4 = new Producto(4, "producto4", 200000);

        ProductoRecord pr1 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord pr2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoRecord pr3 = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio());
        ProductoRecord pr4 = new ProductoRecord(p4.getCodigo(), p4.getNombre(), p4.getPrecio());

        List<ProductoRecord> productosRecord = new ArrayList<>();
        productosRecord.add(pr1);
        productosRecord.add(pr2);
        productosRecord.add(pr3);
        productosRecord.add(pr4);

        productosRecord.forEach(System.out::println);
    }
}