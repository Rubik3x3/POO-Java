package interfaz_libro;

import javax.swing.JOptionPane;

public class Libro {
	private String titulo;
	private double precio;
	private int cantidad;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void ingresarLibro() {
		titulo = JOptionPane.showInputDialog("Ingrese el título del libro");
		precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del libro "+titulo));
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos libros de "+titulo+" necesita?"));
		precio = precio*cantidad;
		
		JOptionPane.showMessageDialog(null,"El libro '"+titulo+"' fue cargado exitosamente");
	}
	
	public void mostrarPrecio() {
		JOptionPane.showMessageDialog(null,"recio total: "+precio);
	}

}
