package ejercicio1;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		verificarPersona("AA202020");
		verificarPersona("20202020");
	
	}
	
	public static void verificarPersona(String dni) 
	{
		try {
			Persona p= new Persona();
			p.setDni(dni);
			
			Persona.exVerificarDNI(p.getDni());
			
			System.out.println("Persona agregada correctamente");
		}
		catch(ExVerificarDni ex){
			System.out.println("Persona no agregada por no verificar el DNI");
		}
		
	}
 
}
