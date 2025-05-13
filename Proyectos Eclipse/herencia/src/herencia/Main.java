package herencia;

public class Main {

	public static void main(String[] args) {
		Empleado d1 = new Desarrollador("Juan","Pérez",480000001,"Java");
		Empleado d2 = new Desarrollador("Fran","Sánchez",480000002,"Java");
		Empleado d3 = new Desarrollador("Pedro","Talarico",480000003,"Java");
		Empleado g1 = new Gerente("Pedro","Pérez",48000004,"Administrador");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(g1);
	}

}
