package LombokDTO.src.main.java.actividad3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){

        Producto p1 = new Producto(1, "producto1", 120000, "autor1");
        Producto p2 = new Producto(2, "producto2", 130000, "autor2");
        Producto p3 = new Producto(3, "producto3", 100000, "autor3");
        Producto p4 = new Producto(4, "producto4", 200000, "autor4");

        ProductoDTO DTO1 = new ProductoDTO(p1.getCodigo(), p1.getNombre(), p1.getPrecio(), p1.getAutor());
        ProductoDTO DTO2 = new ProductoDTO(p2.getCodigo(), p2.getNombre(), p2.getPrecio(), p2.getAutor());
        ProductoDTO DTO3 = new ProductoDTO(p3.getCodigo(), p3.getNombre(), p3.getPrecio(), p3.getAutor());
        ProductoDTO DTO4 = new ProductoDTO(p4.getCodigo(), p4.getNombre(), p4.getPrecio(), p4.getAutor());

        List<ProductoDTO> productosDTO = new ArrayList<>();

        productosDTO.add(DTO1);
        productosDTO.add(DTO2);
        productosDTO.add(DTO3);
        productosDTO.add(DTO4);

        for (ProductoDTO productoDTO : productosDTO){
            System.out.println(productoDTO);
        }
    }
}