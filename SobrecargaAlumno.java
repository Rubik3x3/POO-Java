package proyectoscqm;

import java.util.Scanner;

public class Alumno {
	private String nombreApellido;
	private int DNI;
	private double notaFinal;
	
	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	@Override
	public String toString() {
		return "Alumno [nombreApellido=" + nombreApellido + ", DNI=" + DNI + ", notaFinal=" + notaFinal + "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno1 = new Alumno(sc);
		Alumno alumno2 = new Alumno("Juan Pérez",47333234,7.5);
		Alumno alumno3 = new Alumno("Pedro Pérez",8.5);
		
		System.out.println(alumno1);
		System.out.println(alumno2);
		System.out.println(alumno3);
		
		if(alumno3.getDNI() == -1) {
			System.out.print("Ingrese DNI de "+alumno3.getNombreApellido()+" (El DNI es igual a -1): ");
			int auxDNI = sc.nextInt();
			alumno3.setDNI(auxDNI);
			System.out.println(alumno3);
		}
	}

	public Alumno(String nombreApellido, int dNI, double notaFinal) {
		super();
		this.nombreApellido = nombreApellido;
		DNI = dNI;
		this.notaFinal = notaFinal;
	}
	
	public Alumno(String nombreApellido, double notaFinal) {
		super();
		this.nombreApellido = nombreApellido;
		DNI = -1;
		this.notaFinal = notaFinal;
	}
	
	public Alumno(Scanner sc) {
		System.out.print("Ingrese nombre y apellido: "); 
		nombreApellido = sc.nextLine();
		System.out.print("Ingrese DNI: ");
		DNI = sc.nextInt();
		System.out.print("Ingrese la nota final: ");
		notaFinal = sc.nextDouble();
	}

}
