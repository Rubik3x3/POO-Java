package practica7_5_25;

import java.util.ArrayList;
import java.util.Arrays;

public class AdminAlumno {
	private ArrayList<Alumno> listaAlumnos;
	private static void arrayList() {
		ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1,8,2,6,5,18));
		System.out.println(listaNumeros);
		listaNumeros.sort(null);
		System.out.println(listaNumeros);
		
		for(int i = 0; i < listaNumeros.size(); i++) {
			if(listaNumeros.get(i) == 8) {
				listaNumeros.set(i, 18);
			}
		}
		System.out.println(listaNumeros);
		listaNumeros.contains(1);
		System.out.println(listaNumeros.indexOf(18));
	}
	
	private static void array() {
		int[] arrayNumeros = new int[5];
		for(int i = 0; i < arrayNumeros.length; i++) {
			if(arrayNumeros[i] == 8) {
				arrayNumeros[i] = 18;
			}
			System.out.println(arrayNumeros[i]);
		}
		
	}
	public static void main(String[] args) {
		array();
	}
}
