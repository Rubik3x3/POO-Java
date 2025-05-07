package interfaz;

import javax.swing.JOptionPane;

public class Ropa {
	private String tipo;
	private int talle;
	/*
	public Ropa(String tipo, int talle) {
		this.tipo = tipo;
		this.talle = talle;	
	}*/

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTalle() {
		return talle;
	}

	public void setTalle(int talle) {
		this.talle = talle;
	}
	
	@Override
	public String toString() {
		return "Ropa [tipo=" + tipo + ", talle=" + talle + "]";
	}
	
	public void pedirDatos() {
		tipo = JOptionPane.showInputDialog("Ingresar tipo de prenda");
		String auxTalle = JOptionPane.showInputDialog("Ingresar talle");
		talle = Integer.parseInt(auxTalle);
	}
	
	public void mostrarDatos() {
		JOptionPane.showMessageDialog(null,"Compró "+tipo+" de talle "+talle);
	}
	public static void main(String[] args) {
		Ropa ropa1 = new Ropa();
		ropa1.pedirDatos();
		ropa1.mostrarDatos();
	}

}
