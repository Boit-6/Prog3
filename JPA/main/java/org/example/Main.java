package JPA.main.java.org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidad");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Medicamento m1 = new Medicamento.MedicamentoBuilder()
                    .nombre("Paracetamol")
                    .droga("Acetaminofén")
                    .pesoEnGramos(500)
                    .build();

            Medicamento m2 = new Medicamento.MedicamentoBuilder()
                    .nombre("Amoxicilina")
                    .droga("Amoxicilina")
                    .pesoEnGramos(250)
                    .build();

            Medicamento m3 = new Medicamento.MedicamentoBuilder()
                    .nombre("Losartán")
                    .droga("Losartán potásico")
                    .pesoEnGramos(100)
                    .build();

            Paciente p1 = new Paciente.PacienteBuilder()
                    .nombre("Luciano")
                    .apellido("Fernandez")
                    .edad(29)
                    .DNI(45900345)
                    .obraSocial("Swiss Medical")
                    .fechaNacimiento(LocalDate.of(1996, 3, 15))
                    .sexo('M')
                    .build();

            Paciente p2 = new Paciente.PacienteBuilder()
                    .nombre("Carolina")
                    .apellido("Mendez")
                    .edad(42)
                    .DNI(38276433)
                    .obraSocial("OSDE")
                    .fechaNacimiento(LocalDate.of(1983, 11, 3))
                    .sexo('F')
                    .build();

            Paciente p3 = new Paciente.PacienteBuilder()
                    .nombre("Diego")
                    .apellido("Rojas")
                    .edad(36)
                    .DNI(40123456)
                    .obraSocial("PAMI")
                    .fechaNacimiento(LocalDate.of(1989, 1, 21))
                    .sexo('M')
                    .build();

            Medico mc1 = new Medico.MedicoBuilder()
                    .nombre("Valentina")
                    .apellido("Suarez")
                    .edad(31)
                    .especialidad("Pediatría")
                    .matricula("MP14231")
                    .build();

            Medico mc2 = new Medico.MedicoBuilder()
                    .nombre("Esteban")
                    .apellido("Quiroga")
                    .edad(48)
                    .especialidad("Dermatología")
                    .matricula("MP28744")
                    .build();

            Medico mc3 = new Medico.MedicoBuilder()
                    .nombre("Sofía")
                    .apellido("Ledesma")
                    .edad(39)
                    .especialidad("Endocrinología")
                    .matricula("MP33210")
                    .build();

            Consulta c1 = new Consulta.ConsultaBuilder()
                    .fecha(LocalDate.of(2024, 10, 1))
                    .diagnostico("Alergia estacional")
                    .build();

            Consulta c2 = new Consulta.ConsultaBuilder()
                    .fecha(LocalDate.of(2024, 9, 25))
                    .diagnostico("Hipotiroidismo")
                    .build();

            Consulta c3 = new Consulta.ConsultaBuilder()
                    .fecha(LocalDate.of(2024, 8, 10))
                    .diagnostico("Infección respiratoria")
                    .build();

            Consulta c4 = new Consulta.ConsultaBuilder()
                    .fecha(LocalDate.of(2024, 7, 12))
                    .diagnostico("Dermatitis crónica")
                    .build();

            HistoriaClinica h1 = new HistoriaClinica.HistoriaClinicaBuilder()
                    .Descripcion("Historial clínico de Luciano Fernandez")
                    .build();

            HistoriaClinica h2 = new HistoriaClinica.HistoriaClinicaBuilder()
                    .Descripcion("Historial clínico de Carolina Mendez")
                    .build();

            HistoriaClinica h3 = new HistoriaClinica.HistoriaClinicaBuilder()
                    .Descripcion("Historial clínico de Diego Rojas")
                    .build();

            mc1.addConsulta(c1);
            mc2.addConsulta(c2);
            mc3.addConsulta(c3);
            mc3.addConsulta(c4);

            p1.addMedicamento(m1);
            p1.addMedicamento(m3);
            p2.addMedicamento(m2);
            p3.addMedicamento(m1);

            p1.addConsulta(c1);
            p2.addConsulta(c2);
            p3.addConsulta(c3);
            p3.addConsulta(c4);

            h1.addPaciente(p1);
            h2.addPaciente(p2);
            h3.addPaciente(p3);

            em.persist(p1);
            em.persist(p2);
            em.persist(p3);
            em.persist(m1);
            em.persist(m2);
            em.persist(m3);
            em.persist(h1);
            em.persist(h2);
            em.persist(h3);
            em.persist(c1);
            em.persist(c2);
            em.persist(c3);
            em.persist(c4);
            em.persist(mc1);
            em.persist(mc2);
            em.persist(mc3);

            em.getTransaction().commit();

            System.out.println("\n ENTIDADES GUARDADAS \n");

            System.out.println("\n Lista de Médicos en BD:");
            List<Medico> medicos = em.createQuery("SELECT m FROM Medico m", Medico.class).getResultList();
            medicos.forEach(System.out::println);

            System.out.println("\n Lista de Pacientes en BD:");
            List<Paciente> pacientes = em.createQuery("SELECT p FROM Paciente p", Paciente.class).getResultList();
            pacientes.forEach(System.out::println);

            System.out.println("\n Lista de Consultas en BD:");
            List<Consulta> consultas = em.createQuery("SELECT c FROM Consulta c", Consulta.class).getResultList();
            consultas.forEach(System.out::println);

            System.out.println("\n Lista de Medicamentos en BD:");
            List<Medicamento> medicamentos = em.createQuery("SELECT m FROM Medicamento m", Medicamento.class).getResultList();
            medicamentos.forEach(System.out::println);

            System.out.println("\n Lista de Historias Clínicas en BD:");
            List<HistoriaClinica> historiasClinicas = em.createQuery("SELECT h FROM HistoriaClinica h", HistoriaClinica.class).getResultList();
            historiasClinicas.forEach(System.out::println);

            System.out.println("\n\n");

            System.out.println("3. Listar todos los pacientes mayores de 30 años.");
            List<Paciente> pacientesM30 = em.createQuery("SELECT p FROM Paciente p WHERE edad > 30", Paciente.class).getResultList();
            pacientesM30.forEach(System.out::println);

            System.out.println("\n\n");

            System.out.println("4. Obtener todas las consultas realizadas por un médico específico.");
            Medico medicoC = em.createQuery("SELECT m FROM Medico m WHERE m.id = 2", Medico.class).getSingleResult();
            System.out.println(medicoC.getNombre() + " y sus consultas:");
            medicoC.getConsultas().forEach(System.out::println);

            System.out.println("\n\n");

            System.out.println("5. Mostrar todos los medicamentos asociados a un paciente.");
            Paciente pacienteM = em.createQuery("SELECT p FROM Paciente p WHERE p.id = 1", Paciente.class).getSingleResult();
            System.out.println("Medicamentos asociados a: " + pacienteM.getNombre());
            pacienteM.getMedicamentos().forEach(System.out::println);

            System.out.println("\n\n");

            System.out.println("6. Listar las consultas con su diagnóstico y el nombre del paciente");
            List<Paciente> pacientesCD = em.createQuery("SELECT p FROM Paciente p", Paciente.class).getResultList();
            pacientesCD.forEach(pacienteCD -> {
                System.out.println("Consulta/s: " + pacienteCD.getConsultas() + " | Nombre del paciente: " + pacienteCD.getNombre());
            });

            System.out.println("\n\n");

            System.out.println("7. Calcular el promedio de edad de los pacientes.");
            Double edadPro = em.createQuery("SELECT ROUND(AVG(edad)) AS edad_promedio FROM Paciente p", Double.class).getSingleResult();
            System.out.println("Edad promedio de los pacientes: " + edadPro);

            System.out.println("\n\n");

            System.out.println("8. Listar todos los pacientes que tienen una obra social específica.");
            List<Paciente> pacientesOS = em.createQuery("SELECT p FROM Paciente p WHERE obraSocial = 'OSDE'", Paciente.class).getResultList();
            pacientesOS.forEach(System.out::println);

            System.out.println("\n\n");

            System.out.println("9. Mostrar los médicos y la cantidad de consultas que atendieron.");
            List<Medico> medicosCA = em.createQuery("SELECT m FROM Medico m", Medico.class).getResultList();
            medicosCA.forEach(medicoCA -> {
                System.out.println(medicoCA + " | Cantidad de consultas: " + medicoCA.getConsultas().size());
            });

            System.out.println("\n\n");

            System.out.println("10. Obtener todos los pacientes junto con la descripción de su historia clínica.");
            List<HistoriaClinica> historiaClinicaP = em.createQuery("SELECT h FROM HistoriaClinica h", HistoriaClinica.class).getResultList();
            historiaClinicaP.forEach(historiaClinica -> {
                System.out.println(historiaClinica.getPaciente() + " | " + historiaClinica.getDescripcion());
            });

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
