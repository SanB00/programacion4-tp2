package ejercicio2;

import java.util.ArrayList;
import java.util.ListIterator;

/**
Crear una clase llamada mainEjercicio2, con el método main. Dentro del
mismo crear un ArrayList que contenga tres polideportivos y dos edificios de
oficinas y utilizando un iterator, recorrer la colección y mostrar los atributos
de cada elemento.
*/
public class MainEjercicio2 {

    public static void main(String[] args) {
        ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>(5);
        Polideportivo objPolideportivo1 = new Polideportivo(1500,"Poli 1");
        Polideportivo objPolideportivo2 = new Polideportivo(2500,"Poli 2");
        Polideportivo objPolideportivo3 = new Polideportivo(3500,"Poli 3");

        EdificioOficinas objEdificioOficinas1 = new EdificioOficinas(10,2000);
        EdificioOficinas objEdificioOficinas2 = new EdificioOficinas(8,2200);

        listaEdificios.add(objPolideportivo1);
        listaEdificios.add(objPolideportivo2);
        listaEdificios.add(objPolideportivo3);
        listaEdificios.add(objEdificioOficinas1);
        listaEdificios.add(objEdificioOficinas2);

        ListIterator<Edificio> it = listaEdificios.listIterator();

        while (it.hasNext()) {
            Edificio objEdificio = it.next();
            System.out.println(objEdificio.toString());
        }
    }

}
