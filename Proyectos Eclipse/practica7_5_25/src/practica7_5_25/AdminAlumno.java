package practica7_5_25;

import java.util.ArrayList;
import java.util.Arrays;

public class AdminAlumno {
	private ArrayList<Alumno> listaAlumnos;
	
	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1,8,2,6,5));
		System.out.println(listaNumeros);
		listaNumeros.sort(null);
		System.out.println(listaNumeros);
	}
}
