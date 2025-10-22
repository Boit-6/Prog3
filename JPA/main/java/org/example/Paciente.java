package JPA.main.java.org.example;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@EqualsAndHashCode(exclude = {"medicamentos", "consultas"})
@Setter
@Getter
@ToString(exclude = {"medicamentos", "consultas"})
@NoArgsConstructor
@AllArgsConstructor
public class Paciente extends Base{
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private String obraSocial;
    private LocalDate fechaNacimiento;
    private char sexo;

    @ManyToMany
    @JoinTable(name = "paciente-medicamento",
    joinColumns = @JoinColumn(name = "paciente_id"),
    inverseJoinColumns = @JoinColumn(name = "medicamento_id"))
    @Builder.Default
    Set<Medicamento> medicamentos = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "paciente_id")
    @Builder.Default
    private Set<Consulta> consultas = new HashSet<>();

    public void addMedicamento(Medicamento m){
        medicamentos.add(m);
    }

    public void addConsulta(Consulta c){
        consultas.add(c);
    }
}
