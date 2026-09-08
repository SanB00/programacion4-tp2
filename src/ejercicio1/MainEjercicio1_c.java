package ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_c {

    public static void main(String[] args) {
        TreeSet<Empleado> listaEmpleados = new TreeSet<Empleado>();

        listaEmpleados.add(new Empleado("12345678", "Ana", "Pérez", LocalDate.of(1995, 5, 12), "Femenino",
                "Calle Falsa 123", "1122334455", "ana.perez@email.com", "Desarrolladora"));

        listaEmpleados.add(new Empleado("87654321", "Carlos", "Gómez", LocalDate.of(1988, 8, 22), "Masculino",
                "Av. Siempre Viva 742", "1166778899", "carlos.gomez@email.com", "Analista"));

        listaEmpleados.add(new Empleado("11223344", "María", "Rodríguez", LocalDate.of(1993, 2, 10), "Femenino",
                "Belgrano 456", "1144556677", "maria.rodriguez@email.com", "Gerente"));

        listaEmpleados.add(new Empleado("44332211", "Juan", "López", LocalDate.of(1998, 11, 30), "Masculino",
                "San Martín 789", "1199887766", "juan.lopez@email.com", "Soporte Técnico"));

        listaEmpleados.add(new Empleado("99887766", "Lucía", "Fernández", LocalDate.of(1983, 7, 19), "Femenino",
                "Mitre 321", "1155443322", "lucia.fernandez@email.com", "Diseñadora UX"));

        // Punto 6.b

        Iterator<Empleado> it = listaEmpleados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
