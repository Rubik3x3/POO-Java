package encapsulacion;

public class Profesor {
	private String nombreApellido;
	public String personalidad;
	
	public Profesor(String nombreApellido, String personalidad) {
		this.nombreApellido = nombreApellido;
		this.personalidad = personalidad;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getPersonalidad() {
		return personalidad;
	}
	public void setPersonalidad(String personalidad) {
		this.personalidad = personalidad;
	}
	
	@Override
	public String toString() {
		return "Profesor [nombreApellido=" + nombreApellido + ", personalidad=" + personalidad + "]";
	}

}
