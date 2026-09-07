package Ejercicio2;

public class Polideportivo extends Edificio implements Instalacion_Deportiva{
	
	private String nombre; 
	
	public Polideportivo() {
		super(); 
		nombre = "sin nombre"; 
	}
	
	public Polideportivo(String nombre, double superficie) {
		super(superficie); 
		this.nombre = nombre; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int getTipoDeInstalacion() {
		double superficie = super.GetSuperFicieEdificio(); 
		
		if(superficie <= 200)
			return 1; 
		else if(superficie <= 500)
			return 2; 
		else if(superficie <= 1000)
			return 3;
		
		return 0; 
	}

	@Override
	public String toString() {
		return "Polideportivo [nombre=" + nombre + "]";
	}
	
}
