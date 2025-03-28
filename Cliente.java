package coto;

public class Cliente {
	private static final double MAX_DESCUENTO = 6000.00;
	private final double porcentajeDescuento;
	private static int numCliente = 0;
	
	public Cliente(int edad) {
		numCliente++;
		if(edad >= 60) {
			porcentajeDescuento = 0.10;
		}else {
			porcentajeDescuento = 0.05;
		}
	}
	
	public void mostrarPrecio(double precio) {
		double precioFinal = calcularPrecio(precio);
		System.out.println("Cliente: "+numCliente);
		System.out.println("- Precio sin descuento: "+precio);
		System.out.println("- Precio con descuento: "+precioFinal);
		System.out.println("- Descuento: "+(precio-precioFinal));
		System.out.println("- Le corresponde: "+(porcentajeDescuento*100)+"%");
	}
	
	private double calcularPrecio(double precio) {
		double descuento = precio*porcentajeDescuento;
		if(descuento > MAX_DESCUENTO) {
			precio = precio - MAX_DESCUENTO;
		}else {			
			precio = precio - (precio*porcentajeDescuento);
		}
		return precio;
	}
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(59);
		cliente1.mostrarPrecio(650000);
		
		Cliente cliente2 = new Cliente(80);
		cliente2.mostrarPrecio(100);
	}
}
