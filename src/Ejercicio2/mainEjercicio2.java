package Ejercicio2;

import java.util.ArrayList;


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


    }

}
