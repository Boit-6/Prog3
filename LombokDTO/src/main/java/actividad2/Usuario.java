package actividad2;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Usuario {

    private int id;
    private String nombre;
    private String email;
}