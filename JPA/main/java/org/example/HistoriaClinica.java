package JPA.main.java.org.example;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@EqualsAndHashCode(exclude = "paciente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "paciente")
public class HistoriaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Descripcion;

    @OneToOne
    @JoinColumn(name = "paciente_id")

    private Paciente paciente;

    public void addPaciente(Paciente p){
        this.paciente = p;
    }
}
