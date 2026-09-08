package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_b {

    public static void main(String[] args) {
        System.out.println("Ejercicio 5.A");
        Empleado objEmpleado1 = new Empleado("11111", "raul", "alejandro", LocalDate.of(2000, 11, 10), "M", "calle 123",
                "1123", "A@mail.com", "cantante");

        Empleado objEmpleado2 = new Empleado("22222", "juan", "perez", LocalDate.of(95, 4, 15), "M",
                "avenida siempre viva 742", "2234", "juan@mail.com", "programador");

        Empleado objEmpleado3 = new Empleado("33333", "maria", "gomez", LocalDate.of(2020, 7, 22), "F",
                "calle belgrano 456", "3345", "maria@mail.com", "docente");

        Empleado objEmpleado4 = new Empleado("44444", "carlos", "lopez", LocalDate.of(2002, 2, 8), "M",
                "calle san martin 789", "4456", "carlos@mail.com", "ingeniero");

        Empleado objEmpleado5 = new Empleado("55555", "sofia", "martinez", LocalDate.of(1998, 5, 30), "F",
                "calle rivadavia 321", "5567", "sofia@mail.com", "diseñadora");

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(objEmpleado1);
        listaEmpleados.add(objEmpleado2);
        listaEmpleados.add(objEmpleado3);
        listaEmpleados.add(objEmpleado4);
        listaEmpleados.add(objEmpleado5);
        System.out.println("Ejercicio 5.B");

        /// Ejercicio 5.B : Mostrar la información de cada empleado utilizando un Iterator.

        ListIterator<Empleado> it = listaEmpleados.listIterator();

        while (it.hasNext()) {
            Empleado empleado = it.next();
            System.out.println(empleado.toString());
        }
    }
}
