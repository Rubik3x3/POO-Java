package herencia;

public class Desarrollador extends Empleado {
	private String proyectoActual;
	public Desarrollador(String nombre, String apellido, int dni, String proyectoActual) {
		super(nombre, apellido, dni);
		this.setProyectoActual(proyectoActual);
	}
	
	@Override
	public String toString() {
		return super.toString()+" Desarrollador [proyectoActual=" + proyectoActual + "]";
	}
	public String getProyectoActual() {
		return proyectoActual;
	}
	public void setProyectoActual(String proyectoActual) {
		this.proyectoActual = proyectoActual;
	}
	

	public void aplicarAProyecto() {
		
	}
}
