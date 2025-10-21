//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ProgramacionFuncional.target.classes.Actividad3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", "Electrónica", (double)120.5F, 10);
        Producto producto2 = new Producto("Camiseta", "Ropa", 250.99, 50);
        Producto producto3 = new Producto("Libro", "Educación", (double)150.75F, 30);
        Producto producto4 = new Producto("Teléfono", "Electrónica", (double)80.0F, 20);
        Producto producto5 = new Producto("Pantalones", "Ropa", (double)90.0F, 40);
        Producto producto6 = new Producto("Cuaderno", "Educación", (double)15.25F, 100);
        List<Producto> productos = List.of(producto1, producto2, producto3, producto4, producto5, producto6);
        List<Producto> productosPrecioMayorA100 = (List)productos.stream().sorted(Comparator.comparingDouble(Producto::getPrecio).reversed()).filter((producto) -> producto.getPrecio() > (double)100.0F).collect(Collectors.toList());
        System.out.println(productosPrecioMayorA100);
        Map<String, Double> productosPorCategoria = (Map)productos.stream().collect(Collectors.groupingBy(Producto::getCategoria, Collectors.summingDouble(Producto::getStock)));
        System.out.println(productosPorCategoria);
        String productosSeparados = (String)productos.stream().map((producto) -> {
            String var10000 = producto.getNombre();
            return var10000 + " $" + producto.getPrecio();
        }).collect(Collectors.joining(" - "));
        System.out.println(productosSeparados);
        Map<String, Double> promedioPrecioCategoria = (Map)productos.stream().collect(Collectors.groupingBy(Producto::getCategoria, Collectors.averagingDouble(Producto::getPrecio)));
        System.out.println(promedioPrecioCategoria);
    }
}

