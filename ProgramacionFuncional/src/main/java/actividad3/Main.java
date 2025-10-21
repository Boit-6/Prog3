package ProgramacionFuncional.src.main.java.actividad3;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){

        Producto producto1 = new Producto("Pc", "Electrónica", 500, 3);
        Producto producto2 = new Producto("Tortita", "Comida", 1, 100);
        Producto producto3 = new Producto("Lapicera", "Libreria", 2, 150);
        Producto producto4 = new Producto("Laptop", "Electrónica", 200, 8);
        Producto producto5 = new Producto("Camisa", "Ropa", 15.25, 100);
        Producto producto6 = new Producto("Pantalones", "Ropa", 90, 40);

        List<Producto> productos = List.of(producto1, producto2, producto3, producto4, producto5, producto6);
        List<Producto> productosPrecioMayorA100 = productos.stream()
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .filter(producto -> producto.getPrecio() > 100)
                .collect(Collectors.toList());
        System.out.println(productosPrecioMayorA100);

        Map<String, Double> productosPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingDouble(Producto::getStock)));
        System.out.println(productosPorCategoria);

        String productosSeparados = productos.stream()
                .map(producto -> producto.getNombre() + " $" + producto.getPrecio())
                .collect(Collectors.joining(" - "));
        System.out.println(productosSeparados);

        Map<String, Double> promedioPrecioCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)));
        System.out.println(promedioPrecioCategoria);
    }
}
