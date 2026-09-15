package ejercicio1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		Empleado[] empleados = new Empleado[5];
		
		empleados[0] = new Empleado ( "12345678A", // dni
				"Juan", // nombre
				"Pérez", // apellido
				 LocalDate.of(2000, 12, 15), // fecha de nacimiento (Año, Mes, Día)
				"Masculino", // genero
				"Calle Falsa 123", // direccion
				"+34600112233", // telefono
				"juan.perez@email.com", // email
				"Desarrollador Java" // puesto	
		);
		
		empleados[1] = new Empleado ("38456123", "Alejandro", "Rodríguez", LocalDate.of(1994, 8, 12), "Masculino", "Santa Fe 1024", "1154879632", "ale.rod@gmail.com", "Supervisor");
		empleados[2] = new Empleado("45012364", "Sofía", "Martínez", LocalDate.of(2004, 6, 18), "Femenino", "Belgrano 785", "1178965412", "sofia.mtz@gmail.com", "Asistente");
		empleados[3] = new Empleado();
		empleados[4] = new Empleado();

		for (Empleado emp : empleados) {
			System.out.println(emp.toString());
		}
		
		System.out.println("El próximo legajo será el " + Empleado.devuelveProximoLegajo());

	}

}

