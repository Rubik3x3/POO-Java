package administracalculo;

public class AdministraCalculo {

	public AdministraCalculo() {}
	
	public static int suma(int num1, int num2) {
		return num1+num2;
	}
	
	public static double suma(double num1, int num2) {
		return num1+num2;
	}
	
	public static double suma(int num1, double num2) {
		return num1+num2;
	}
	
	public static double suma(double num1, double num2) {
		return num1+num2;
	}
	
	public static String suma(String mensaje, int num1) {
		return mensaje + (num1+num1);
	}
	
	public static String suma(int num1, String mensaje) {
		return (num1+num1) + mensaje; 
	}
	
	public static void main(String[] args) {
		System.out.println(suma(1, 5)); // Int Int
		System.out.println(suma(1.5, 5)); // Double Int
		System.out.println(suma(1, 5.3)); // Int Double
		System.out.println(suma(1.2, 5.8)); // Double Double
		System.out.println(suma("1",5)); // String Int
		System.out.println(suma(1,"5")); // Int String
	}

}
