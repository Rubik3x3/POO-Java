package arraylist;

import java.util.ArrayList;

public class Main {

	public static int lengthArray(int[] array) {
		return 10;
	}
	
	public static int[] addElement(int[] array, int element){
		int[] newArray = new int[array.length+1];
		for(int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		newArray[array.length] = element;
		return newArray;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		ArrayList<Double> listaRC = new ArrayList<>();
		listaNumeros.add(64);
		listaNumeros.add(25);
		listaNumeros.add(16);
		listaNumeros.add(81);
		/*
		for (int numero : listaNumeros) {
			double raiz = Math.sqrt(numero);
			listaRC.add(raiz);
		}*/
		
		for(int i = 0; i < listaNumeros.size(); i++) {
			if(i == 2) {
				listaNumeros.set(i, 49);
			}
		}
		System.out.println(listaNumeros);
		System.out.println(listaRC);
		/*
		int[] array1 = new int[1];
		array1[0] = 23;
		int[] arrayNuevo = addElement(array1,50);
		System.out.println(arrayNuevo[1]);
		System.out.println();*/
	}

}
