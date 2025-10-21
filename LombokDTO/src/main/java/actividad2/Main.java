package actividad2;
public class Main {
    public static void main(String[]args){

        Usuario usuario = Usuario.builder()
                .id(1)
                .nombre("Pablo")
                .email("Pablo@gmail.com").build();

        Usuario usuario1 = Usuario.builder()
                .id(2)
                .nombre("Manuel")
                .email("Manuel@gmail.com")
                .build();

        System.out.println(usuario);
        System.out.println(usuario1);
    }
}
