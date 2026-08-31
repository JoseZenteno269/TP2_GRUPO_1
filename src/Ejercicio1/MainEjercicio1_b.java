package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<>();

		empleados.add(new Empleado("30111222", "Ana", "Gomez", LocalDate.of(1990, 5, 12),
				"Femenino", "Av. San Martin 1200", "11-4123-5678", "ana.gomez@utnfrgp.com", "Analista"));
		empleados.add(new Empleado("32222333", "Bruno", "Diaz", LocalDate.of(1988, 9, 23),
				"Masculino", "Belgrano 845", "11-4234-6789", "bruno.diaz@utnfrgp.com", "Desarrollador"));
		empleados.add(new Empleado("34333444", "Carla", "Lopez", LocalDate.of(1993, 2, 8),
				"Femenino", "Mitre 430", "11-4345-7890", "carla.lopez@utnfrgp.com", "Tester"));
		empleados.add(new Empleado("36444555", "Diego", "Romero", LocalDate.of(1985, 11, 17),
				"Masculino", "Sarmiento 975", "11-4456-8901", "diego.romero@utnfrgp.com", "Supervisor"));
		empleados.add(new Empleado("38555666", "Elena", "Torres", LocalDate.of(1996, 7, 30),
				"Femenino", "Rivadavia 2100", "11-4567-9012", "elena.torres@utnfrgp.com", "Administrativa"));

		Iterator<Empleado> iterator = empleados.iterator();

		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			System.out.println(empleado);
		}
	}
}
