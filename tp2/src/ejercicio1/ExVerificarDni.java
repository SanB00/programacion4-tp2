package ejercicio1;

public class ExVerificarDni extends RuntimeException{
	
	public ExVerificarDni() 
	{
		
	}

	@Override
	public String getMessage() {
		
		return "Dni invalido";
	}
	
}