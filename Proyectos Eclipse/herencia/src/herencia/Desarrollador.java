package herencia;

public class Desarrollador extends Empleado {
	private String proyectoActual;
	private double bono;

	public Desarrollador(String nombre, String apellido, int dni, double salarioBase, String proyectoActual, double bono) {
		super(nombre, apellido, dni, salarioBase);
		this.proyectoActual = proyectoActual;
		this.bono = bono;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Desarrollador [proyectoActual=" + proyectoActual +" bono="+bono+"]";
	}
	public String getProyectoActual() {
		return proyectoActual;
	}
	public void setProyectoActual(String proyectoActual) {
		this.proyectoActual = proyectoActual;
	}
	
	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}
	

	public void aplicarAProyecto() {
		
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + bono;
	}
}
