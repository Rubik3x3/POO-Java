package encapsulacion;

public class Main {
	public static void main(String[] args) {
		Alumno a1 = new Alumno("Juan Pérez",8.2);
		Profesor profe = new Profesor("Zoe","Justo");
		a1.setPromedio(-1);
		System.out.println("El promedio de "+a1.getNombreApellido()+" es: "+a1.getPromedio());
		profe.personalidad = "arbitrario";
	}
}
