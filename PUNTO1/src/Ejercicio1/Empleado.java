package Ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona {
	private final int legajo;
	private String puesto;
	
	// Variable static
	private static int cont = 1000;
	
	//Constructors
	
	public Empleado()
	{
		super();
		legajo = cont;
		cont++; 
		puesto = " Sin Puesto! ";
	}
	
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email, String puesto)
	{
		super(dni,nombre,apellido,fechaNacimiento,genero,direccion,telefono,email);
		this.legajo = cont;
		cont++; 
		this.puesto = puesto;
	}
	
	//metodos
	public static int devuelveProximoLegajo() {
		return cont;
	}
	
	
	// setter y getter
	
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empledo - Legajo: " + legajo + " " +  super.toString() + " - Puesto: " + puesto;
	}
}
