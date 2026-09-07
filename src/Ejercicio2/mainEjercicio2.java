package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;


public class mainEjercicio2 {

    public static void main(String[] args) {

        ArrayList<Edificio> edificios = new ArrayList<>();

        //polideportivos
        edificios.add(new Polideportivo("San martin", 1000));
        edificios.add(new Polideportivo("Don Juan", 200 ));
        edificios.add(new Polideportivo("san isidro", 350));

        //edificios de oficinas
        edificios.add(new EdificioOficinas(125, 1));
        edificios.add(new EdificioOficinas(340, 2));

        Iterator<Edificio> iterador = edificios.iterator();

        while (iterador.hasNext()) {
            Edificio edificio = iterador.next();

            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Polideportivo - Nombre: " + polideportivo.getNombre() + " - Superficie: " + polideportivo.getSuperficie() + " m2" + " Tipo: " + polideportivo.getTipoDeInstalacion());
            } else if (edificio instanceof EdificioOficinas) {
                EdificioOficinas edificioOficinas = (EdificioOficinas) edificio;
                System.out.println("Edificio de Oficinas - Superficie: " + edificioOficinas.getSuperficie() + " m2 - Numero de Oficinas: " + edificioOficinas.getNumeroDeOficinas());
            }
        }

    }

}
