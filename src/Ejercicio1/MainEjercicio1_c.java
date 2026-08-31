package Ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_c{

	public static void main(String[] args) {
		TreeSet<Empleado> empleados = new TreeSet<>();

		empleados.add(new Empleado("40123876", "Luciano", "Fernandez", LocalDate.of(1998, 3, 15),
		        "Masculino", "Av. Corrientes 1540", "11-5234-7812", "luciano.fernandez@utnfrgp.com", "Programador"));
		empleados.add(new Empleado("38765432", "Martina", "Rossi", LocalDate.of(1995, 8, 21),
		        "Femenino", "Av. Cabildo 2231", "11-6123-4598", "martina.rossi@utnfrgp.com", "Diseñadora"));
		empleados.add(new Empleado("42156789", "Nicolas", "Pereyra", LocalDate.of(2000, 12, 4),
		        "Masculino", "Lavalle 875", "11-4789-3214", "nicolas.pereyra@utnfrgp.com", "Soporte Tecnico"));
		empleados.add(new Empleado("36987451", "Valentina", "Acosta", LocalDate.of(1992, 6, 28),
		        "Femenino", "Maipu 1342", "11-5678-9043", "valentina.acosta@utnfrgp.com", "Analista"));
		empleados.add(new Empleado("41567234", "Tomas", "Benitez", LocalDate.of(1999, 10, 9),
		        "Masculino", "Av. Santa Fe 3200", "11-4987-6501", "tomas.benitez@utnfrgp.com", "Tester"));

		Iterator<Empleado> iterator = empleados.iterator();

		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			System.out.println(empleado);
		}
	}

}
