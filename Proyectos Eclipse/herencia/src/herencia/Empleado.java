package herencia;

public class Empleado {
	private String nombre;
	private String apellido;
	private int dni;
	private double salarioBase;
	
	public Empleado(String nombre,String apellido, int dni, double salarioBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.salarioBase = salarioBase;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", salarioBase="+salarioBase+"]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public double getSalarioBase(){
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario() {
		return salarioBase;
	}
	
}
