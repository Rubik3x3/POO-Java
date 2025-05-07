package tp1;

public class Main {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(1000);
		cuenta1.depositar(1000);
		cuenta1.mostrarSaldo();
		cuenta1.retirar(1500);
		cuenta1.mostrarSaldo();
		cuenta1.retirar(5000);
		cuenta1.mostrarSaldo();
		cuenta1.depositar(-200);
		cuenta1.mostrarSaldo();
	}

}
