package tp1;

public class Cuenta {
	private double saldo; 
	
	public Cuenta(double saldoInicial) { 
		saldo = saldoInicial;
	}
	
	private double getSaldo() { 
		return saldo;
	}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo actual: "+getSaldo());
	}
	
	public void depositar(double monto) {
		if(monto > 0) {
			setSaldo(saldo+monto);
			System.out.println("Dinero depositado: "+monto);
		}else {
			System.out.println("Deposite un valor válido (mayor a 0).");
		}
	}
	
	public void retirar(double monto) {
		if(monto > 0) {
			if(monto > saldo) {
				System.out.println("No tiene saldo suficiente.");
			}else {
				setSaldo(saldo-monto);
				System.out.println("Dinero retirado: "+monto);
			}
		}else {
			System.out.println("No se puede retirar (monto negativo).");
		}
	}
	
}
