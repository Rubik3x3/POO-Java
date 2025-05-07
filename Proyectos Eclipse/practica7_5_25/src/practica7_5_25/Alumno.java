package practica7_5_25;

public class Alumno {
	private String nombre;
	private double promedio;
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", promedio=" + promedio + "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
}
