package ejercicio2;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio2 {

    public static void main(String[] args) {

        ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>(5);

        listaEdificios.add(new Polideportivo(1500, "Poli 1"));
        listaEdificios.add(new Polideportivo(2500, "Poli 2"));
        listaEdificios.add(new Polideportivo(3500, "Poli 3"));
        listaEdificios.add(new EdificioOficinas(10, 2000));
        listaEdificios.add(new EdificioOficinas(8, 2200));

        ListIterator<Edificio> it = listaEdificios.listIterator();

        while (it.hasNext()) {
            Edificio objEdificio = it.next();
            System.out.println(objEdificio.toString());
        }
    }

}
