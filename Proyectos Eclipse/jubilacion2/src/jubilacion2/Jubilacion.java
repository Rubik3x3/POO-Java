package jubilacion2;

public class Jubilacion {
	private final int numJub;
	private static int cantidadJubilados = 0;
	private String sexo;
	private int edad;
	private static final String INT_NOMBRE = "PAMI";
	public Jubilacion() {
		cantidadJubilados++;
		numJub = cantidadJubilados;
	}
	
	public static void main(String[] args) {
	
	}
}
