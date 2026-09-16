package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona {
	
	   // Atributos

		private final int legajo;
		private String puesto;
		
		private static int contLegajo = 999;
		
		//Constructores
	
		public Empleado() {
			super();
			legajo = 0;
			puesto = " ";
		}

		public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email, String puesto) 
		{
			super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
			this.puesto = puesto;
			legajo = ++contLegajo;
		}
		
		//Metodo

		public static int devuelveProximoLegajo() {
			return contLegajo + 1;
		}

		// Getters y Setters
		public int getLegajo() {
			return legajo;
		}

		public String getPuesto() {
			return puesto;
		}

		public void setPuesto(String puesto) {
			this.puesto = puesto;
		}

		// ToString

		@Override
		public String toString() {
			return "EMPLEADO legajo: " + legajo + ", puesto: " + puesto + " | " + super.toString();
		}

}
