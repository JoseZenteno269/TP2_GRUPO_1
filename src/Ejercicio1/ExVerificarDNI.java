package Ejercicio1;

public class ExVerificarDNI extends RuntimeException {
	
	public ExVerificarDNI() 
	{
		
	}

	@Override
	public String getMessage() {
		return "Persona no agregada por no verificar el DNI";
	}
	
}
