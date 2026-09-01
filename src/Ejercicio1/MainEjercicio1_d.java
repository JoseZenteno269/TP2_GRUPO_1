package Ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

    public static void main(String[] args) {

        HashSet<Persona> personas = new HashSet<>();

        personas.add(new Persona("40123876", "Luciano", "Fernandez", LocalDate.of(1998, 3, 15),
                "Masculino", "Av. Corrientes 1540", "11-5234-7812", "luciano.fernandez@utnfrgp.com"));
        personas.add(new Persona("38765432", "Martina", "Rossi", LocalDate.of(1995, 8, 21),
                "Femenino", "Av. Cabildo 2231", "11-6123-4598", "martina.rossi@utnfrgp.com"));
        personas.add(new Persona("42156789", "Nicolas", "Pereyra", LocalDate.of(2000, 12, 4),
                "Masculino", "Lavalle 875", "11-4789-3214", "nicolas.pereyra@utnfrgp.com"));
        personas.add(new Persona("36987451", "Valentina", "Acosta", LocalDate.of(1992, 6, 28),
                "Femenino", "Maipu 1342", "11-5678-9043", "valentina.acosta@utnfrgp.com"));
        personas.add(new Persona("40123876", "Luciano", "Fernandez", LocalDate.of(1998, 3, 15),
                "Masculino", "Av. Corrientes 1540", "11-5234-7812", "luciano.fernandez@utnfrgp.com")); // DNI repetido, no se agrega

        Iterator<Persona> iterator = personas.iterator();
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            System.out.println(persona);
        }

        System.out.println("Cantidad de personas en el set: " + personas.size());
    }
}