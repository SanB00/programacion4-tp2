package ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

    public static void main(String[] args) {

        HashSet<Persona> listaPersonas = new HashSet<Persona>();
        listaPersonas.add(new Persona("12345678", "Andrea", "López", LocalDate.of(1995, 4, 20), "F", "Calle 1", "1111",
                "andrea@mail.com"));
        listaPersonas.add(new Persona("42356767", "Maria", "Gonzalez", LocalDate.of(2003, 3, 17), "F", "Calle Saavedra",
                "1222", "mari@gmail.com"));
        listaPersonas.add(new Persona("23456789", "Bruno", "Martínez", LocalDate.of(1990, 8, 15), "M", "Calle 2",
                "2222", "bruno@mail.com"));
        listaPersonas.add(new Persona("34567890", "Camila", "Suárez", LocalDate.of(1998, 1, 30), "F", "Calle 3", "3333",
                "camila@mail.com"));
        listaPersonas.add(new Persona("45678901", "Diego", "Torres", LocalDate.of(1987, 11, 5), "M", "Calle 4", "4444",
                "diego@mail.com"));

        Iterator<Persona> it = listaPersonas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
