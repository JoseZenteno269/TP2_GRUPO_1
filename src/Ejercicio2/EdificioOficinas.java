package Ejercicio2;

public class EdificioOficinas extends Edificio {

	private int numeroDeOficinas;

	// Constructores

	public EdificioOficinas() {
		super();
		numeroDeOficinas = 0;
	}

	public EdificioOficinas(double superficie, int numeroDeOficinas) {
		super(superficie);
		this.numeroDeOficinas = numeroDeOficinas;
	}

	// Setters y getters

	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}

	public void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}

	@Override
	public String toString() {
		return "Edificio de Oficinas - Superficie: " + getSuperficie() + " m2 - N° de Oficinas: " + numeroDeOficinas;
	}
}