package proyecto1_francotalarico;

public class Saludo {
	
	static String despedida = "Chau";
	public static void main(String[] args) {
		System.out.println("Hola");
		System.out.println("Quinto");
		System.out.println(despedida);
		mensaje("hola");
		
		System.out.println(sumar(10,5));
	}
	public static void mensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static int sumar(int a,int b) {
		int suma = a+b;
		return suma;
	}
}
