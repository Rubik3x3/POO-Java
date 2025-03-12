package proyecto2;

public class Mueble {
	private String material;
	private String color;
	private int cantPatas;
	private boolean reservado;
	private String tipo;

	public Mueble(String material, String color, int cantPatas, boolean reservado, String tipo) {
		this.material = material;
		this.color = color;
		this.cantPatas = cantPatas;
		this.reservado = reservado;
		this.tipo = tipo;
		// color = color1;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public boolean getReservado() {
		return this.reservado;
	}
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCantPatas() {
		return cantPatas;
	}

	public void setCantPatas(int cantPatas) {
		this.cantPatas = cantPatas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Mueble [material=" + material + ", color=" + color + ", cantPatas=" + cantPatas + ", reservado="
				+ reservado + ", tipo=" + tipo + "]";
	}

	public static void main(String[] args) {
		Mueble mueble1 = new Mueble("plastico", "rojo", 4, false, "silla");
		System.out.println(mueble1.getReservado()); 
		mueble1.reservado = mueble1.getColor() == "verde" ? true:false;
		System.out.println(mueble1.getReservado());
		System.out.println(mueble1);
		/*
		if (mueble1.getColor() == "verde") {
			mueble1.reservado = true;
		} else {
			mueble1.reservado = false;
		}
		System.out.println("Reservado: " + mueble1.getReservado());
		*/
	}

}
