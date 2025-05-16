package herencia;

public class Main {

	public static void main(String[] args) {
		/*Empleado d1 = new Desarrollador("Juan","Pérez",480000001,10,"Java",20);
		Empleado d2 = new Desarrollador("Fran","Sánchez",480000002,10,"Java",20);
		Empleado d3 = new Desarrollador("Pedro","Talarico",480000003,10,"Java",20);
		Empleado g1 = new Gerente("Pedro","Pérez",48000004,10,"Administrador",20);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(g1);*/
		Empleado d1 = new Desarrollador("Juan","Sánchez",28886,400000,"APP",100000);
		Empleado g1 = new Gerente("Pedro","Juárez",12345,600000,"Personal",200000);
		Empleado e1 = new Empleado("Zoe","Pérez",18888,800000);
		
		System.out.println(d1);
		System.out.println(g1);
		System.out.println(e1);
		
		System.out.println("El salario es: "+g1.calcularSalario());
		System.out.println("El salario es: "+d1.calcularSalario());
		System.out.println("El salario es: "+e1.calcularSalario());
	}

}
