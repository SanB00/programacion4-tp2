package ejercicio1;

public class ExVerificarDni extends RuntimeException{
	public ExVerificarDni() {
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Dni invalido";
	}
	
}