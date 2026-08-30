package Ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		Persona persona = new Persona(); 
		
		try {
			persona.setDni("20202202");
			persona.setNombre("Lucia");
			persona.setApellido("Fernandez");
			persona.setFechaNacimiento(LocalDate.of(1997, 3, 14));
			persona.setGenero("Femenino");
			persona.setDireccion("Av. Rivadavia 2450");
			persona.setTelefono("11-4567-8901");
			persona.setEmail("lucia.fernandez@utnfrgp.com");
			
			if(Persona.VerificarDNI(persona.getDni())) {
				System.out.println("Persona agregada correctamente");
			}
			
		} 
		catch (ExVerificarDNI e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
