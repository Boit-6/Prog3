package JPA.main.java.org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@EqualsAndHashCode(exclude =  "consultas")
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude =  "consultas")
public class Medico extends Base{
    private String nombre;
    private String apellido;
    private int edad;
    private String especialidad;
    private String matricula;

    @OneToMany
    @JoinColumn(name = "medico_id")
    @Builder.Default
    private Set<Consulta> consultas = new HashSet<>();

    public void addConsulta(Consulta c){
        consultas.add(c);
    }}
