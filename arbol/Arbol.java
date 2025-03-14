package arbol;

import java.util.*;

public class Arbol {
		
    private String nombre;
    private boolean caducifolio;

    public Arbol(String nombre, boolean caducifolio) {
        this.nombre = nombre;
        this.caducifolio = caducifolio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getCaducifolio() {
        return caducifolio;
    }

    

	@Override
	public String toString() {
		return "Arbol [nombre=" + nombre + ", caducifolio=" + caducifolio + "]";
	}

	public static void main(String[] args) {
		/*	
        Arbol arbol1 = new Arbol("roble", true);

        if (arbol1.getCaducifolio()){
            System.out.println("El arbol " + arbol1.getNombre() + " pierde las hojas en invierno.");
        }
        
        System.out.println(arbol1);
        */
        
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Ingrese el arbol que necesite: ");
    	String auxNombre = sc.nextLine();
    	System.out.print("Ingrese 'true' si es caducifolio, sino igrese 'false': ");
    	boolean auxCaducifolio = sc.nextBoolean();    
    	
    	Arbol arbol2 = new Arbol(auxNombre, auxCaducifolio);
    	
    	System.out.println(arbol2);
    	
	}
}


