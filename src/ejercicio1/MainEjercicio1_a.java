package ejercicio1;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Persona p1= new Persona();
			p1.setDni("AA202020");
			Persona.exVerificarDNI(p1.getDni());
			System.out.println("Persona agregada correctamente");
		}
		catch(ExVerificarDni ex){
			System.out.println("Persona no agregada por no verificar el DNI");
		}
	}

}
