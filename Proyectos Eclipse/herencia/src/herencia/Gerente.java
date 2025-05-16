package herencia;

public class Gerente extends Empleado{
	private String puesto;
	private double plusJerarquia;

	public Gerente(String nombre, String apellido, int dni, double salarioBase, String puesto, double plusJerarquia) {
		super(nombre, apellido, dni, salarioBase);
		this.puesto = puesto;
		this.plusJerarquia = plusJerarquia;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Gerente [puesto=" + puesto + "plusJerarquia="+plusJerarquia+"] ";
	}
	
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public double getPlusJerarquia() {
		return plusJerarquia;
	}

	public void setPlusJerarquia(double plusJerarquia) {
		this.plusJerarquia = plusJerarquia;
	}
	

	public void controlaProyecto() {
		
	}
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() + plusJerarquia;
	}
}
