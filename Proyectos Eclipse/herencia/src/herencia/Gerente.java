package herencia;

public class Gerente extends Empleado{
	private String puesto;
	
	public Gerente(String nombre, String apellido, int dni, String puesto) {
		super(nombre, apellido, dni);
		this.setPuesto(puesto);
	}
	
	@Override
	public String toString() {
		return super.toString()+" Gerente [puesto=" + puesto + "]";
	}
	
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	

	public void controlaProyecto() {
		
	}
}
