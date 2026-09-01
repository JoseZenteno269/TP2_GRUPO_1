package Ejercicio1;

import java.time.LocalDate;

public class Persona {

	private String dni; 
	private String nombre; 
	private String apellido; 
	private LocalDate fechaNacimiento; 
	private String genero; 
	private String direccion;
	private	String telefono;
	private String email;
	
	//Constructores
	
	public Persona()
	{
		dni = "99.999.999";
		nombre = "Sin nombre";
		apellido = "Sin apellido";
		fechaNacimiento = LocalDate.of(2025, 01, 01);
		genero = "Sin genero";
		direccion = "Sin direccion";
		telefono = "Sin telefono";
		email = "Sin email";
	}
	
	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email) 
	{
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	// Metodo estatico para verificar DNI
	
	public static boolean VerificarDNI(String Dni) throws ExVerificarDNI
	{
		Boolean auxDNI = Dni.length() == 8; 
		Boolean auxLetras = true;
		
		for (char c : Dni.toCharArray()) {
			if(Character.isLetter(c))
			{
				auxLetras = false;
				break; 
			}
		}
		
		if(!auxDNI || !auxLetras)
		{
			throw new ExVerificarDNI();
		}
		
		if(auxDNI && auxLetras)
		{
			return true;
		}
		
		return false;
	}
	
	// SETTERS Y GETTERS
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	// METODO TO STRING 
	@Override
	public String toString() {
		return String.format("DNI: %s - Nombre: %s - Apellido: %s - Fecha de Nacimiento: %s - Genero: %s - Direccion: %s - Telefono: %s - Email: %s", 
				dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email); 
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Persona otra = (Persona) obj;
	    return dni.equals(otra.dni);
	}

	@Override
	public int hashCode() {
	    return dni.hashCode();
	}
}
