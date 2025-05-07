package jubilacion;

import javax.swing.JOptionPane;

public class Jubilacion {
	private static int cantPreguntas;
	private static final String INT_NOMBRE= "PAMI";
	private final int numeroJubilado;
	
	public Jubilacion(){
		cantPreguntas++;
		numeroJubilado = cantPreguntas;
	}
	public int edadMinima() {
		String sexo = JOptionPane.showInputDialog("Ingresar sexo");
		if(sexo.trim().equalsIgnoreCase("F")) {
			return 60;
		}else {
			return 65;
		}
	}
	
	public void cuantoMeFalta(int edad_min) {
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar su edad"));
		if(edad >= edad_min) {
			JOptionPane.showMessageDialog(null, "Ya te podés jubilar");
		}else {
			int aniosFaltantes = edad_min - edad;
			JOptionPane.showMessageDialog(null, "Te faltan "+aniosFaltantes+" años");
		}
		
	}
	public static int preguntasRealizadas() {
		return cantPreguntas;
	}
	
	public int getNumeroJubilado() {
		return numeroJubilado;
	}
	public static void main(String[] args) {
		Jubilacion jubilacion1 = new Jubilacion();
		jubilacion1.cuantoMeFalta(jubilacion1.edadMinima());
		System.out.println("Numero: "+jubilacion1.getNumeroJubilado());
		System.out.println("Para presentar en: "+INT_NOMBRE);
		
		Jubilacion jubilacion2 = new Jubilacion();
		jubilacion2.cuantoMeFalta(jubilacion1.edadMinima());
		System.out.println("Numero: "+jubilacion2.getNumeroJubilado());
		System.out.println("Para presentar en: "+INT_NOMBRE);
		
		System.out.println("Cantidad de preguntas: "+Jubilacion.preguntasRealizadas());
		
	}

}
