package encapsulacion;

public class Alumno {
	private String nombreApellido;
	private double promedio;
	
	public Alumno(String nombreApellido, double promedio) {
		this.nombreApellido = nombreApellido;
		this.promedio = promedio;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		if(promedio < 0) {
			this.promedio = promedio*-1;
		}else {			
			this.promedio = promedio;
		}
	}
	
	@Override
	public String toString() {
		return "Alumno [nombreApellido=" + nombreApellido + ", promedio=" + promedio + "]";
	}

}
